package com.example

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.TypeDef
import io.micronaut.data.model.DataType
import java.time.Instant

@MappedEntity
data class Entity(
  @field:Id val entityId: String,
  val entityType: String,
  @TypeDef(type = DataType.JSON) val blob: Any,
  val createdDate: Instant
)
