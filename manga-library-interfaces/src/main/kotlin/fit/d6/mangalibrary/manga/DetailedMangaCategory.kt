package fit.d6.mangalibrary.manga

interface DetailedMangaCategory : MangaCategory {

    fun getName(): String

    fun getCoverUrl(): String?

    fun listMangas(): List<Manga>

}