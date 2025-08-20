package ra.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.edu.service.IExamService;
import ra.edu.service.IQuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private IQuestionService questionService;
    @Autowired
    private IExamService examService;
    @GetMapping("/exam/{id}")
    public String findExamById(@PathVariable Long id, Model model) {
        model.addAttribute("questions", questionService.findAllByExamId(id));
        model.addAttribute("examTitle", examService.findById(id).getTitle());
        return "exam/questionList";
    }
}
