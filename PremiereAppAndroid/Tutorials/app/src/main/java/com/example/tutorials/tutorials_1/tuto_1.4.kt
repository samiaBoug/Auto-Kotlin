package com.example.greetingcard.tutorials

fun main(){
    //
    fun main() {
        println("New chat message from a friend")
    }
    //
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)

    //
    val baseSalary : Int = 5000
    val bonusAmount : Int = 1000
    val totalSalary : Int = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    //
    //val firstNumber = 10
    //val secondNumber = 5
    //val result = firstNumber + secondNumber

    //println("$firstNumber + $secondNumber = $result ")

    //
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    fun add(a : Int, b : Int) : Int {
        return a + b
    }
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    //

        val operationSystem = "Chrome OS"
        val emailId = "sample@gmail.com"
        fun displayAlertMessage(a : String, b : String) : String{
            return "There's a new sign-in request on $operationSystem or your Google Account $emailId"
        }

        println(displayAlertMessage(operationSystem, emailId))


    // Podomètre


        val steps = 4000
        val caloriesBurned = pedometrestepsTOcalories(steps);
        println("Walking $steps steps burns $caloriesBurned calories")
    }

    fun pedometrestepsTOcalories(numberOFStepS: Int): Double {
        val caloriesBurnedForEachStep = 0.04
        val totalCALORIESburned = numberOFStepS * caloriesBurnedForEachStep
        return totalCALORIESburned

    //






}