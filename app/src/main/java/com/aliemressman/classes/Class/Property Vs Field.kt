package com.aliemressman.classes.Class

class BankAccount {
    // kotlinde sadece property tanımlanır, field tanımlanmaz
    // property = field + getter + setter
    var balance = 1_000_000
        set(value) {
            field = value // field = backing field
        }
    private var dept = 450000
}

fun main() {
    val bankAccount = BankAccount()
    println(bankAccount.balance)
    bankAccount.balance = 1_500_000
    println(bankAccount.balance)
}