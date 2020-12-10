package servlets.Servlets;


import servlets.Main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class InsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String,String> newrow = new HashMap<>();
        newrow.put("mod",req.getParameter("mod"));
        newrow.put("col",req.getParameter("col"));
        Main.penciltable.add(newrow);
        try {
            resp.setContentType("text/html");
            resp.setStatus(200);
            resp.setHeader("Access-Control-Allow-Origin", "*");
            /*PrintWriter returner = resp.getWriter();
            returner.print(Main.penciltable.size()+" Cтрока добавлена</br>");
            returner.print("Данные:</br> Дата производства карандаша: "+req.getParameter("mod")+"</br>Цвет карандаша: "+req.getParameter("col"));
            returner.flush();*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
