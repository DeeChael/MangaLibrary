import fit.d6.mangalibrary.MangaLibrary
import fit.d6.mangalibrary.authorization.Authorization
import fit.d6.mangalibrary.authorization.AuthorizationProvider
import fit.d6.mangalibrary.manga.*

class SomeMangaProvider : MangaProvider {
    override fun getId(): String {
        TODO("Not yet implemented")
    }

    override fun search(): MangaSearcher {
        TODO("Not yet implemented")
    }

    override fun getDetailed(manga: Manga, authorization: Authorization?) {
        TODO("Not yet implemented")
    }

    override fun getDetailed(chapter: MangaChapter, authorization: Authorization?) {
        TODO("Not yet implemented")
    }

    override fun getDetailed(category: MangaCategory, authorization: Authorization?) {
        TODO("Not yet implemented")
    }

    override fun listTags(authorization: Authorization?): List<MangaTag> {
        TODO("Not yet implemented")
    }

    override fun listRecentUpdates(authorization: Authorization?): List<Manga> {
        TODO("Not yet implemented")
    }

    override fun listCategories(authorization: Authorization?): List<MangaCategory> {
        TODO("Not yet implemented")
    }

    override fun requestUrlSafely(url: String, authorization: Authorization?, callback: (MangaResponse) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun getAuthorizationProvider(): AuthorizationProvider {
        TODO("Not yet implemented")
    }

}


fun main() {
    val provider = MangaLibrary.get<SomeMangaProvider>()

    val authorization = provider.getAuthorizationProvider()
        .authorize { options ->
            options.append("username", "admin")
            options.append("password", "admin123")
        }

    val detailedUser = provider.getAuthorizationProvider().getDetailed(authorization)

    val favorites = detailedUser.listFavorites()
    // used to render user favorites

    val recentUpdates = provider.listRecentUpdates(authorization)
    // use recent updates to render the home page

    val searchResult = provider.search()
        .keyword("some manga keyword")
        .tags(provider.listTags())
        .search() // search manga
}