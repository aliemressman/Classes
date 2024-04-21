package com.aliemressman.classes.Class

interface HomeFragmentPresenter{
    fun navigate()
}

abstract class BaseFragment() {

}

class HomeFragment(): E(),HomeFragmentPresenter {
    val TAG : String = "HomeFragment"
    var color = "red"

    companion object Named : BaseFragment(), HomeFragmentPresenter {
        const val TAG : String = "HomeFragment"

        private var homeFragment : HomeFragment? = null
        fun newInstance() : HomeFragment  {
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }
        override fun navigate() {}
    }
    override fun navigate() {}

}
object Deneme {
    val carName = "BMW"
}
fun main() {

    HomeFragment().color
    val homeFragment = HomeFragment.newInstance()
    homeFragment.color = "blue"
    val homeFragment2 = HomeFragment.newInstance()
    homeFragment2.color = "green"
    val homeFragment3 = HomeFragment.newInstance()
    val homeFragment4 = HomeFragment.newInstance()
    homeFragment4.color = "yellow"
    val homeFragment5 = HomeFragment.newInstance()
    homeFragment5.color = "black"

    println("homeFragment.color = ${homeFragment.color}")
    println("homeFragment2.color = ${homeFragment2.color}")
    println("homeFragment3.color = ${homeFragment3.color}")
    println("homeFragment4.color = ${homeFragment4.color}")
    println("homeFragment5.color = ${homeFragment5.color}")

    homeFragment.TAG

}