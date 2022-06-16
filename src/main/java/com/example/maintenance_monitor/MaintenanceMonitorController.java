package com.example.maintenance_monitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class MaintenanceMonitorController
{
    MaintenancneMonitor m = new MaintenancneMonitor();
    @RequestMapping("/getMessage")
        public String getMessage()
        {
            return m.getMessage();
        }


    @RequestMapping("/resetMessage")
        public void resetMessage()
        {
            m.resetMessage();
        }
}
