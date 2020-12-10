package servlets;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import servlets.Servlets.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static ArrayList<HashMap<String,String>> penciltable;

    public static void main(String[] args) throws Throwable {
        penciltable= new ArrayList<>();
        Server server = new Server(8080);
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setResourceBase("C:/Users/ertt2/IdeaProjects/lab3/src/main/resources/");
        webapp.setParentLoaderPriority(true);
        webapp.addServlet(IndexServlet.class, "/index2");
        webapp.addServlet(TableServlet.class, "/table");
        webapp.addServlet(TaskServlet.class, "/task");
        webapp.addServlet(NumConvertServlet.class, "/post");
        webapp.addServlet(DeleteServlet.class, "/delete");
        webapp.addServlet(UpdateServlet.class, "/update");
        webapp.addServlet(InsertServlet.class, "/insert");
        webapp.addServlet(LoadTable.class, "/table/load");
        server.setHandler(webapp);
        server.start();
        System.out.println("Сокет создан на порту 8080 - ждем запросов от клиентов");
    }
}
