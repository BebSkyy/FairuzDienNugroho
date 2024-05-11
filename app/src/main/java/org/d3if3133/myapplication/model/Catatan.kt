package org.d3if3133.myapplication.model

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "catatan")
data class Catatan(
    @PrimaryKey(autoGenerate = true)
    @DrawableRes
    val id: Long = 0L,
    val judul: String,
    val catatan: String,
    val tanggal: String,
)

