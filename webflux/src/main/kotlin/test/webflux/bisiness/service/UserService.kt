package test.webflux.bisiness.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import test.webflux.persistence.Dao

@Service
class UserService(
    private val dao: Dao
) {
    private val log = LoggerFactory.getLogger(UserService::class.java)

    fun createUser(userEvent: UserEventMessage): Mono<UserMetadataRegistrationResult> {
        log.info("Try to create user $userEvent")
        return Mono.just(userEvent)
            .mapEventToUser()
            .flatMap { dao.saveUser(it) }
            .mapUserMetadataToUserAuthEvent(userEvent.country)
            .map {
                userAuthEventProducer.send(it)
                it
            }
    }
}