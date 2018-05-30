package wc2018.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import wc2018.data.raw.Score;

@Dao
public interface ScoreDao {
    @Insert
    public void insert(Score... scores);

    @Query("SELECT * FROM score")
    public List<Score> getScore();


}
