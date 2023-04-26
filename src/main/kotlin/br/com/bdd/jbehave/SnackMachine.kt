package br.com.bdd.jbehave

class SnackMachine (
    val availableBanknotes: List<Int>
) {
    fun purchase(price: Int, amount: Int): List<Int> {
        var diferenca: Int = amount - price
        val change = mutableListOf<Int>()

        availableBanknotes.forEach{
            while (diferenca >= it) {
                change.add(it)
                diferenca -= it
            }
        }

        return change
    }
}