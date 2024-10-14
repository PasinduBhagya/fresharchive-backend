package au.com.fivegn.fresharchive.controllers;

import au.com.fivegn.fresharchive.dto.TicketDTO;
import au.com.fivegn.fresharchive.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/getticket/{ticketId}")
    public TicketDTO getTicketById(@PathVariable Integer ticketId){
        return ticketService.getTicketById(ticketId);
    }
}
