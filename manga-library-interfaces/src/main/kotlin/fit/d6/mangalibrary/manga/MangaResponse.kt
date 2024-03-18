package fit.d6.mangalibrary.manga

interface MangaResponse {

    fun getProvider(): MangaProvider

    fun listHeaders(): Map<String, String>

}