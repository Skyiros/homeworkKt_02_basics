fun main() {
    val amount: Int = 1_000_000
    val minimalCommission = 3_500
    val commission = (amount * 75 / 10000)

    if (commission > minimalCommission)
        println("Комиссия в копейках составляет: $commission")
    else
        println("Комиссия в копейках составляет: $minimalCommission")
}