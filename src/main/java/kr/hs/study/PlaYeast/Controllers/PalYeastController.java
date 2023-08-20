package kr.hs.study.PlaYeast.Controllers;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.Service.PlaYeastService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalYeastController {
    private PlaYeastService plaYeastService;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/search")
    public String postSearch(){return "search";}
    @GetMapping("/search")
    public String getSearch(){
        return "search";
    }
    @GetMapping("/add")
    public String getAdd(){
        return "add";
    }
    @PostMapping("/add_done")
    public String PostAdd(MusicDTO dto){
        System.out.println(dto);
        plaYeastService.muiscInsert(dto);
        return "index";
    }

    @GetMapping("/makeList")
    public String getMakeList(){
        return "make_list";
    }
}
