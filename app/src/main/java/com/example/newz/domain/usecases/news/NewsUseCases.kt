package com.example.newz.domain.usecases.news

data class NewsUseCases(
    val getNews: GetNews,
    val searchNews: SearchNews,
    val upsertArticles: UpsertArticles,
    val deleteArticles: DeleteArticles,
    val selectArticles: SelectArticles,
    val selectArticle: SelectArticle,
    val selectSearch: SelectSearch,
    val upsertSearchHistory: UpsertSearchHistory,
    val deleteSearchHistory: DeleteSearchHistory,
    val selectSearchHistory: SelectSearchHistory
)
