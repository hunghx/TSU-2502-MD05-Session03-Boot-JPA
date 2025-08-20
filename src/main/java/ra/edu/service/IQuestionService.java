package ra.edu.service;

import ra.edu.entity.bt.Question;

import java.util.List;

public interface IQuestionService {
    List<Question> findAllByExamId(Long id);
}
