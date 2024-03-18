package fit.d6.mangalibrary.manga

import fit.d6.mangalibrary.user.DetailedUser

interface MangaFavorite {

    fun getProvider(): MangaProvider

    fun getOwner(): DetailedUser

    fun addManga(manga: Manga)

    fun removeManga(manga: Manga)

    fun listMangas(): List<Manga>

}