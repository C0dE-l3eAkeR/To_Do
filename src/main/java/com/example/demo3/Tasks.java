package com.example.demo3;

import java.security.Timestamp;
import java.util.Date;


public class Tasks {
    private int TaskID;
    private String TaskName;
    private Date TaskDate;
    private Timestamp TaskTime;
    private String TaskType ;

    public Tasks(int taskID, String taskName, Date taskDate, Timestamp taskTime, String taskType) {
        this.TaskID = taskID;
        TaskName = taskName;
        TaskDate = taskDate;
        TaskTime = taskTime;
        TaskType = taskType;
    }


    public Tasks(String taskName, String taskType, Date taskDate) {
        TaskName = taskName;
        TaskDate = taskDate;
        TaskType = taskType;
    }

    public int getTaskID() {
        return TaskID;
    }

    public void setTaskID(int taskID) {
        TaskID = taskID;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public Date getTaskDate() {
        return TaskDate;
    }

    public void setTaskDate(Date taskDate) {
        TaskDate = taskDate;
    }

    public Timestamp getTaskTime() {
        return TaskTime;
    }

    public void setTaskTime(Timestamp taskTime) {
        TaskTime = taskTime;
    }

    public String getTaskType() {
        return TaskType;
    }

    public void setTaskType(String taskType) {
        TaskType = taskType;
    }
}
