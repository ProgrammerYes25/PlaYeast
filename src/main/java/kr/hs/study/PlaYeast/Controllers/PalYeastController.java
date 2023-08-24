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
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/musicList")
    public String getSearch(Model model){
        List<MusicDTO> list = plaYeastService.allSelect();
        List<RollupDTO> rollupList = plaYeastService.rollupSelect();
        System.out.println(rollupList);
        for(int i =0; i < rollupList.size(); i++){
            RollupDTO rdto = rollupList.get(i);
            int t = rdto.getSumMusicTime();
            rdto.setTime((t/60)/60+":"+(t/60)%60+":"+t%60);
        }
        model.addAttribute("rollupList", rollupList);
        model.addAttribute("musicList", list);
        System.out.println(model);
        return "search";
    }
    @GetMapping("/search")
    public  String getSearch(){
        return "redirect:/musicList";
    }

    @GetMapping("/playList")
    public String getPlayList(Model model){
        List<MusicDTO> list = plaYeastService.allSelect();
        List<RollupDTO> rollupList = plaYeastService.rollupSelect();
        System.out.println(rollupList);
        for(int i =0; i < rollupList.size(); i++){
            RollupDTO rdto = rollupList.get(i);
            int t = rdto.getSumMusicTime();
            rdto.setTime((t/60)/60+":"+(t/60)%60+":"+t%60);
        }
        model.addAttribute("rollupList", rollupList);
        model.addAttribute("musicList", list);
        System.out.println(model);
        return "playList";
    }

    @PostMapping("/playList")
    public String poatPlayList(PlayListDTO dto, Model model){
        List<MusicDTO> list = plaYeastService.makeList(dto);
//        List<RollupDTO> rollupList = plaYeastService.rollupSelect();
//        System.out.println(rollupList);
//        for(int i =0; i < rollupList.size(); i++){
//            RollupDTO rdto = rollupList.get(i);
//            int t = rdto.getSumMusicTime();
//            rdto.setTime((t/60)/60+":"+(t/60)%60+":"+t%60);
//        }
//        model.addAttribute("rollupList", rollupList);
        model.addAttribute("musicList", list);
        System.out.println(model);
        return "playList";
    }

    @PostMapping("/search")
    public String postSearch(SearchDTO dto, Model model){
        List<MusicDTO> musicList = plaYeastService.nameSelect(dto);
        List<RollupDTO> rollupList = plaYeastService.rollupNameSelect(dto);
        System.out.println(rollupList);
        for(int i =0; i < rollupList.size(); i++){
           RollupDTO rdto = rollupList.get(i);
           int t = rdto.getSumMusicTime();
           rdto.setTime((t/60)/60+":"+(t/60)%60+":"+t%60);
        }
        model.addAttribute("rollupList", rollupList);
        model.addAttribute("musicList", musicList);

        return "search";
    }

    @GetMapping("/add")
    public String getAdd(){
        return "add";
    }
    @PostMapping("/add_done")
    public String postAdd(MusicDTO dto){
        System.out.println(dto);
        plaYeastService.musicInsert(dto);
        return "redirect:/musicList";
    }

    @GetMapping("/makeList")
    public String getMakeList(){
        return "make_list";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        System.out.println("id :"+id);
        MusicDTO musicGet = plaYeastService.musicGet(id);
        System.out.println("musicGet :"+musicGet);
        model.addAttribute("musicGet", musicGet);
        return "update";
    }
    @PostMapping("/update")
    public String postUpdate(MusicDTO dto){
        System.out.println(dto);
        plaYeastService.musicUpdate(dto);
        return "redirect:/musicList";
    }

    @GetMapping("/delete/{id}")
    public String delect(@PathVariable("id") int id){
        System.out.println("id :"+id);
        plaYeastService.musicDelete(id);
        return "redirect:/musicList";
    }
}
