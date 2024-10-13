package au.com.fivegn.fresharchive.repo;

import au.com.fivegn.fresharchive.model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface TicketRepo extends JpaRepository<Tickets, Integer> {
    // Create the full SQL queries for getTicketByID
    // select * from tickets where id=5
    // select * from conversations where ticket_id=5
    @Query(value = "SELECT t.id AS ticket_id, c.id AS conversation_id, t.*, c.*\n" +
            "FROM tickets t\n" +
            "JOIN conversations c ON t.id = c.ticket_id\n" +
            "WHERE t.id = ?1", nativeQuery = true)
    Tickets getTicketById(int id);
}