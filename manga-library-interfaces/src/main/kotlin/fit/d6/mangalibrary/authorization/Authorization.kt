package fit.d6.mangalibrary.authorization

import fit.d6.mangalibrary.user.User

interface Authorization {

    fun getId(): String

    fun getUsername(): String

    fun getUser(): User

}