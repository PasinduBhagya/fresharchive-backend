package au.com.fivegn.fresharchive.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {

    private Long id;
    private Long workspace_id;
    @Column(length = 255)
    private String subject;
    private Long group_id;
    private Long department_id;
    @Column(length = 255)
    private String category;
    @Column(length = 255)
    private String sub_category;
    @Column(length = 255)
    private String item_category;
    private Long requester_id;
    private Long responder_id;
    private Timestamp due_by;
    private Boolean fr_escalated;
    private Boolean deleted;
    private Boolean spam;
    private Long email_config_id;
    private Boolean is_escalated;
    private Timestamp fr_due_by;
    private Integer priority;
    private Integer status;
    private Integer source;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Long requested_for_id;
    @Column(columnDefinition = "json")
    private String to_emails;
    @Column(length = 50)
    private String type;
    @Lob
    private String description;
    @Column(columnDefinition = "text")
    private String description_text;
    @Column(columnDefinition = "json")
    private String custom_fields;
    private Integer tasks_dependency_type;
    @Column(columnDefinition = "json")
    private String fwd_emails;
    @Column(columnDefinition = "json")
    private String reply_cc_emails;
    @Column(columnDefinition = "json")
    private String cc_emails;
    @Column(columnDefinition = "json")
    private String attachments;
    private Long assoc_change;
    private Long assoc_problem;
}
