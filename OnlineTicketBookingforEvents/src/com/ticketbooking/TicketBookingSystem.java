package com.ticketbooking;

import java.util.ArrayList; 
import java.util.Scanner;

public class TicketBookingSystem {
	private ArrayList<Event> events;
	public TicketBookingSystem() {
		events = new ArrayList<>();
		}
	public void addEvent(Event event) {
		events.add(event);
		}
	public void showEvents() {
		System.out.println("Available Events:");
		for (Event event : events) {
			System.out.println("Event: " + event.getName() + ", Date: " + event.getDate() + ", Available Tickets: " + (event.getTotalTickets() - event.getBookedTickets()));
			}
		}
	public Event findEventByName(String name) {

		for (Event event : events) { 
			if (event.getName().equalsIgnoreCase(name)) {
				return event;
				}
			}
		return null;
	}
	public static void main(String[] args) {
		TicketBookingSystem system = new TicketBookingSystem(); 
		system.addEvent(new Event("Concert", "2024-11-25", 100));
		system.addEvent(new Event("Theater Play", "2024-12-05", 50));
		system.addEvent(new Event("Football Match", "2024-11-30", 200));
		Scanner scanner = new Scanner(System.in); 
		while (true) { 
			system.showEvents();
			System.out.print("Enter event name to book tickets (or 'exit' to quit): ");
			String eventName = scanner.nextLine(); 
			if (eventName.equalsIgnoreCase("exit")) {
				break;
				}
			Event event = system.findEventByName(eventName);
			if (event != null) {
				System.out.print("Enter number of tickets to book: ");
				int tickets = scanner.nextInt();
				scanner.nextLine();
				if (event.bookTickets(tickets)) {
					System.out.println("Tickets booked successfully!");
					} 
				else {
					System.out.println("Not enough tickets available.");
					}
				}
			else {
				System.out.println("Event not found."); 
				}
			}
		scanner.close();
	
}
}