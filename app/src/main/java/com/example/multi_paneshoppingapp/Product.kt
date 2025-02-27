package com.example.multi_paneshoppingapp


data class Product (
    val name: String,
    val price: String,
    val description: String
)


val products = listOf(
    Product("Product A", "$100", "This is a great product A."),
    Product("Product B", "$150", "This is product B with more features."),
    Product("Product C", "$200", "Premium product C."),
    Product("Product D", "$50", "Affordable and reliable product D."),
    Product("Product E", "$75", "Compact and efficient product E."),
    Product("Product F", "$120", "Product F with advanced functionality."),
    Product("Product G", "$90", "Versatile and easy-to-use product G."),
    Product("Product H", "$180", "High-performance product H."),
    Product("Product I", "$250", "Luxury-grade product I."),
    Product("Product J", "$300", "Top-of-the-line product J."),
    Product("Product K", "$65", "Budget-friendly product K."),
    Product("Product L", "$110", "Durable and long-lasting product L."),
    Product("Product M", "$95", "Sleek and modern product M."),
    Product("Product N", "$130", "Feature-packed product N."),
    Product("Product O", "$170", "Highly-rated product O."),
    Product("Product P", "$220", "Premium quality product P."),
    Product("Product Q", "$140", "Mid-range product Q with great value."),
    Product("Product R", "$160", "Robust and well-designed product R."),
    Product("Product S", "$280", "Ultimate performance product S."),
    Product("Product T", "$320", "Flagship-level product T with cutting-edge tech."),
    Product("Product U", "$85", "Compact and portable product U."),
    Product("Product V", "$195", "High-quality materials used in product V."),
    Product("Product W", "$260", "Reliable and efficient product W."),
    Product("Product X", "$350", "Exclusive product X with premium features."),
    Product("Product Y", "$400", "Top-tier innovation in product Y."),
    Product("Product Z", "$450", "The best of the best: product Z.")
)
