package com.slort.servlet;

import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.bdb.servlet.BDBHttpServlet;

public class SlortHttpServlet extends HttpServlet {

    public SlortHttpServlet() throws ServletException {
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println(this.getInitParameter("Ambiente"));
	}
    
    
}