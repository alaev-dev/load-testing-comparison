package test.webflux.bisiness.dto

import java.util.*

data class UserDto (
    val id: UUID,
    val name: String,
    val age: Int?,
    val gender: String?,
    val location: String?,
    val income: Double?,
    val education: String?,
    val interests: List<String>?,
    val favoriteBrands: List<String>?
)