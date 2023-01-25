package test.webflux.bisiness.utils

import test.webflux.bisiness.dto.UserDto
import test.webflux.persistence.entity.OutdoorAdventurer

fun map(dto: UserDto): OutdoorAdventurer {
    return OutdoorAdventurer(
        id = dto.id,
        name = dto.name,
        age = dto.age,
        gender = dto.gender,
        location = dto.location,
        income = dto.income,
        education = dto.education,
        interests = dto.interests,
        favoriteBrands = dto.favoriteBrands
    )
}