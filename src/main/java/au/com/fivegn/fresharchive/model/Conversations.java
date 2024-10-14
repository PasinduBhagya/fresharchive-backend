package au.com.fivegn.fresharchive.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conversations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticket_id;

    private Long user_id;
    private String to_emails;
    @Lob
    private String body;
    private Timestamp created_at;
    private Timestamp updated_at;
    private int incoming;
    private int private_status;
    @Column(length = 255)
    private String support_email;
    private int source;
    @Column(length = 255)
    private String from_email;
    @Column(columnDefinition = "json")
    private String cc_emails;
    @Column(columnDefinition = "json")
    private String bcc_emails;
    @Column(columnDefinition = "json")
    private String attachments;
}
