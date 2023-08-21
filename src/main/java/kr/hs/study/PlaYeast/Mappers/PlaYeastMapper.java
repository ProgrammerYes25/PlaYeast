package kr.hs.study.PlaYeast.Mappers;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlaYeastMapper {

    public void muiscInsert(MusicDTO dto);
}
