package kr.hs.study.PlaYeast.Controllers;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.DTO.PlayListDTO;
import kr.hs.study.PlaYeast.DTO.RollupDTO;
import kr.hs.study.PlaYeast.DTO.SearchDTO;
import kr.hs.study.PlaYeast.Service.PlaYeastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Scanner;

@Controller
public class PalYeastController {
    @Autowired
    private PlaYeastService plaYeastService;
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/search")
    public String getSearch(Model model){
        List<MusicDTO> list = plaYeastService.allSelect();
        List<RollupDTO> rollupDTOList = plaYeastService.rollupSelect();
        System.out.println(rollupDTOList);
        model.addAttribute("muiscList", list);
        return "search";
    }

    @PostMapping("/search")
    public String postSearch(SearchDTO dto, Model model){
        List<MusicDTO> muiscList = plaYeastService.nameSelect(dto);
        List<RollupDTO> rollupDTOList = plaYeastService.rollupSelect();
        System.out.println(rollupDTOList);
        model.addAttribute("muiscList", muiscList);

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
        return "redirect:/search";
    }

    @GetMapping("/makeList")
    public String getMakeList(){
        return "make_list";
    }
}
