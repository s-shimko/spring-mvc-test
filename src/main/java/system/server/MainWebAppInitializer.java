package system.server;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class MainWebAppInitializer extends AbstractDispatcherServletInitializer
{

    @Override
    protected WebApplicationContext createRootApplicationContext()
    {
        return null;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext()
    {
        XmlWebApplicationContext cxt = new XmlWebApplicationContext();
        cxt.setConfigLocation("/WEB-INF/spring/spring-config.xml");
        return cxt;
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }
}