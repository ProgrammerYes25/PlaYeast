package kr.hs.study.PlaYeast.DTO;

import lombok.Data;

@Data
public class MusicDTO {
    int music_id;
    String music_name;
    String music_artist;
    String music_album;
    int music_time;
    int music_track;
    String genre_id;
    String mood_id;
    String weather_id;
    String genre_name;
    String mood_name;
    String weather_name;
}
