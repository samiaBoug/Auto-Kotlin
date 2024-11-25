package com.example.tuto1

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty{
    EASY, MEDIUM, HARD
}
class Quiz{
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun main() {

   /* println(question3.toString())
    println(question3.equals(28))
    println(question3.hashCode())
    println(question3.component2())
    println(question3.copy())
    */


   // println("${Quiz.answered} of ${Quiz.total} answered.")
    println(Quiz.progressText)


}


