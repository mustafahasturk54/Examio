package com.mustafahasturk.examio.utils

import android.content.Context
import android.content.SharedPreferences

object PreferenceUtils {
    private const val PREFS_NAME = "examio_prefs"
    private const val KEY_FAVORITE_CLASSES = "favorite_classes"
    
    private fun getSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }
    
    fun saveFavoriteClasses(context: Context, favoriteClasses: Set<String>) {
        val prefs = getSharedPreferences(context)
        val editor = prefs.edit()
        val jsonString = favoriteClasses.joinToString(",")
        editor.putString(KEY_FAVORITE_CLASSES, jsonString)
        editor.apply()
    }
    
    fun loadFavoriteClasses(context: Context): Set<String> {
        val prefs = getSharedPreferences(context)
        val jsonString = prefs.getString(KEY_FAVORITE_CLASSES, "")
        return if (jsonString.isNullOrEmpty()) {
            emptySet()
        } else {
            jsonString.split(",").filter { it.isNotBlank() }.toSet()
        }
    }
}

