package com.ismael.movieflexpersistence.entity.tv

import com.ismael.movieflexpersistence.entity.movie.MovieResult

class TVData (
    var page         : Int?          = null,
    var results      : ArrayList<TVResult> = arrayListOf(),
    var total_pages   : Int?          = null,
    var total_results : Int?          = null
)