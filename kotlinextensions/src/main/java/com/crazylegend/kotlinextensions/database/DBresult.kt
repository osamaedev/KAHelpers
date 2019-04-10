package com.crazylegend.kotlinextensions.database


/**
 * Created by hristijan on 4/10/19 to long live and prosper !
 */

sealed class DBResult<out T> {

    data class Success<T>(val value: T) : DBResult<T>()
    object Quering : DBResult<Nothing>()
    object EmptyDB : DBResult<Nothing>()
    data class DBError(val message: String, val exception: Exception?=null, val throwable: Throwable) : DBResult<Nothing>()

}