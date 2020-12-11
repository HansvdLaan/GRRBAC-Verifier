package generators.datatypes;

import java.util.List;

public class TestSuiteCollectionCounter {

    private String collectionName;
    private int suiteCounter;
    private int caseCounter;

    public TestSuiteCollectionCounter() {};

    public TestSuiteCollectionCounter(String collectionName) {
        this.collectionName = collectionName;
        this.suiteCounter = 0;
        this.caseCounter = 0;
    }

    public int getSuiteCounter() {
        return suiteCounter;
    }

    public void setSuiteCounter(int suiteCounter) {
        this.suiteCounter = suiteCounter;
    }

    public int getCaseCounter() {
        return caseCounter;
    }

    public void setCaseCounter(int caseCounter) {
        this.caseCounter = caseCounter;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
}
