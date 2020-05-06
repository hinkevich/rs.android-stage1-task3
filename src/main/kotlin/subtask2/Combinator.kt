package subtask2

class Combinator {


    fun checkChooseFromArray(array: Array<Int>): Int? {
        val quantityPoster = array[0]
        val quantityColor = array[1]
        var combinationColor = 1
        val result = mutableListOf<Int>()

        while (combinationColor <= quantityColor) {
            val combination:Long =
                (factorial(quantityColor) / (factorial((quantityColor - combinationColor)) * factorial(combinationColor)))
            println(" комбинации $combination цвета $combinationColor")
            if (combination>=quantityPoster){
                println(" правильные комбинации $combination цвета $combinationColor")
                result.add(combinationColor)
                //println(result)
            }
            combinationColor++
        }
        if(result.size==0){
            return null
        }else {return result.min()}

    }

    fun factorial(number: Int): Long {
        var factorial:Long = 1
        var i = 1
        while (i <= number) {
            factorial = factorial * i
            i++
        }
        return factorial
    }
}
