package test.webflux.persistence.repo

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import test.webflux.persistence.entity.OutdoorAdventurer
import java.util.*

interface UserRepository : ReactiveCrudRepository<OutdoorAdventurer, UUID>, ReactiveQueryByExampleExecutor<OutdoorAdventurer>