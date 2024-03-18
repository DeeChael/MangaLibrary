package fit.d6.mangalibrary.authorization

import fit.d6.mangalibrary.user.DetailedUser

interface AuthorizationProvider {

    fun getDetailed(authorization: Authorization): DetailedUser

    fun authorize(authorizer: (AuthorizationOptions) -> Unit): Authorization

}