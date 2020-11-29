package school.cjlu.common.filter.xss;

import javax.servlet.*;
import java.io.IOException;

/**
 * Author:Young
 * Date:2020/11/29-16:21
 * 有些情况不想显示过滤后的内容的话，可以用StringEscapeUtils.unescapeHtml4()这个方法，
 * 把StringEscapeUtils.escapeHtml4()转义之后的字符恢复原样。
 */
public class XssFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
