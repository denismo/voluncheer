package com.voluncheer.web;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class VoluncheerServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
