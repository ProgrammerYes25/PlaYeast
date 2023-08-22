package kr.hs.study.PlaYeast.Mappers;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.DTO.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlaYeastMapper {

    public void muiscInsert(MusicDTO dto);
    public List<MusicDTO> allSelect();
    public List<MusicDTO> nameSelect(SearchDTO dto);
}
