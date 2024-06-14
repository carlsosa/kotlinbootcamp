package kotlinPackage.FunctionalManipulations

class Lists {
    fun listDividedBy3() {
        print(divisibleBy(3))
    }

    fun divisibleBy(num: Int) : List<Int>{
        val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
        return numbers.filter { it % num ==0 }
    }
}