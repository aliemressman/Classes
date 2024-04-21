package com.aliemressman.classes.Class

/**
 * Type Aliaslar arka planda yeni bir class oluşturmzzlar. Sadece etiketleme yaparlar.
 */
typealias AccountReferenceVM = ProjectContractChargingPeriodProjectAccountReferenceVM

fun main() {

    val projectContractChargingPeriodProjectAccountReferenceVM = ProjectContractChargingPeriodProjectAccountReferenceVM()
    // üstteki ile alttaki aynı anlama gelir.
    val accountReferenceVM = AccountReferenceVM()
    println(accountReferenceVM)
}

class ProjectContractChargingPeriodProjectAccountReferenceVM