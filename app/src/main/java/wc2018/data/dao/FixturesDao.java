package wc2018.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import wc2018.data.raw.Fixtures;

@Dao
public interface FixturesDao {
    @Insert
    public void insert(Fixtures... fixtures);

    @Query("SELECT * FROM fixtures")
    public List<Fixtures> getFixtures();

}
