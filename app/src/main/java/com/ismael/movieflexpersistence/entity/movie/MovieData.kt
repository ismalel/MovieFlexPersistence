package com.ismael.movieflexpersistence.entity.movie

class MovieData (

    var page         : Int?          = null,
    var results      : List<Result> = arrayListOf(),
    var totalPages   : Int?          = null,
    var totalResults : Int?          = null

)