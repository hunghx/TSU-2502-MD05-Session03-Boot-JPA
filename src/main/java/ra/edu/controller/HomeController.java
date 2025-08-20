package ra.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.edu.service.IService;

@Controller
public class HomeController {
    @Autowired
    private IService iService;
    @GetMapping("/home")
    public String home(
//            @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber,
//            @RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
//            @RequestParam("sort")  String sort,
//            @RequestParam("direction")   String direction,
            @PageableDefault(page = 0, size = 5) Pageable pageable,
            Model model) {
//        Sort sortField = null;
//        if (direction.equals("asc")) {
//            sortField = Sort.by(Sort.Direction.ASC, direction);
//        }
//        else if (direction.equals("desc")) {
//            sortField = Sort.by(Sort.Direction.DESC, direction);
//        }
//        Pageable pageable1 = PageRequest.of(pageNumber,pageSize, Sort.Direction.ASC, direction);
//        model.addAttribute("title", "Home");
//        iService.findAll();
        return "home";
    }
}
