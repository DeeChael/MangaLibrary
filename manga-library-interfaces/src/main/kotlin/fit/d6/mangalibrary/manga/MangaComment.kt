package fit.d6.mangalibrary.manga

import fit.d6.mangalibrary.user.User

interface MangaComment {

    fun getProvider(): MangaProvider

    fun getManga(): DetailedManga

    fun getUser(): User

    fun getContent(): String

}