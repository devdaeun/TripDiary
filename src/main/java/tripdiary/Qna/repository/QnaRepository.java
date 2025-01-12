package tripdiary.Qna.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import tripdiary.Qna.entity.QnaList;

public interface QnaRepository extends JpaRepositoriesAutoConfiguration<QnaList, Long> {
}
