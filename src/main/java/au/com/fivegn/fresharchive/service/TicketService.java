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

    public List<TicketDTO> getAllTickets() {
        List<Tickets> ticketsList = ticketRepo.findAll();
        return modelMapper.map(ticketsList, new TypeToken<List<TicketDTO>>(){}.getType());
    }

    public TicketDTO getTicketById(int ticketId) {
        Tickets ticket = ticketRepo.findById(ticketId).orElse(null);

        return modelMapper.map(ticket, TicketDTO.class);
    }
}
