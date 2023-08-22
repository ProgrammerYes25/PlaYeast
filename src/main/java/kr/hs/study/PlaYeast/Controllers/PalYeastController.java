package kr.hs.study.PlaYeast.Controllers;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.Service.PlaYeastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PalYeastController {
    @Autowired
    private PlaYeastService plaYeastService;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/search")
    public String postSearch(){return "search";}
    @GetMapping("/search")
    public String getSearch(Model model){
        List<MusicDTO> list = plaYeastService.allSelect();
        model.addAttribute("list", list);
        return "search";
    }
    @GetMapping("/add")
    public String getAdd(){
        return "add";
    }
    @PostMapping("/add_done")
    public String postAdd(MusicDTO dto){
        System.out.println(dto);
        plaYeastService.muiscInsert(dto);
        return "index";
    }

    @GetMapping("/makeList")
    public String getMakeList(){
        return "make_list";
    }
}
