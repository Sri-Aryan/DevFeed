package com.example.newsapiapp

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class Utils {

    companion object {
        const val API_KEY = "59887360d733454cb6d18c1b784644be"
        const val BASE_URL = "https://newsapi.org"

        fun DateFormat(oldstringDate: String?): String? {
            val newDate: String?
            val dateFormat = SimpleDateFormat("E, d MMM yyyy", Locale(getCountry()))
            newDate = try {
                val date = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(oldstringDate)
                dateFormat.format(date)
            } catch (e: ParseException) {
                e.printStackTrace()
                oldstringDate
            }
            return newDate
        }

        fun getCountry(): String {
            val locale = Locale.getDefault()
            val country = java.lang.String.valueOf(locale.country)
            return country.lowercase(Locale.getDefault())
        }
    }
}