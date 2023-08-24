package kr.hs.study.PlaYeast.DTO;

import lombok.Data;

import java.util.List;

@Data
public class RollupDTO {
    private String musicArtist = "전체";
    private int count;
    private int sumMusicTime;
    private String time;

}
