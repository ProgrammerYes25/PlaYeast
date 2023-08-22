package kr.hs.study.PlaYeast.Service;

import kr.hs.study.PlaYeast.DTO.MusicDTO;

import java.util.List;

public interface PlaYeastService {
    public void muiscInsert(MusicDTO dto);
    public List<MusicDTO> allSelect();
}
