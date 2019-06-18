package com.codecool.web.listener;

import com.codecool.web.service.SubscriberService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public final class WebappContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("This method is invoked once when the webapp gets deployed.");

        SubscriberService gs = new SubscriberService();
        sce.getServletContext().setAttribute(SubscriberService.class.getName(), gs);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("This method is invoked once when the webapp gets undeployed.");
    }
}
