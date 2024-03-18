# MangaLibrary
A standard library for network manga/comic fetching to make application to read mangas/comics

### Attention
This library is just a standard library providing interfaces design for easily developing network mangas/comics fetching

I will not provide any third-party network mangas/comics provider in this repository, I will only provide interface design here. \
Anyone who want to use this library to create your network manga/comic application is allowed. \
Anyone who want to make pull request is allowed, I'll appreciate if you can make this library better.

Please do not add any feature that only specific feature support for few network mangas/comics website, I want to make a general library for every platform. \
If you want to add the platform-specific feature, just implement it and add new methods.

#### For who want to implement a platform provider
You should implement all the interfaces under the package `fit.d6.mangalibrary`, and start accessing them from the provider.

### TODO
#### The most important
A more graceful method to solve the `fit.d6.mangalibrary.MangaLibrary` registration problem. \
Now the only way to make MangaLibrary usable is to replace it in subproject, but this will cause that you cannot use multiple platforms.

1. User interaction like likes and dislikes which usually exist in all platforms
2. Easier structure preventing multiple network requests pressure
3. ... (Add your ideas with pull requests)
