package au.com.fivegn.fresharchive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {
    private int id;
    private int workspace_id;
    private String subject;
    private int group_id;
    private int department_id;
    private String category;
    private String sub_category;
    private String item_category;
    private int requester_id;
    private int responder_id;
    private String due_by;
    private int fr_escalated;
    private int deleted;
    private int spam;
    private int email_config_id;
    private int is_escalated;
    private String fr_due_by;
    private int priority;
    private int status;
    private int source;
    private String created_at;
    private String updated_at;
    private int requested_for_id;
    private String to_emails;
    private String type;
    private String description;
    private String description_text;
    private String custom_fields;
    private int tasks_dependency_type;
    private String fwd_emails;
    private String reply_cc_emails;
    private String cc_emails;
    private String attachments;
    private int assoc_change;
    private int assoc_problem;
}
