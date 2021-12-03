package com.ismael.movieflexpersistence.entity.tv

import com.ismael.movieflexpersistence.entity.movie.MovieResult

class TVData (
    var page         : Int?          = null,
    var movieResults      : ArrayList<TVResult> = arrayListOf(),
    var totalPages   : Int?          = null,
    var totalResults : Int?          = null
)