package br.com.bdd.jbehave.steps

import br.com.bdd.jbehave.SnackMachine
import org.assertj.core.api.Assertions.*
import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.Then
import org.jbehave.core.annotations.When

class SnackMachineSteps {
    private lateinit var snackMachine: SnackMachine
    private lateinit var changes: List<Int>
    @Given("the available banknotes are: \$availableBanknotes")
    fun availableBanknotes(availableBanknotes: List<Int>) {
        snackMachine = SnackMachine(availableBanknotes = availableBanknotes)
    }

    @When("I purchase item with price: \$price and \$amount")
    fun availableBanknotes(price: Int, amount: Int) {
        changes = snackMachine.purchase(price, amount)
    }

    @Then("change is: \$changes")
    fun change(changes: List<Int>) {
        assertThat(this.changes).hasSameElementsAs(changes)
    }
}