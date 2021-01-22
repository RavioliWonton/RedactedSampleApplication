package com.example.redactedsampleapplication

import dev.zacsweers.redacted.annotations.Redacted

data class SampleBean(
    val id: Long,
    val name: String,
    @Redacted
    val redacted: String
)
