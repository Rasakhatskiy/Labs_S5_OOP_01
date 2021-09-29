class Van : IVan {
    override var products: MutableList<IProduct>
    override var volume: Double

    constructor(products: MutableList<IProduct>, volume: Double) {
        this.products = mutableListOf()
        this.volume = volume
        loadProducts(products)
    }

    override fun sortProducts() {
        products = products.sortedBy { it.price / it.weight }.toMutableList()
    }

    override fun loadProducts(toLoad: List<IProduct>) {
        clear()
        val stonks = toLoad.sortedByDescending { it.price / it.volume }
        var volumeLeft = volume
        stonks.forEach { it ->
            if(volumeLeft >= it.volume)
            {
                products.add(it)
                volumeLeft -= it.volume
            }
        }
    }

    override fun clear() {
        products.clear()
    }

    override fun toString() : String {
        var result = "Van. Volume: $volume. Products:\n"
        products.forEach{ it ->
            result += "\t${it.toString()}\n\n"
        }
        return result
    }

    override fun findProduct(range: QualityRange): IProduct? {
        products.forEach { it ->
            if (range.Contains(it))
                return it
        }
        return null
    }

}