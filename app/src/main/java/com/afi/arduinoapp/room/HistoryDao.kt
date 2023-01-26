package com.afi.arduinoapp.room

import androidx.room.*
import com.afi.arduinoapp.model.History

@Dao
interface HistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: History)

    @Delete
    fun delete(data: History)

    @Delete
    fun delete(data: List<History>)

    @Update
    fun update(data: History): Int

    @Query("SELECT * from history ORDER BY id_history DESC")
    fun getAll(): List<History>

    @Query("SELECT * FROM history WHERE id_history = :id LIMIT 1")
    fun getProduk(id: Int): History

    @Query("DELETE FROM history WHERE id_history = :id")
    fun deleteById(id: String): Int

    @Query("DELETE FROM history")
    fun deleteAll(): Int


}