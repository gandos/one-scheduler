package id.web.gandos.service;

import id.web.gandos.OneScheduler.OneSchedulerApp;
import id.web.gandos.OneScheduler.domain.ArcsightEvent;
import id.web.gandos.OneScheduler.domain.Threat_ce;
import id.web.gandos.OneScheduler.service.ThreatService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by rinow on 9/30/2017.
 */
@RunWith( SpringRunner.class )
@ContextConfiguration( classes = { OneSchedulerApp.class } )
public class ThreatServiceTest {
    @Autowired
    ThreatService service;

    @Test
    public void findEventsByAddressTest() {
        List<ArcsightEvent> o = service.findEventsByAddress( "10.1.1.1" );

        System.out.println( o );
    }
}
