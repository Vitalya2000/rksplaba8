package servlets.Servlets;


    import servlets.NumConverter;

    import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NumConvertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //int inputradix = Integer.parseInt(req.getParameter("inputradix"));
        String str = req.getParameter("str");
        //int outputradix = Integer.parseInt(req.getParameter("outputradix"));
        //String entry = req.getParameter("entry");
        try {
            //NumConverter converter = new NumConverter(entry, inputradix, outputradix);
            NumConverter converter = new NumConverter(str);
            resp.setCharacterEncoding("utf-8");
            resp.setStatus(200);
            resp.setHeader("Access-Control-Allow-Origin", "*");
            PrintWriter returner = resp.getWriter();
            returner.print(converter.StringOperation(str));
            returner.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/task.html");
        view.forward(req, resp);
    }
}
