package subtask1

import kotlin.math.abs

class PolynomialConverter {


    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.size != 0) {

            var str: String?
            var degree = numbers.size - 1
            if (numbers[0] == 1) {
                str = "x^$degree"
            } else if (numbers[0] == -1) {
                str = "-x^$degree"
            } else str = "${numbers[0]}x^$degree"
            var i = 1
            degree--
            while (i < numbers.size) {
                str = str + addElement(degree, numbers[i])
                i++
                degree--
            }
            return str
        } else return null
    }

    fun addElement(degreeOfNumbers: Int, number: Int): String {
        var msg = " "
        if (number == 0) {
            return ""
        } else {
            //add + or -
            if (number > 0) {
                msg = msg + "+ "
            } else msg = msg + "- "
            //add number
            if (abs(number) != 1) {
                msg = msg + abs(number)
            }
            //add degree
            if (degreeOfNumbers > 1) {
                msg = msg + "x^$degreeOfNumbers"
            } else if (degreeOfNumbers == 1) {
                msg = msg + "x"
            }
        }
        return msg
    }
}
