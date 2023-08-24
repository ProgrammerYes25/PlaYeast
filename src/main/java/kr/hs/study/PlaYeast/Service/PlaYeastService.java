package kr.hs.study.PlaYeast.Service;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.DTO.PlayListDTO;
import kr.hs.study.PlaYeast.DTO.RollupDTO;
import kr.hs.study.PlaYeast.DTO.SearchDTO;

import java.util.List;

public interface PlaYeastService {
    public void musicInsert(MusicDTO dto);
    public void musicUpdate(MusicDTO dto);
    public List<MusicDTO> allSelect();
    public List<MusicDTO> nameSelect(SearchDTO dto);
    public List<RollupDTO> rollupSelect();
    public List<RollupDTO> rollupNameSelect(SearchDTO dto);
    public void musicDelete(int id);
    public MusicDTO musicGet(int id);
    public List<MusicDTO> makeList(PlayListDTO dto);
}
