package test.webflux.persistence

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

    fun saveUser(user: OutdoorAdventurer): Mono<OutdoorAdventurer> {
        return userRepository.save(user)
    }

    fun getUserById(userId: UUID): Mono<OutdoorAdventurer> {
        return userRepository.findById(userId)
    }

    fun getAllUser(): Flux<OutdoorAdventurer> {
        return userRepository.findAll()
    }
}