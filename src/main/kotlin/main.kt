import coffee.CoffeeBeans
import coffee.CoffeeGround
import coffee.CoffeeInstantBag
import coffee.CoffeeInstantJar

fun main() {
    val products = mutableListOf<IProduct>(
        CoffeeBeans     (1.0, 1.0, 1.0, "Bebra", 0.1, false),
        CoffeeGround    (1.0, 2.0, 2.0, "Abobika", 2, true),
        CoffeeInstantJar(1.0, 4.0, 4.0, "Shitter", "Aluminium", "Plastic", false),
        CoffeeInstantBag(1.0, 5.0, 5.0, "Gigi", 10.0, 5.0, false),
    )

    val van = Van(products, 100.0)
    println(van.toString())
    van.sortProducts()
    println(van.toString())
    var coffe = van.findProduct(QualityRange(Pair(0.0, 0.0), Pair(4.0, 5.0), Pair(2.0, 4.0)))
    println(coffe)
}