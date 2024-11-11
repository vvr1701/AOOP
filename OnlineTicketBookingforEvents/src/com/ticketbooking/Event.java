package com.ticketbooking;

public class Event {
	private String name;
	private String date;
	private int totalTickets;
	private int bookedTickets;
	public Event(String name, String date, int totalTickets) {
		this.name = name;
		this.date = date; 
		this.totalTickets = totalTickets;
		this.bookedTickets = 0;
		}
	public String getName() { 
		return name;
		}
	public String getDate(){
		return date;
		} 
	public int getTotalTickets() {
		return totalTickets;
		}
	public int getBookedTickets() {
		return bookedTickets; 
		}
	public boolean bookTickets(int tickets) { 
		if (tickets <= (totalTickets - bookedTickets)) {
			bookedTickets += tickets;
			return true;
			} 
		else {
			return false; 
			}
	}
}

