package fit.d6.mangalibrary.manga

interface MangaCategory {

    fun getProvider(): MangaProvider

    fun getId(): String

}