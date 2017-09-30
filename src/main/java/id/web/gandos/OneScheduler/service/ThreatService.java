package id.web.gandos.OneScheduler.service;

import id.web.gandos.OneScheduler.domain.ArcsightEvent;
import id.web.gandos.OneScheduler.domain.Threat_ce;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by rinow on 9/30/2017.
 */
@Service
public class ThreatService {

    static Logger logger = Logger.getLogger( ThreatService.class );

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<ArcsightEvent> findEventsByAddress(String address ) {
        Query query = new Query();
        query.addCriteria( new Criteria().orOperator( Criteria.where( "Attacker_Address" ).is( address ),  Criteria.where( "Target_Address" ).is( address ) ) );

        List<ArcsightEvent> result = mongoTemplate.find( query, ArcsightEvent.class );

        return result;
    }
}
