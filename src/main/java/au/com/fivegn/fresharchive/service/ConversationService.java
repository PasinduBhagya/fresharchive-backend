package au.com.fivegn.fresharchive.service;

import au.com.fivegn.fresharchive.dto.ConversationDTO;
import au.com.fivegn.fresharchive.dto.TicketDTO;
import au.com.fivegn.fresharchive.model.Conversations;
import au.com.fivegn.fresharchive.model.Tickets;
import au.com.fivegn.fresharchive.repo.ConversationRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class ConversationService {
    @Autowired
    private ConversationRepo conversationRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ConversationDTO getConversationsById(int ticketId) {
        Conversations conversations = conversationRepo.getConversationsById(ticketId);

        return modelMapper.map(conversations, ConversationDTO.class);
    }
}

