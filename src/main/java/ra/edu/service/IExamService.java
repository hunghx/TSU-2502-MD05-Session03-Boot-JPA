package ra.edu.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ra.edu.entity.bt.Exam;

public interface IExamService {
    Page<Exam> findExamPagination(Pageable pageable);
    Exam findById(Long id);
}
