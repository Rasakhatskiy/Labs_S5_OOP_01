package coffee

class CoffeeBeans(
    price:  Double,
    weight: Double,
    volume: Double,
    sort:   String,
    private var beanCaliber: Double,
    private var isRoasted: Boolean
) : Coffee(price, weight, volume, sort) {
    override fun toString(): String {
        var result = super<Coffee>.toString()
        result = "Coffee beans. $result"
        result += if (isRoasted) "Roasted" else "Raw"
        result += ", Bean caliber: $beanCaliber."
        return result;
    }
}