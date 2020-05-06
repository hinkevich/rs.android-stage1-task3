package subtask4

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        if (number<=2){
            return null
        }
        val ishodnum = number
        val newNumber = ishodnum - 1
        var num = Math.floor(Math.sqrt((ishodnum * ishodnum - newNumber * newNumber).toDouble())).toInt()
        var a = checkArray(num, ishodnum * ishodnum - newNumber * newNumber)
        var d = chekArray(a)

        while (!d) {
            a = checkArray(num--, ishodnum * ishodnum - newNumber * newNumber)
            d = chekArray(a)
        }
        a.add(newNumber)
        a.sort()

        return a.toTypedArray()
    }

        fun checkArray(number: Int, sqrtSum: Int): MutableList<Int> {
            val newArray = mutableListOf<Int>()
            var num = number
            var n = sqrtSum

            newArray.add(num)

            while (n > 1) {
                n = n - (num * num)
                if (n == 0) {
                    break
                }
                num = Math.floor(Math.sqrt(n.toDouble())).toInt()
                newArray.add(num)
            }
            return newArray
        }

        fun chekArray(array: MutableList<Int>): Boolean {
            var quantitySovp = 0
            for (i in 0..array.size - 2) {
                if (array[i] == array[i + 1]) {
                    quantitySovp++
                }
            }
            if (quantitySovp > 0) {
                return false
            } else {
                return true
            }
        }
    }

