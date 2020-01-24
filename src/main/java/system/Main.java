package system;

import java.io.File;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        String webXmlPath = new File("").getAbsolutePath()
            + "\\src\\main\\webapp";
        System.out.println(webXmlPath);
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("system.server");



        ServletContextHandler contextHandler =
            new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setErrorHandler(null);
        contextHandler.addServlet(new ServletHolder("dispatcher", new DispatcherServlet(context)), "/");
        contextHandler.addEventListener(new ContextLoaderListener(context));
//        contextHandler.setResourceBase(webXmlPath);

        Server server = new Server(8091);
        server.setHandler(contextHandler);
        server.start();
        server.join();
    }


}
