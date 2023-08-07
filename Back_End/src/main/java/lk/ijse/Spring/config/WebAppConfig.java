package lk.ijse.Spring.config;

import lk.ijse.Spring.Controller.CustomerController;
import lk.ijse.Spring.advice.AppWideExceptionHandler;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration

@EnableWebMvc
@ComponentScan(basePackageClasses = {CustomerController.class, AppWideExceptionHandler.class})

public class WebAppConfig {

    /*
     * First and foremost we need to configure MultipartResolver
     */
    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    /*
     * You have to override this method and allocate the url and location for uploaded resources
     * */

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**").addResourceLocations("/uploads/");
    }

}
