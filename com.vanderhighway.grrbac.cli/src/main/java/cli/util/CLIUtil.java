package cli.util;

import cli.CLIContainer;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.Scenarios;
import com.vanderhighway.grrbac.patterns.TimeRangeP;
import com.vanderhighway.grrbac.patterns.ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario;
import com.vanderhighway.grrbac.patterns.ValidDayOfYearAllCombinedInstance_To_Scenario;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CLIUtil {

    public static String rolePrettyString(Role role){
        String prettyString = role.getName();
        if(role.getJuniors().size() > 0) {
            List<String> juniors = role.getJuniors().stream().map(x -> x.getName()).collect(Collectors.toList());
            Collections.sort(juniors);
            prettyString += " (inherits " + juniors + ")";
        }
        return prettyString;
    }

    public static String demarcationPrettyString(Demarcation demarcation){
        String prettyString = demarcation.getName();
        if(demarcation.getSubdemarcations().size() > 0) {
            List<String> juniors = demarcation.getSubdemarcations().stream().map(x -> x.getName()).collect(Collectors.toList());
            Collections.sort(juniors);
            prettyString += " (subs: " + juniors + ")";
        }
        return prettyString;
    }

    public static String fromMinutesToHHmm(int minutes) {
        long hours = TimeUnit.MINUTES.toHours(Long.valueOf(minutes));
        long remainMinutes = minutes - TimeUnit.HOURS.toMinutes(hours);
        return String.format("%02d:%02d", hours, remainMinutes);
    }

    public static String getExampleDateScheduleTimeRange(Scenario scenario) {

        // TODO: investigate why somehow this doesn't work anymore.

        List<ValidDayOfYearAllCombinedInstance_To_Scenario.Match> matches1 = new LinkedList(CLIContainer.getInstance().getEngine()
                .getMatcher(ValidDayOfYearAllCombinedInstance_To_Scenario.instance())
                .getAllMatches(null,null,null,scenario));
        if(!matches1.isEmpty()) {
            ValidDayOfYearAllCombinedInstance_To_Scenario.Match match1 = matches1.get(0);
            return match1.getValidDay().getName() + " " +
                    fromMinutesToHHmm(match1.getStarttime()) + "-" +
                    fromMinutesToHHmm(match1.getEndtime());
        } else {
            List<ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.Match> matches2 = new LinkedList(CLIContainer.getInstance().getEngine()
                    .getMatcher(ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.instance())
                    .getAllMatches(null,null,null,scenario));
            if(!matches2.isEmpty()) {
                ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.Match match2 = matches2.get(0);
                return match2.getValidDay().getName() + " " +
                        fromMinutesToHHmm(match2.getStarttime()) + "-" +
                        fromMinutesToHHmm(match2.getEndtime());
            } else {
                return "none"; //Should never happen!
            }
        }
    }

    public static String addDayToDateString(String dateString) throws ParseException {
        Calendar cal = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("d_MMMM_yyyy", Locale.ENGLISH);
        cal.setTime(format.parse(dateString));
        int day = cal.get(Calendar.DAY_OF_WEEK);
        String newDateString = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday").get(day - 1);
        newDateString = newDateString + "_" + dateString;
        return newDateString;
    }

    public static int toMinutes(String time) {
        return (int) ChronoUnit.MINUTES.between(LocalTime.MIDNIGHT, LocalTime.parse(time));
    }

    public static String timeRangePrettyString(TimeRange timeRange) {
        if(timeRange == null) {
            return "";
        }
        if(timeRange instanceof ValidDayTimeRange) {
            return fromMinutesToHHmm(timeRange.getStart()) + "-" +
                    fromMinutesToHHmm(timeRange.getEnd());
        } else {
            return timeRange.getValidDay().getName() + " " +
                    fromMinutesToHHmm(timeRange.getStart()) + "-" +
                    fromMinutesToHHmm(timeRange.getEnd());
        }
    }

    public static Scenario getScenario(List<String> contextNames) throws ModelManipulationException {
        Scenario scenario = null;
        if(contextNames != null) {
            Scenario matchScenario = new Scenario(new HashSet<>());
            for (String contextName: contextNames) {
                matchScenario.add((TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class));
            }
            if(CLIContainer.getInstance().getEngine().getMatcher(Scenarios.instance()).getAllMatches(matchScenario).stream().map(Scenarios.Match::getScenario).collect(Collectors.toSet())
                    .contains(matchScenario)) {
                scenario = matchScenario;
            }
        }
        return scenario;
    }

    // some show commands do not work well with delayUpdatePropagation. This is
    // interesting as no model modifications are being done in those commands...
    public static boolean shouldIgnoreDelayUpdatePropagation(String finalLine) {
        if(finalLine.contains("show scenarios")) {
            return true;
        }
        else if (finalLine.contains("show scenarioinstances")) {
            return true;
        }
        return false;
    }
}
