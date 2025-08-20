package ra.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.edu.entity.bt.Exam;
@Repository
public interface IExamRepository extends JpaRepository<Exam, Long> {
}
