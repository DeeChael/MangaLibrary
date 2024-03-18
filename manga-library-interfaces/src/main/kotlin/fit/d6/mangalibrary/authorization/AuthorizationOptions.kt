package fit.d6.mangalibrary.authorization

interface AuthorizationOptions {

    fun append(key: String, value: String): AuthorizationOptions

}