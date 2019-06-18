package com.codecool.web.servlet;

import com.codecool.web.model.Subscriber;
import com.codecool.web.service.SubscriberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addsubscriberservlet")
public class AddSubscriberServlet extends HttpServlet {

    //private SubscriberService subscribers = new SubscriberService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        //subscribers.addSubscriber(new Subscriber(name, email));
        SubscriberService.subscribers.add(new Subscriber(name, email));

        request.getRequestDispatcher("index.html").forward(request, response);

    }

}
