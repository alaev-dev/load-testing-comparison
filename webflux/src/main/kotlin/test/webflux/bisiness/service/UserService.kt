package test.webflux.bisiness.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import test.webflux.bisiness.dto.UserDto
import test.webflux.bisiness.utils.map
import test.webflux.persistence.Dao
import test.webflux.persistence.entity.OutdoorAdventurer

@Service
class UserService(
    private val dao: Dao
) {
    private val log = LoggerFactory.getLogger(UserService::class.java)

    suspend fun createUser(userEvent: UserDto): OutdoorAdventurer {
        log.info("Try to create user $userEvent")
        return dao.saveUser(map(userEvent))
    }
}