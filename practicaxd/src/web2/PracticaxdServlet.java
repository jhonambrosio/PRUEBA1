package web2;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PracticaxdServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("loqueandome XD!!!");
	}
}
