package au.com.fivegn.fresharchive.controllers;

import au.com.fivegn.fresharchive.dto.ConversationDTO;
import au.com.fivegn.fresharchive.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ConversationController {
    @Autowired
    private ConversationService conversationService;

    @GetMapping("/getconversation/{ticketid}")
    public ConversationDTO getConversationsById(@PathVariable int ticketid) {
        return conversationService.getConversationsById(ticketid);
    }
}
