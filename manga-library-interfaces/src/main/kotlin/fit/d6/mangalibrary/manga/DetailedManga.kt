package fit.d6.mangalibrary.manga

import fit.d6.mangalibrary.network.NetworkItemRequester

interface DetailedManga : Manga {

    fun getName(): String

    fun getCoverUrl(): String

    fun listAuthors(): List<String>

    fun listChapters(): List<MangaChapter>

    fun listTags(): List<MangaTag>

    fun listComments(): NetworkItemRequester<MangaComment>

}