package domain

import java.util.*

data class OutdoorAdventurer(
    val id: UUID,
    val name: String,
    val age: Int,
    val gender: String,
    val location: String,
    val income: Double,
    val education: String,
    val interests: List<String>,
    val purchaseHistory: List<Purchase>,
    val favoriteBrands: List<String>
)

data class Purchase(
    val id: UUID,
    val product: String,
    val brand: String,
    val date: String,
    val price: Double
)
