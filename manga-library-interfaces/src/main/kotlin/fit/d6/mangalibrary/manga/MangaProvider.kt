package fit.d6.mangalibrary.manga

import fit.d6.mangalibrary.authorization.Authorization
import fit.d6.mangalibrary.authorization.AuthorizationProvider

interface MangaProvider {

    fun getId(): String

    fun search(): MangaSearcher

    fun getDetailed(manga: Manga, authorization: Authorization? = null)

    fun getDetailed(chapter: MangaChapter, authorization: Authorization? = null)

    fun getDetailed(category: MangaCategory, authorization: Authorization? = null)

    fun listTags(authorization: Authorization? = null): List<MangaTag>

    fun listRecentUpdates(authorization: Authorization? = null): List<Manga>

    fun listCategories(authorization: Authorization? = null): List<MangaCategory>

    fun requestUrlSafely(url: String, authorization: Authorization? = null, callback: (MangaResponse) -> Unit)

    fun getAuthorizationProvider(): AuthorizationProvider

}