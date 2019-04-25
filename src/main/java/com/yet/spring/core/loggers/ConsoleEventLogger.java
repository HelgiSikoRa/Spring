package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event eventLogger) {
        System.out.println(eventLogger.toString());
    }
}
