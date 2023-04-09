package java112.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 *  This Servlet creates a collection of EasterRequestData objects and forwards it to a JSP for display.
 *
 * @author mgunsolus & mtimm
 */

 @WebServlet(name = "easterRaffle", urlPatterns = { "/easterRaffle" })

 public class Diagram extends HttpServlet {

    /**
     * Handles GET requests for the Servlet.
     *
     * @param request  the HttpServletRequest object containing the request parameters
     * @param response the HttpServletResponse object containing the response
     * @throws ServletException if there is a Servlet error
     * @throws IOException      if there is an IO error
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Forward the request to the JSP for display
        String url = "/index.html";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    /**
     * Handles POST requests for the Servlet.
     *
     * @param request  the HttpServletRequest object containing the request parameters
     * @param response the HttpServletResponse object containing the response
     * @throws ServletException if there is a Servlet error
     * @throws IOException      if there is an IO error
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve the parameters from the POST request
        String lastName = request.getParameter("your-last-name");
        String firstName = request.getParameter("your-first-name");
        String phone = request.getParameter("your-phone-number");
        int age = Integer.parseInt(request.getParameter("your-age"));

        // Create a new EasterRequestData object with the retrieved parameters
        EasterRequestData raffle = new EasterRequestData();
        raffle.setLastName(lastName);
        raffle.setFirstName(firstName);
        raffle.setPhone(phone);
        raffle.setAge(age);

        // Add the EasterRequestData object as an attribute to the request
        request.setAttribute("easterRequestData", raffle);

        // Assign prize based on age
        if (age >= 0 && age <= 10) {
        request.setAttribute("prize", "You won an Easter basket filled with candies!");
        } else if (age > 10 && age <= 20) {
        request.setAttribute("prize", "You won an Easter themed jewelry set!");
        } else if (age > 20 && age <= 100) {
            request.setAttribute("prize", "You won gourmet Easter chocolates and a wine set!");
        }

        // Forward the request to the JSP for display
        String url = "/diagram.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
