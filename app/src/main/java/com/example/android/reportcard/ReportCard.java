package com.example.android.reportcard;

/**
 * Created by artem on 09.10.2017.
 */

public class ReportCard {

    private String mName;
    private int mDevelopmentGrade;
    private int mTestingGrade;


    public ReportCard (String studName, int devGrade, int testGrade) {
        mName = studName;
        mDevelopmentGrade = devGrade;
        mTestingGrade = testGrade;
    }

    public String getName() {
        return mName;
    }

    public void setName (String name) {
        mName = name;
    }


    public int getDevelopmentGrade () {
        return mDevelopmentGrade;
    }

    public void setDevelopmentGrade (int grade) {
        mDevelopmentGrade = grade;
    }


    public int getTestingGrade() {
        return mTestingGrade;
    }

    public void setTestingGrade (int grade) {
        mTestingGrade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + getName () + "\n" + "Development: " + getDevelopmentGrade() + "\n" + "Testing: " + getTestingGrade() + "\n\n";
    }



}
