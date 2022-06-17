package com.example.maintenance_monitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class MaintenanceMonitorApplicationTests {
    //sut steht für System under Test
    MaintenancneMonitor sut = new MaintenancneMonitor();
    @Test
    void getMessage_noMessageSet_returnsEmptyString() {

        String expected = "";

        String result = sut.getMessage();

        assertEquals(expected,result);
    }

    @Test
    void setMessage_MessageProvided_setsMessage() {

        String expected = "El Clasico";
        sut.setMessage(expected);
        String result = sut.getMessage();

        assertEquals(expected,result);
    }

    @Test
    void resetMessage() {
        //Es wäre ein brüchiger Test, wenn ich auf einen genauen Wert vergleichen würde deshalb verwende ich assertNotEquals!
        String given = "Hello";
        sut.setMessage(given);
        sut.resetMessage();
        String result = sut.getMessage();

        assertNotEquals(given,result);
    }
}
