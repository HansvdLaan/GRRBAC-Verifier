package generators.datatypes;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestSuite {

    private String name;
    private String outputDirectory;
    private List<TestCase> cases;

    public TestSuite() {}

    public TestSuite(String name, String outputDirectory) {
        this.name = name;
        this.outputDirectory = outputDirectory;
        this.cases = new LinkedList<>();
    }

    public TestSuite(String name, String outputDirectory, List<TestCase> cases) {
        this.name = name;
        this.outputDirectory = outputDirectory;
        this.cases = cases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public List<TestCase> getCases() {
        return cases;
    }

    public void setCases(List<TestCase> cases) {
        this.cases = cases;
    }

    public void addCase(TestCase testCase) {
        this.cases.add(testCase);
    }

    public void addCases(Collection<TestCase> testCases) {
        this.cases.addAll(testCases);
    }
}
