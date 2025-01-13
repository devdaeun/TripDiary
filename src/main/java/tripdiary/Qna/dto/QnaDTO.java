package tripdiary.Qna.dto;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "qna_question")
public class QnaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    private int qna_id;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime write_date;

    @Column(nullable = false)
    private LocalDateTime edit_date;

    @Column(nullable = false)
    private String  secret;

    @Column(nullable = false)
    private int secret_code ;

    @PreUpdate
    public void onUpdate() {this.edit_date =LocalDateTime.now();}

}
