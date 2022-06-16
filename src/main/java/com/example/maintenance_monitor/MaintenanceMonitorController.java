package com.example.maintenance_monitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class MaintenanceMonitorController
{
    MaintenancneMonitor m = new MaintenancneMonitor();
    @RequestMapping("/messagequery")
        public String messagequery()
        {
            return m.getMessage();
        }


}
