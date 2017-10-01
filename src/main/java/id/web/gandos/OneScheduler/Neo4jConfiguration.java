package id.web.gandos.OneScheduler;

import org.neo4j.ogm.drivers.http.driver.HttpDriver;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by rinow on 10/1/2017.
 */
@Configuration
@EnableTransactionManagement
public class Neo4jConfiguration {

    @Value( "${neo4j.URI}" )
    private String uri;

    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration();
        configuration.driverConfiguration().setDriverClassName( HttpDriver.class.getName() );
        configuration.driverConfiguration().setURI( uri );

        return configuration;
    }

    @Bean
    public SessionFactory sessionFactory(org.neo4j.ogm.config.Configuration configuration) {
        return new SessionFactory(configuration, "id.web.gandos.OneScheduler.domain" );
    }

    @Bean
    public Neo4jTransactionManager neo4jTransactionManager(SessionFactory sessionFactory) {
        return new Neo4jTransactionManager(sessionFactory);
    }
}
