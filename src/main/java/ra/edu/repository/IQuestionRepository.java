package ra.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.edu.entity.bt.Exam;
import ra.edu.entity.bt.Question;

import java.util.List;

@Repository
public interface IQuestionRepository extends JpaRepository<Question,Long> {
    List<Question> findAllByExam_Id(Long id);
}
