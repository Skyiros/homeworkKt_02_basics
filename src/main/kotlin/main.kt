fun main() {
    val lastTransactionRub: Int = 2346
    val lastTransactionKop = lastTransactionRub * 100
    val vipStatus = true
    var amount: Int
    println("Покупка -> ${showRublesToString(lastTransactionRub)}")

    if (lastTransactionKop <= 1_000) {
        amount = lastTransactionKop
    } else if (lastTransactionKop <= 10_000) {
        amount = lastTransactionKop - 10000
        println("После применения стандартной скидки в 100 рублей -> ${showConvertedKopecksToRubles(amount)}")
    } else {
        amount = lastTransactionKop * 95 / 100
        println("После применения 5% скидки -> ${showConvertedKopecksToRubles(amount)}")
    }


    if (vipStatus) {
        amount = amount * 91 / 100
    }
    println("После применения 1% скидки -> ${showConvertedKopecksToRubles(amount)}")
}



fun showConvertedKopecksToRubles(count: Int): String {
    val countString = "${count.toDouble() / 100}"
    val rublesAndKopecks = countString.split('.')
    val rublesInt = rublesAndKopecks[0].toInt()
    val kopecksInt = rublesAndKopecks[1].toInt()
    val rublesString = showRublesToString(rublesInt)
    val kopecksString = showKopecksToString(kopecksInt)

    return rublesString + kopecksString
}

fun showRublesToString(rubles: Int): String {
    var resultString: String

    if (rubles == 0) {
        resultString = ""
    } else if (rubles == 1 || (rubles % 10) == 1 && rubles != 11) {
        resultString = "$rubles рубль"
    } else if (rubles % 10 >= 2 && rubles % 10 <= 4) {
        resultString = "$rubles рубля"
    } else {
        resultString = "$rubles рублей"
    }
    return resultString
}

fun showKopecksToString(kopecks: Int): String {
    var resultString: String

    if(kopecks == 0) {
        resultString = ""
    } else if (kopecks == 1 || (kopecks % 10) == 1 && kopecks != 11) {
        resultString = " $kopecks копейка"
    } else if (kopecks % 10 >= 2 && kopecks % 10 <= 4) {
        resultString = " $kopecks копейки"
    } else {
        resultString = " $kopecks копеек"
    }
    return resultString
}