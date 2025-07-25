package nz.adjmunro.inline

/**
 * Annotation to mark functions and types as members of the Inline DSL library.
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.TYPEALIAS, AnnotationTarget.PROPERTY)
@DslMarker
public annotation class InlineDsl
