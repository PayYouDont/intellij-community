// "Replace with 'newFun(p)'" "true"
// WITH_STDLIB

@Deprecated("", ReplaceWith("newFun(p)"))
fun oldFun(vararg p: Int){
    newFun(p)
}

fun newFun(p: IntArray){}

fun foo(list1: List<Int>,list2: List<Int>) {
    <caret>oldFun(*list1.toIntArray(), 0, *list2.toIntArray())
}

// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.k2.codeinsight.fixes.replaceWith.DeprecatedSymbolUsageFix