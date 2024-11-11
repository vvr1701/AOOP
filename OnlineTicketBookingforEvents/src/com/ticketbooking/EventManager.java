package com.ticketbooking;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        events = new ArrayList<>();
      
        events.add(new Event("Concert", "2024-12-01", 100));
        events.add(new Event("Theater", "2024-12-10", 80));
        events.add(new Event("Comedy Show", "2024-12-15", 50));
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEvent(String name) {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(name)) {
                return event;
            }
        }
        return null;
    }
}
