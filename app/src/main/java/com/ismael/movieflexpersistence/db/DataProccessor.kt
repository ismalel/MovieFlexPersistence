package com.ismael.movieflexpersistence.db

import android.content.Context

class DataProccessor(val context: Context) {

    val PREFS_NAME : String = "movieflex_prefs"

    fun sharedPreferenceExist(key: String) : Boolean{
        val prefs = context.getSharedPreferences(PREFS_NAME,0)
        return !prefs.contains(key)
    }

    fun setInt(key: String?, value: Int){
        val prefs = context.getSharedPreferences(PREFS_NAME, 0)
        val editor = prefs.edit()
        editor.putInt(key, value)
        editor.apply()
    }
    fun getInt(key: String?): Int {
        val prefs = context.getSharedPreferences(PREFS_NAME, 0)
        return prefs.getInt(key, 0)
    }

    fun setStr(key: String?, value: String?) {
        val prefs = context.getSharedPreferences(PREFS_NAME, 0)
        val editor = prefs.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getStr(key: String?): String? {
        val prefs = context.getSharedPreferences(PREFS_NAME, 0)
        return prefs.getString(key, "DNF")
    }

    fun setBool(key: String?, value: Boolean) {
        val prefs = context.getSharedPreferences(PREFS_NAME, 0)
        val editor = prefs.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getBool(key: String?): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, 0)
        return prefs.getBoolean(key, false)
    }

}