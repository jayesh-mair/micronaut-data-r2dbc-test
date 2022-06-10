package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.Instant
import java.util.*

@MicronautTest
class EntityRepositoryTest(@Inject private val entityRepository: EntityRepository) {

  @Test
  fun `test entity count`() = runBlocking {
    Assertions.assertEquals(0, entityRepository.count())
  }

  @Test
  fun `insert entity returns success`() = runBlocking {
    val now = Instant.now()
    val entity = Entity("entity-uuid-1", "test-entity-type", "{}", now)
    Assertions.assertEquals(entity, entityRepository.save(entity))
  }
}