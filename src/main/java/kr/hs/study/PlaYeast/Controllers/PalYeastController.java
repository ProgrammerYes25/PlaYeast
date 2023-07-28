package kr.hs.study.PlaYeast.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalYeastController {
    @PostMapping("/search")
    public String postSearch(){
        return "search";
    }
    @GetMapping("/search")
    public String getSearch(){
        return "search";
    }
    @GetMapping("/add")
    public String getAdd(){
        return "add";
    }
    @GetMapping("/makeList")
    public String getMakeList(){
        return "make_list";
    }
}
