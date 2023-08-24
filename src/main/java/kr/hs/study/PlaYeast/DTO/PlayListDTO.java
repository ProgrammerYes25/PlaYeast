package kr.hs.study.PlaYeast.DTO;

import lombok.Data;

@Data
public class PlayListDTO {
    String music_name="";
    String music_artist="";
    String music_album="";
    int music_time= 0;
    int music_track =0;
    String genre_id="";
    String mood_id="";
    String weather_id="";
    String genre_name;
    String mood_name;
    String weather_name;
}
