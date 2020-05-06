package subtask3

import java.lang.Math.abs

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var resultNumber = 1
        val arrayFromInt: Array<Int> = itemsFromArray.filterIsInstance<Int>().toTypedArray()
        if (arrayFromInt.isEmpty()) return 0

        if (numberOfItems > arrayFromInt.size) {
            for (i in arrayFromInt) {
                resultNumber *= i
            }
            return resultNumber
        }

        arrayFromInt.sortByDescending { abs(it) }

        var negativeNumber = 0
        for ((i, value) in arrayFromInt.withIndex()) {
            if (i < numberOfItems) {
                resultNumber *= value
                if (value < 0) negativeNumber = value
            }
        }

        if (resultNumber < 0) {
            var positiveNumber = 0
            for (i in numberOfItems until arrayFromInt.size - 1) {
                if (arrayFromInt[i] > 0) positiveNumber = arrayFromInt[i]
                break
            }
            resultNumber = resultNumber / negativeNumber * positiveNumber
        }

        return resultNumber
    }
}
