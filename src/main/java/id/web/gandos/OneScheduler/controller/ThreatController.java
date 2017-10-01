package id.web.gandos.OneScheduler.controller;

import id.web.gandos.OneScheduler.domain.ArcsightEvent;
import id.web.gandos.OneScheduler.service.ThreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rinow on 10/1/2017.
 */
@RestController
public class ThreatController {

    @Autowired
    private ThreatService threatService;

    @RequestMapping( "events" )
    public List<ArcsightEvent> findEventsByAddress( @RequestParam String address ) {
        return threatService.findEventsByAddress( address );
    }
}
