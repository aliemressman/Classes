package com.aliemressman.classes.Class


interface TeamsFunctionality {
    fun practice()
}

enum class colorType {
    RED, GREEN, BLUE
}

enum class Team(val starCount : Int ) {
    FENERBAHCE(3),
    GALATASARAY(4),
    BESIKTAS(2),
    TRABZONSPOR(1)
}

enum class Teams (val starCount : Int) : TeamsFunctionality {
    FENERBAHCE(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }

    },
    GALATASARAY(4) {
        override fun practice() {
            println("Galatasaray is practicing")
        }
    },
    BESIKTAS(2) {
        override fun practice() {
            println("Besiktas is practicing")
        }
    },
    TRABZONSPOR(1) {
        override fun practice() {
            println("Trabzonspor is practicing")
        }
    };
/*
    override fun practice() {
        TODO("Not yet implemented")   Bu şekilde yaparsam her bir enum için ayrı ayrı override etmeme gerek kalmaz.
    }
 */

   // override val name : String
   //    get() {
   //        TODO()
   //    }
   // override val ordinal : Int
   //    get() {
   //        TODO()
   //    }                              Bu elemanlar zaten enum class'ın içinde tanımlıdır.
}

enum class daysOfWeek (val dayNumber : Int) {
    Pazartesi(1) {
        override fun toString(): String {
            return "PAZARTESI"
        }
    },
    Sali(2) {
        override fun toString(): String {
            return super.toString()
        }
    },
    Carsamba(3) {
        override fun toString(): String {
            return super.toString()
        }
    },
    Persembe(4) {
        override fun toString(): String {
            return super.toString()
        }
    },
    Cuma(5) {
        override fun toString(): String {
            return super.toString()
        }
    },
    Cumartesi(6) {
        override fun toString(): String {
            return super.toString()
        }
    },
    Pazar(7) {
        override fun toString(): String {
            return super.toString()
        }
    };
}
enum class Sex {
    Male {
        override val typeCount : Int
            get() = TODO()

        override fun isOptional() {
            TODO("Not yet implemented")
        }

        override fun log() {
            super.log()
            println("Male")
        }
    },
    Female {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    },
    Other {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    };

    abstract val typeCount : Int
    abstract fun isOptional()
    open fun log() {
        // sgsf
    }
}


fun main () {
    val bestTeam = getBeastTeam(Team.GALATASARAY)
    val dayNumber = daysOfWeek.Sali
    println(dayNumber)
    println(bestTeam)

}

// Ben burada Teams'i verdiğimde main fonksiyonunda teams.GALATASARAYI verebiliyorsam Teams Galatasarayın üst classıdır diyebilirim.
fun getBeastTeam (team : Team) : Team {
    return team
}
