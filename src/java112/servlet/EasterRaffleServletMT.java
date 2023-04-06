package java112.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 *  This Servlet creates a collection of EasterRequestData objects and forwards it to a JSP for display.
 *
 * @author mgunsolus
 */

 @WebServlet(name = "easterPrize", urlPatterns = { "/easterPrize" })

 public class EasterRaffleServletMT extends HttpServlet {

    /**
     *  Handles GET requests for the Servlet.
     *
     *@param request the HttpServletRequest object containing the request parameters
     *@param response the HttpServletResponse object containing the response
     *@throws ServletException if there is a Servlet error
     *@throws IOException if there is an IO error
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            EasterRequestData raffle = new EasterRequestData();

            /* Assigns values to the properties of the HttpRequest Data object */
            raffle.setLastName(request.getParameter("your-last-name"));
            raffle.setFirstName(request.getParameter("your-first-name"));
            raffle.setPhone(request.getParameter("your-phone-number"));
            raffle.setAge(Integer.parseInt(request.getParameter("your-age")));

            /* Add HttpRequestData instance to the request instance as an attribute */
            request.setAttribute("userLastName", raffle);
            request.setAttribute("userFirstName", raffle);
            request.setAttribute("userPhone", raffle);
            request.setAttribute("userAge", raffle);

            /*request.getParameter("your-last-name");
            request.getParameter("your-first-name");
            request.getParameter("your-phone-number");
            request.getParameter("your-age");*/





        // Forward the request to the JSP for display
        
        String url = "/easterPrize.jsp";
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
 }
