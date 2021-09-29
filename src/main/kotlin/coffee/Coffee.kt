package coffee

import IProduct

open class Coffee(
    override var price: Double,
    override var weight: Double,
    override var volume: Double,
    protected var sort: String,
) : IProduct {
    override fun toString(): String {
        return "Price: $$price; Weight: $weight kg; Volume: $volume l\n\tSort: $sort\n\t"
    }
}