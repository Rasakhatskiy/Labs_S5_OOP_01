interface IVan {
    var products: MutableList<IProduct>
    var volume: Double
    fun sortProducts()
    fun loadProducts(products: List<IProduct>)
    fun clear()
    override fun toString() : String
    fun findProduct(range: QualityRange) : IProduct?
}