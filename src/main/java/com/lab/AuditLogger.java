package com.lab;

public class AuditLogger {

    public void record(String actor, String action) {
        System.out.println("AUDIT " + actor + " " + action);
    }
}
