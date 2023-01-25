package test.webflux.persistence

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.reactive.awaitFirst
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import test.webflux.persistence.entity.OutdoorAdventurer
import test.webflux.persistence.repo.UserRepository
import java.util.*

@Component
class Dao(
    private val userRepository: UserRepository
) {
    private val log = LoggerFactory.getLogger(Dao::class.java)

    suspend fun saveUser(user: OutdoorAdventurer): OutdoorAdventurer {
        return userRepository.save(user).awaitFirst()
    }

    suspend fun getUserById(userId: UUID): OutdoorAdventurer {
        return userRepository.findById(userId).awaitFirst()
    }

    fun getAllUser(): Flow<OutdoorAdventurer> {
        return userRepository.findAll().asFlow()
    }
}