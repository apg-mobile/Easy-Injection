package com.apg.kotlin.library

import android.content.SharedPreferences
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * Created by siwarats on 20/6/2560.
 */

internal val STRING_PREF = "string_preference"
internal val INTEGER_PREF = "integer_preference"
internal val LONG_PREF = "long_preference"
internal val FLOAT_PREF = "float_preference"
internal val STRING_SET_PREF = "string_set_preference"
internal val BOOLEAN_PREF = "boolean_preference"

fun stringPref() = stringPref("")

fun stringPref(initialValue: String) = object : ObservableProperty<String>(initialValue) {

    override fun afterChange(property: KProperty<*>, oldValue: String, newValue: String) {
        getSharedPreference(STRING_PREF, EasyInjection.mode)
                .edit()
                .putString(property.toString(), newValue)
                .apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return getSharedPreference(STRING_PREF, EasyInjection.mode)
                .getString(property.toString(), initialValue)
    }
}

fun integerPref() = integerPref(0)

fun integerPref(initialValue: Int) = object : ObservableProperty<Int>(initialValue) {

    override fun afterChange(property: KProperty<*>, oldValue: Int, newValue: Int) {
        getSharedPreference(INTEGER_PREF, EasyInjection.mode)
                .edit()
                .putInt(property.toString(), newValue)
                .apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return getSharedPreference(INTEGER_PREF, EasyInjection.mode)
                .getInt(property.toString(), initialValue)
    }
}

fun longPref() = longPref(0)

fun longPref(initialValue: Long) = object : ObservableProperty<Long>(initialValue) {

    override fun afterChange(property: KProperty<*>, oldValue: Long, newValue: Long) {
        getSharedPreference(LONG_PREF, EasyInjection.mode)
                .edit()
                .putLong(property.toString(), newValue)
                .apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): Long {
        return getSharedPreference(LONG_PREF, EasyInjection.mode)
                .getLong(property.toString(), initialValue)
    }
}

fun floatPref() = floatPref(0f)

fun floatPref(initialValue: Float) = object : ObservableProperty<Float>(initialValue) {

    override fun afterChange(property: KProperty<*>, oldValue: Float, newValue: Float) {
        getSharedPreference(FLOAT_PREF, EasyInjection.mode)
                .edit()
                .putFloat(property.toString(), newValue)
                .apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): Float {
        return getSharedPreference(FLOAT_PREF, EasyInjection.mode)
                .getFloat(property.toString(), initialValue)
    }
}

fun booleanPref() = booleanPref(false)

fun booleanPref(initialValue: Boolean) = object : ObservableProperty<Boolean>(initialValue) {

    override fun afterChange(property: KProperty<*>, oldValue: Boolean, newValue: Boolean) {
        getSharedPreference(BOOLEAN_PREF, EasyInjection.mode)
                .edit()
                .putBoolean(property.toString(), newValue)
                .apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): Boolean {
        return getSharedPreference(BOOLEAN_PREF, EasyInjection.mode)
                .getBoolean(property.toString(), initialValue)
    }
}

fun stringSetPref() = stringSetPref(emptySet())

fun stringSetPref(initialValue: Set<String>) = object :
        ObservableProperty<Set<String>>(initialValue) {

    override fun afterChange(property: KProperty<*>, oldValue: Set<String>, newValue: Set<String>) {
        getSharedPreference(STRING_SET_PREF, EasyInjection.mode)
                .edit()
                .putStringSet(property.toString(), newValue)
                .apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): Set<String> {
        return getSharedPreference(STRING_SET_PREF, EasyInjection.mode)
                .getStringSet(property.toString(), initialValue)
    }
}

internal fun getSharedPreference(name: String, mode: Int): SharedPreferences {
    return EasyInjection.context
            .getSharedPreferences(name, mode)
}