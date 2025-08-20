package ra.edu.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ra.edu.entity.Student;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface IStudentRepository extends JpaRepository<Student, String> {
//    Optional<Student> findByFirstName(String name);

    // định nghĩa các phương thức truy vấn (trừu tượng)
    // cach 1 : đặt tên theo quy tắc
    // findBy, findAllBy, ExistBy, CountBy, ...

    // tìm kiếm theo tên hoặc họ
    List<Student> findByLastNameOrFirstName(String lastName, String firstName);
    // Xóa tất cả sinh viên có họ trùng khớp
    //    @Transactional
    //    @Modifying // định nghĩa lại
    //    @Query("DELETE FROM Student s WHERE s.lastName = :lastName")
    //    void deleteByLastName(@Param("lastName") String lastName);

    Page<Student> findByFirstNameContainingIgnoreCase(String firstName, Pageable pageable);

}
