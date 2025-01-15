package tripdiary.Qna.service;

import org.springframework.stereotype.Service;
import tripdiary.Qna.repository.QnaRepository;

@Service
public class QnaService {

    private final QnaRepository qnaRepository;

    public QnaService(QnaRepository qnaRepository) {
        this.qnaRepository = qnaRepository;
    }




}
