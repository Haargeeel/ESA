package org.dieschnittstelle.jee.esa.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * checks whether the gui servlet is accessed by a user agent that accepts html
 * @author kreutel
 *
 */
public class TouchpointGUIServletFilter implements Filter {

	protected static Logger logger = Logger
			.getLogger(TouchpointGUIServletFilter.class);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		// check whether we have a an accept-language header that will be set by the browser but not by the apache http client.
		// otherwise reject the request
		String acceptLanguageHeader = ((HttpServletRequest) request)
				.getHeader("accept-language");
		logger.info("got accept-language header: " + acceptLanguageHeader);

		String userAgent = ((HttpServletRequest) request)
				.getHeader("user-agent");
		logger.info("got user-agent header: " + userAgent);

		// we do quite a brute force string match
//		if (acceptLanguageHeader != null && userAgent == null) {
		if (acceptLanguageHeader != null) {
			chain.doFilter(request, response);
		} else {
			// if we do not find the required header, we block access
			((HttpServletResponse) response)
					.setStatus(HttpServletResponse.SC_FORBIDDEN);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
