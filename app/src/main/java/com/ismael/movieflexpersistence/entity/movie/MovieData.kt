package com.ismael.movieflexpersistence.entity.movie

class MovieData (

    var page         : Int?          = null,
    var results      : ArrayList<MovieResult> = arrayListOf(),
    var total_pages   : Int?          = null,
    var total_results : Int?          = null

)