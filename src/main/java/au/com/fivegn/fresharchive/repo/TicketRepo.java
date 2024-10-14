package au.com.fivegn.fresharchive.repo;

import au.com.fivegn.fresharchive.model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface TicketRepo extends JpaRepository<Tickets, Integer> {
    @Query(value = "select * from tickets where id=?1", nativeQuery = true)
    Tickets getTicketById(int id);
}