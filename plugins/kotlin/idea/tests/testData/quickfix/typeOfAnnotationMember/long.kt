// "Replace array of boxed with array of primitive" "true"
annotation class SuperAnnotation(
        val l: <caret>Array<Long>,
        val str: Array<String>
)
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix