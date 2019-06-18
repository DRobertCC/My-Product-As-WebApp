package com.codecool.web.servlet;

import com.codecool.web.model.Subscriber;
import com.codecool.web.service.SubscriberService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/listsubscriberservlet")
public class ListSubscriberServlet extends HttpServlet {

    //private SubscriberService subscriberService = new SubscriberService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        //List<Subscriber> subscribers = subscriberService.getSubscribers();

        // add subscribers to the request
        request.setAttribute("SUBSCRIBERS_LIST", SubscriberService.subscribers);

        // send to JSP page (View)
        request.getRequestDispatcher("/list-subscribers.jsp").forward(request, response);

    }


}
