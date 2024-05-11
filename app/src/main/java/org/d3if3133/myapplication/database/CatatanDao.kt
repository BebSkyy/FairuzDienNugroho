package org.d3if3133.myapplication.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import org.d3if3133.myapplication.model.Catatan
import kotlinx.coroutines.flow.Flow
@Dao
interface CatatanDao {
    @Insert
    suspend fun insert(catatan: Catatan)
    @Update
    suspend fun update(catatan: Catatan)
    @Query("SELECT * FROM catatan ORDER BY tanggal Desc")
    fun getCatatan(): Flow<List<Catatan>>
    @Query("SELECT * FROM catatan WHERE id = :id")
    suspend fun getCatatanById(id: Long): Catatan?
    @Query("DELETE FROM catatan WHERE id = :id")
    suspend fun deleteById(id: Long)
}