package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorityController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
	}
	
	@Override
	public void init() throws ServletException {
		//���⿡ dbĿ��Ʈ �ϸ� ��.
	}
	
	@Override
	public void destroy() {
		//dbĿ��Ʈ ���� ���� ���� �� ��.
	}
	
}
