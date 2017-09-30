package id.web.gandos.OneScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by rinow on 9/30/2017.
 */

@SpringBootApplication
@Import( {MongoConfiguration.class } )
@PropertySource( "classpath:application.properties" )
public class OneSchedulerApp {
    public static void main(String[] args) {
        SpringApplication.run( OneSchedulerApp.class, args );
    }
}
