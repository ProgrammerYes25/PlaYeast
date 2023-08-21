package kr.hs.study.PlaYeast.Service;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.Mappers.PlaYeastMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaYeastServiceImpl implements PlaYeastService{
    @Autowired
    private PlaYeastMapper plaYeastMapper;
    @Override
    public void muiscInsert(MusicDTO dto) {
        plaYeastMapper.muiscInsert(dto);
    }
}
