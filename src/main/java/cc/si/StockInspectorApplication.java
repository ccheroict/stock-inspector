package cc.si;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class StockInspectorApplication extends SpringBootServletInitializer {

    private static final Logger logger = LogManager.getLogger(StockInspectorApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StockInspectorApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(StockInspectorApplication.class, args);
    }
}
