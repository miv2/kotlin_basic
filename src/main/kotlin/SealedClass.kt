package main.kotlin

interface Error

class FileError(val fileName: String) : Error

class DatabaseError(val dbmsType: DbmsType) : Error

enum class DbmsType {
    MYSQL, MARIA
}

fun getErrorMessage(error : Error) = when (error) {
    is FileError -> "Error is occurred at : ${error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    else -> throw IllegalArgumentException("Unknown type")
}
