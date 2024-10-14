package au.com.fivegn.fresharchive.service;

import au.com.fivegn.fresharchive.dto.TicketDTO;
import au.com.fivegn.fresharchive.model.Tickets;
import au.com.fivegn.fresharchive.repo.TicketRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private ModelMapper modelMapper;

    public TicketDTO getTicketById(int ticketId) {
        Tickets ticket = ticketRepo.getTicketById(ticketId);

        return modelMapper.map(ticket, TicketDTO.class);
    }
}
