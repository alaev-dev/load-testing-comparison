package test.webflux.persistence.repo

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.*

interface UserRepository : ReactiveCrudRepository<OutdoorAdventurer, UUID>, ReactiveQueryByExampleExecutor<OutdoorAdventurer>