package id.web.gandos.OneScheduler;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Collections;

/**
 * Created by rinow on 9/30/2017.
 */
@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Value( "${mongodb.host}" )
    private String host;

    @Value( "${mongodb.port}" )
    private Integer port;

    @Value( "${mongodb.username}" )
    private String username;

    @Value( "${mongodb.password}" )
    private String password;

    @Value( "${mongodb.database}" )
    private String database;

    @Bean
    public ValidatingMongoEventListener validatingMongoEventListener() {
        return new ValidatingMongoEventListener( validator() );
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

    @Override
    public String getDatabaseName() {
        return database;
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient( Collections.singletonList(new ServerAddress( host, port ) ) );
    }
}
