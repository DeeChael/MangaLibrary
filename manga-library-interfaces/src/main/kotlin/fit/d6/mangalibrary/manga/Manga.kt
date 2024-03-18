package fit.d6.mangalibrary.manga

interface Manga {

    fun getProvider(): MangaProvider

    fun getId(): String

    fun getUrl(): String

}