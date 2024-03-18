package fit.d6.mangalibrary.user

import fit.d6.mangalibrary.manga.MangaFavorite

interface DetailedUser : User {

    fun listFavorites(): List<MangaFavorite>

}