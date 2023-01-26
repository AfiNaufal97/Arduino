package com.afi.arduinoapp.model

import androidx.room.Entity
import java.util.*

@Entity(tableName = "history")
data class History(
    var id_history : Int? = null,
    var heartRate : Int? = null,
    var spo : Double? = null,
    var temperature : Double? = null,
    var result : String? = null,
    var time_stamp : Date? = null
)
