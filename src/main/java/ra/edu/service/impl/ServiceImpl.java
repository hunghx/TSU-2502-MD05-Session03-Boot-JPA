package ra.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ra.edu.entity.Student;
import ra.edu.repository.IStudentRepository;
import ra.edu.service.IService;

import java.util.List;
@Service
public class ServiceImpl implements IService { // hibernate
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> findAll() {

        // Phân trang : pageNumber và pageSize : PageAble
        Pageable pageable = PageRequest.of(1, 5);
        Page<Student> page =  iStudentRepository.findAll(pageable);
        return List.of();
    }
}
