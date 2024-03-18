package fit.d6.mangalibrary

import fit.d6.mangalibrary.manga.MangaProvider

object MangaLibrary {

    fun hasProvider(id: String): Boolean {
        throw NotImplementedError()
    }

    fun <T : MangaProvider> get() : T {
        throw NotImplementedError()
    }

    fun getProvider(id: String): MangaProvider {
        throw NotImplementedError()
    }

    fun listProviderIds(): List<String> {
        throw NotImplementedError()
    }

    fun listProviders(): List<MangaProvider> {
        throw NotImplementedError()
    }

}