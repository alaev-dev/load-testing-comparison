package test.webflux.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import test.webflux.bisiness.dto.UserDto
import test.webflux.bisiness.service.UserService
import test.webflux.persistence.entity.OutdoorAdventurer
import java.util.*

@RestController
@RequestMapping("/int/user")
class UserController(
    private val service: UserService
) {
    @PostMapping
    suspend fun addUser(
        @RequestBody
        user: UserDto
    ): OutdoorAdventurer {
        return service.createUser(user)
    }
}
