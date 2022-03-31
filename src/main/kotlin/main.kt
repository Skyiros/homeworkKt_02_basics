fun main() {
    val likes: Int = 11

    if (likes == 1 || (likes % 10) == 1 && likes % 100 != 11)
        println("Понравилось $likes человеку")
    else if (likes >= 100 && (likes % 100) == 0)
        println("Понравилось $likes человек")
    else
        println("Понравилось $likes людям")
}