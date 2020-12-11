package generators.datatypes;

import java.util.*;

public class TestSuiteCollection {

    private String name;
    private List<TestSuite> suites;

    public TestSuiteCollection () {}

    public TestSuiteCollection(String name) {
        this.name = name;
        this.suites = new LinkedList<>();
    }

    public TestSuiteCollection(String name, List<TestSuite> suites) {
        this.name = name;
        this.suites = suites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TestSuite> getSuites() {
        return suites;
    }

    public void setSuites(List<TestSuite> suites) {
        this.suites = suites;
    }

    public void addSuite(TestSuite suite) {
        this.suites.add(suite);
    }

    public void addSuites(Collection<TestSuite> suites) {
        this.suites.addAll(suites);
    }

    public void addSuites(TestSuite... suites) {
        this.suites.addAll(Arrays.asList(suites));
    }
}
