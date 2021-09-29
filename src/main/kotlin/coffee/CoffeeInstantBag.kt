package coffee

class CoffeeInstantBag(
    price:  Double,
    weight: Double,
    volume: Double,
    sort:   String,
    private var sugar: Double,
    private var cream: Double,
    private var isDouble: Boolean
) : Coffee(price, weight, volume, sort) {
    override fun toString(): String {
        var result = super<Coffee>.toString()
        result = "Instant coffee in bag. $result"
        result += if (isDouble) "Double" else "Single"
        result += " portion, sugar: $sugar%, cream: $cream%."
        return result;
    }
}