package com.afi.arduinoapp.data

import com.afi.arduinoapp.model.History

object HistoryData {
    private val articleTitle = arrayOf(
        "HeartRate",
        "Spo2",
        "Temp",
        "Result"
    )

    private val spoContent = arrayOf(
        75.0,
        90.0,
        50.0
    )

    private val tempContent = arrayOf(
        35.0,
        30.0,
        36.0
    )

    private val heartContent = arrayOf(
        80,
        90,
        120
    )

    private val resultContent = arrayOf(
        "Hipoksia Ringan",
        "Hipoksia Sedang",
        "Hipoksia Berat"
    )

    val listHistory: ArrayList<History>
        get() {
            val listAtcls = arrayListOf<History>()
            for (position in articleTitle.indices) {
                val articles = History()
                articles.heartRate = heartContent[position]
                articles.spo = spoContent[position]
                articles.temperature = tempContent[position]
                articles.result = resultContent[position]

                listAtcls.add(articles)
            }
            return listAtcls
        }
}