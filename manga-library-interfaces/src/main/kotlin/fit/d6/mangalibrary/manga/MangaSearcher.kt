package fit.d6.mangalibrary.manga

import fit.d6.mangalibrary.authorization.Authorization

interface MangaSearcher {

    fun authorize(authorization: Authorization): MangaSearcher

    fun keyword(keyword: String): MangaSearcher

    fun tags(vararg tag: MangaTag): MangaSearcher

    fun tags(tags: List<MangaTag>): MangaSearcher

    fun search(): List<Manga>

}