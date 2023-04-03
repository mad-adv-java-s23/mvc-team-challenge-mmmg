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

 @WebServlet(name = "easterRaffle", urlPatterns = { "/easterRaffle" })

 public class EasterServlet extends HttpServlet {

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

        // Create an ArrayList of EasterRequestData objects
        List<EasterRequestData> easterRaffleList = new ArrayList<EasterRequestData>();

        // Setting sample information
        EasterRequestData raffleListOne = new EasterRequestData();
        raffleListOne.setName("Ben Smith");
        raffleListOne.setPhone("608-123-4567");
        raffleListOne.setAge(25);
        raffleListOne.setGrade("A");
        easterRaffleList.add(raffleListOne);

        EasterRequestData raffleListTwo = new EasterRequestData();
        raffleListTwo.setName("Jane Doe");
        raffleListTwo.setPhone("608-987-6543");
        raffleListTwo.setAge(30);
        raffleListTwo.setGrade("B");
        easterRaffleList.add(raffleListTwo);

        EasterRequestData raffleListThree = new EasterRequestData();
        raffleListThree.setName("Bob Johnson");
        raffleListThree.setPhone("608-245-9876");
        raffleListThree.setAge(18);
        raffleListThree.setGrade("C");
        easterRaffleList.add(raffleListThree);

        // Set the easterRaffleList as a request attribute
        request.setAttribute("easterRaffleList", easterRaffleList);

        // Forward the request to the JSP for display
        // TODO: Define a route to our JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }
 }
