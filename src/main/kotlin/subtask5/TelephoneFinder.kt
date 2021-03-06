package subtask5

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val map = mapOf(
            "1" to listOf("2", "4"),
            "2" to listOf("1", "3", "5"),
            "3" to listOf("2", "6"),
            "4" to listOf("1", "5", "7"),
            "5" to listOf("2", "4", "6", "8"),
            "6" to listOf("3", "5", "9"),
            "7" to listOf("4", "8"),
            "8" to listOf("5", "7", "9", "0"),
            "9" to listOf("6", "8"),
            "0" to listOf("8")
        )
        val newNumber = number.toInt()
        if (newNumber < 0) {
            return null
        }
        val result = mutableListOf<String>()
        for (i in number.indices) {
            val list = map.getValue(number[i].toString())
            for (j in list.indices) {
                val element = number.replaceRange(i, i + 1, list[j])
                result.add(element)
            }
        }
        return result.toTypedArray()
    }
}

