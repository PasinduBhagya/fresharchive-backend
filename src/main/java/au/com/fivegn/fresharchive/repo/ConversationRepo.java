package au.com.fivegn.fresharchive.repo;

import au.com.fivegn.fresharchive.model.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepo extends JpaRepository<Conversations, Integer> {
    @Query(value = "SELECT * from conversations where ticket_id=?1", nativeQuery = true)
    Conversations getConversationsById(int ticketId);
}