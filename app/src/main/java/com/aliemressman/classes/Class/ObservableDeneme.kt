package com.aliemressman.classes.Class

fun main() {
    val currencyDataa = CurrencyDataa(object : ValueChangedd {
        override fun onChanged(oldValue: Int, newValue: Int) {
            val changedValue = newValue - oldValue
            println("Changed value = $changedValue")
        }
    })

    currencyDataa.buyValue = 10
    currencyDataa.buyValue = 15
    currencyDataa.buyValue = 20
    currencyDataa.valueChanged.onChanged(10, 20)

    val currencyData = CurrencyDataaa { oldValue, newValue ->
        val changedValue = newValue - oldValue
        println("Changed value = $changedValue")
    }
    currencyData.buyValue = 500
    currencyData.buyValue = 1000
    currencyData.buyValue = 55


}
    // INTERFACE İLE KULLANIMI
    interface ValueChangedd {
        fun onChanged(oldValue: Int, newValue: Int)
    }

    class CurrencyDataa(val valueChanged: ValueChangedd) {
        var buyValue: Int = 0
            set(value) {
                valueChanged.onChanged(field, value)
                field = value
            }
    }

// HİGHORDER FUNCTION İLE KULLANIMI

    class CurrencyDataaa(val onChanged: (Int, Int) -> Unit) {
        var buyValue: Int = 0
            set(value) {
                onChanged(field, value)
                field = value
            }
    }