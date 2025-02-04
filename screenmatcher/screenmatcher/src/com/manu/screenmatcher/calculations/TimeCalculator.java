package com.manu.screenmatcher.calculations;
import com.manu.screenmatcher.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }
/*
 public void includes(Movie m) {
        totalTime += m.getDurationInMinutes();
    }

    public void includes(Serie s) {
        totalTime += s.getDurationInMinutes();
    }
 */
    public void includes(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }

}
