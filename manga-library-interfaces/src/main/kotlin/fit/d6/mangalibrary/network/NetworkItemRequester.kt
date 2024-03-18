package fit.d6.mangalibrary.network

import fit.d6.mangalibrary.authorization.Authorization
import fit.d6.mangalibrary.manga.MangaProvider

interface NetworkItemRequester<T> {

    fun getProvider(): MangaProvider

    fun getAuthorization(): Authorization?

    fun more(): List<T>

}