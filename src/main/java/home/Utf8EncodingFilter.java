package home;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Utf8EncodingFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain next)
        throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        //response.setCharacterEncoding("utf-8");
        next.doFilter(request, response);
    }

    public void destroy(){}
}
