package com.practice.springbootbatch.model;

/**
 * Created by rsinghal on 7/6/2018.
 */
public class Marksheet {
    private String stdId;
    private int totalSubMark;

    public Marksheet(String stdId, int totalSubMark){
        this.stdId = stdId;
        this.totalSubMark = totalSubMark;
    }

    public Marksheet() {
    }

    public String getStdId() {

        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public int getTotalSubMark() {
        return totalSubMark;
    }
    public void setTotalSubMark(int totalSubMark) {
        this.totalSubMark = totalSubMark;
    }
}