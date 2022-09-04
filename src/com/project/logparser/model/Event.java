package com.project.logparser.model;

import com.project.logparser.model.Action;
import com.project.logparser.model.ActionState;

import java.util.Date;

public class Event {

    private String source;
    private Date date;
    private String destination;
    private Action action;
    private ActionState actionState;

}
