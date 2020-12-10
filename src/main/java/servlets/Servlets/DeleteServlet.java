package servlets.Servlets;


import servlets.Main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Main.penciltable.remove(Integer.parseInt(req.getParameter("id"))-1);
        try {
            resp.setContentType("text/html");
            resp.setStatus(200);
            resp.setHeader("Access-Control-Allow-Origin", "*");
            /*PrintWriter returner = resp.getWriter();
            returner.print("Строка "+req.getParameter("id")+" удалена");
            returner.flush();*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
