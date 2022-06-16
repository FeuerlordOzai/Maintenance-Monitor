package com.example.maintenance_monitor;

public class MaintenancneMonitor {

    private static final String DEFAULT_MESSAGE = "Message wurde geresettet";
    private String message;
    public String getMessage()
    {
        return message;
    }

    public void resetMessage()
    {
        message = DEFAULT_MESSAGE;
    }

    public void setMessage(String m)
    {
        message = m;
    }


}
