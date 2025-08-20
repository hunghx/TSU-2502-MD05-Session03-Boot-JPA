package ra.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.edu.service.IExamService;

@Controller
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    private IExamService examService;
    // danh sách phân trang
    @GetMapping
    public String listExam(@PageableDefault(page = 0,size=5) Pageable pageable, Model model){
        model.addAttribute("page", examService.findExamPagination(pageable));
        return "exam/examList";
    }
}
