package com.aliemressman.classes.Class

sealed class Response
class Success : Response()
class Error : Response()

sealed class Response2{
    class Success2 : Response2(), TeamsFunctionality {
        override fun practice() {
            TODO("Not yet implemented")
        }

    }
    class Error2 : Response2(){

    }
}

fun handle(response: Response) {
    when(response) {
        is Success -> {
            // response'dan gelen bilgilerle ui 'ini doldur.
            println("gggg")
        }
        is Error -> {
            // pop-up ile kullaniciya bilgi ver.
        }
    //    else -> {
    //
    //    }
    }
}

// BU YANLIS KULLANIMDIR. ENUM KULLANMAMİZ GEREKİYOR.!!
sealed class PaymentOption {
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2 {
    Cash, Card, Transfer
}

fun main() {
    val success = Success()
    val error = Error()

    handle(success)
    handle(error)
}