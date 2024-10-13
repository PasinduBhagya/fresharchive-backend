package au.com.fivegn.fresharchive.repo;

import au.com.fivegn.fresharchive.model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Tickets, Integer> {
// Creat the full SQL queries for getTicketByID
}
