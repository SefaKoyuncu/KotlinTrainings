package com.sefa.kotlinsomeproblems

class ProblemsFunctions
{
    fun convertCelciusToFahrenheit(celcius : Double) : Double
    {
        val fahrenheit=celcius*1.8+32
        return fahrenheit
    }

    fun calculatePerimeter(shortSide : Int, longSide : Int)
    {
        val perimeter= 2*shortSide+2*longSide
        println("Perimeter : $perimeter")
    }

    fun factorialCalculation(number : Int) :Int
    {
        var result = 1

        for (i in number downTo 1)
        {
            result*=i
        }

        return result
    }

    fun howMuchLetter(word : String, letter : Char)
    {
        var number =0

        for (w in word)
        {
            if (w==letter)
            {
                number++
            }
        }
        println("$word has $number $letter's.")
    }

    fun sumOfInteriorAngle(numberOfSides : Int) :Int
    {
        val sum=(numberOfSides-2)*180
        return sum
    }

    fun calculationSalary(numberOfDays : Int) : Int
    {
        val sumOfWorkingHours=numberOfDays*8
        var salary=0

        if (sumOfWorkingHours>160)
        {
            val overtimeHours=sumOfWorkingHours-160
            salary+=overtimeHours*20
        }
        salary+=160*10

        return salary
    }

    fun internetInvoiceFee(usingAmount : Int) :Int
    {
        var fee=0

        if (usingAmount>50)
        {
            fee=(usingAmount-50)*4
        }

        fee+=100

        return fee
    }

}