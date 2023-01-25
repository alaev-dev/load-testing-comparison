package test.webflux.persistence.entity

import java.util.*

data class OutdoorAdventurer(
    val id: UUID,
    val name: String,
    val age: Int?,
    val gender: String?,
    val location: String? = null,
    val income: Double? = null,
    val education: String? = null,
    val interests: List<String>? = null,
    val purchaseHistory: List<Purchase>? = null,
    val favoriteBrands: List<String>? = null
)

data class Purchase(
    val id: UUID,
    val product: String,
    val brand: String,
    val date: String,
    val price: Double
)
