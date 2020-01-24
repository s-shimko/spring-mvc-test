package system.server;

import java.io.File;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({"system"})
public class ServerConfig implements WebMvcConfigurer
{
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry)
//    {
//        System.out.println("asdfasdf");
//        registry.addViewController("/login").setViewName("login");
////        registry.addViewController("/registration.html");
////        registry.addViewController("/logout.html");
////        registry.addViewController("/home.html").setViewName("home");
//    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");
//    }

    @Bean
    public InternalResourceViewResolver resolver() {
//        String prefix = new File("").getAbsolutePath()
//            + "\\src\\main\\webapp";
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/pages/");
        vr.setSuffix(".jsp");
        vr.setViewClass(JstlView.class);
        return vr;
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(resolver());
    }

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
}
