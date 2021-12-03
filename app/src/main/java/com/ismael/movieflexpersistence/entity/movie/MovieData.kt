package com.ismael.movieflexpersistence.entity.movie

class MovieData (

    var page         : Int?          = null,
    var movieResults      : ArrayList<MovieResult> = arrayListOf(),
    var totalPages   : Int?          = null,
    var totalResults : Int?          = null

)