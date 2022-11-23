package com.sefa.kotlinsomeproblems

fun main()
{
    val functions= ProblemsFunctions()

    val fahrenheit = functions.convertCelciusToFahrenheit(100.0)
    println("Fahrenheit : $fahrenheit")

    functions.calculatePerimeter(2,4)

    val factorial=functions.factorialCalculation(6)
    println("Factorial : $factorial")

    functions.howMuchLetter("fahrenheit",'e')

    val sumOfAngle=functions.sumOfInteriorAngle(3)
    println("Sum of Angle : $sumOfAngle")

    val salary=functions.calculationSalary(26)
    println("Salary : $salary")

    val fee=functions.internetInvoiceFee(60)
    println("Internet Fee : $fee")

}