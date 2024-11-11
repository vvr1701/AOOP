import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/submit-booking")
public class TicketBookingServlet extends HttpServlet {
    private EventManager eventManager = new EventManager(); // Initialize event manager

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String eventName = request.getParameter("event");
        int ticketCount = Integer.parseInt(request.getParameter("tickets"));

        Event event = eventManager.getEvent(eventName);

        // Prepare response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (event != null && event.bookTickets(ticketCount)) {
            out.println("<html><body>");
            out.println("<h2>Booking Summary</h2>");
            out.println("<p>Event: " + event.getName() + "</p>");
            out.println("<p>Date: " + event.getDate() + "</p>");
            out.println("<p>Number of Tickets: " + ticketCount + "</p>");
            out.println("<p>Thank you for booking with us!</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Booking Failed</h2>");
            out.println("<p>Not enough tickets available for " + eventName + ".</p>");
            out.println("</body></html>");
        }
    }
}
