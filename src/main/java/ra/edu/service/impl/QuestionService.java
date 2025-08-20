package ra.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.edu.entity.bt.Question;
import ra.edu.repository.IQuestionRepository;
import ra.edu.service.IQuestionService;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    private IQuestionRepository questionRepository;
    @Override
    public List<Question> findAllByExamId(Long id) {
        return questionRepository.findAllByExam_Id(id);
    }
}
