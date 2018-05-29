package wc2018.data.raw;

import android.arch.persistence.room.Entity;

@Entity
public class Legues {
    private String league_id;
    private String league_name;
    private String country_id;
    private String country_name;
    private String fixures;
    private String scores;
}
