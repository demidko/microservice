package app.example.annotations

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS
import kotlin.annotation.AnnotationTarget.FUNCTION

@Tag("manual")
@Retention(RUNTIME)
@Target(FUNCTION, ANNOTATION_CLASS)
annotation class ManualTest