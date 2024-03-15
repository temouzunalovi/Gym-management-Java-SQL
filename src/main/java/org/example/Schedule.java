package org.example;

import java.util.Date;
import java.util.Set;

public class Schedule {
    private int scheduleId;
    private int memberId;
    private Date date;
    private String activity;

    public Schedule(int scheduleId, int memberId, Date date, String activity){
        this.scheduleId = scheduleId;
        this.memberId = memberId;
        this.date = date;
        this.activity = activity;
    }
    public int getScheduleId(){
        return scheduleId;
    }
    public void setScheduleId(int scheduleId){
        this.scheduleId = scheduleId;
    }
    public int getMemberId(){
        return memberId;
    }
    public void setMemberId(int memberId){
        this.memberId = memberId;
    }
    public Date getDate(){
        return date;
    }
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
