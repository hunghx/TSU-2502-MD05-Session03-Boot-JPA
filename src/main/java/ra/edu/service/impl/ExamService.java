package ra.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ra.edu.entity.bt.Exam;
import ra.edu.repository.IExamRepository;
import ra.edu.service.IExamService;

import java.util.NoSuchElementException;

@Service
public class ExamService implements IExamService {
    @Autowired
    private IExamRepository examRepository;
    @Override
    public Page<Exam> findExamPagination(Pageable pageable) {
        return examRepository.findAll(pageable);
    }

    @Override
    public Exam findById(Long id) {
        return examRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Exam with id " + id + " does not exist"));
    }
}
