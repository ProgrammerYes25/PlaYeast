package kr.hs.study.PlaYeast.Service;

import kr.hs.study.PlaYeast.DTO.MusicDTO;
import kr.hs.study.PlaYeast.DTO.RollupDTO;
import kr.hs.study.PlaYeast.DTO.SearchDTO;
import kr.hs.study.PlaYeast.Mappers.PlaYeastMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaYeastServiceImpl implements PlaYeastService{
    @Autowired
    private PlaYeastMapper plaYeastMapper;
    @Override
    public void muiscInsert(MusicDTO dto) {
        System.out.println(dto);
        plaYeastMapper.muiscInsert(dto);
    }

    @Override
    public List<MusicDTO> allSelect() {
        return plaYeastMapper.allSelect();
    }

    @Override
    public List<MusicDTO> nameSelect(SearchDTO dto) {
        return plaYeastMapper.nameSelect(dto);
    }

    @Override
    public List<RollupDTO> rollupSelect() {
        return plaYeastMapper.rollupSelect();
    }

    @Override
    public List<RollupDTO> rollupNameSelect(SearchDTO dto) {
        return plaYeastMapper.rollupNameSelect(dto);
    }

    @Override
    public void musicDelete(int id) {
        System.out.println("id :"+id);
        plaYeastMapper.musicDelete(id);
    }

    public MusicDTO musicGet(int id){
        return plaYeastMapper.musicGet(id);
    }
}
