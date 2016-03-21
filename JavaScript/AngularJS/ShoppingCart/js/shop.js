function shop() {
    this.products = [ 
        new product(
            "Apple-iPhone-6S","Apple iPhone 6S",
            "The new iPhone, being an S model, naturally comes with more power under the hood, but also brings the long awaited camera upgrade. The main camera now uses a 12MP sensor capable of 4K video recording as well as 1080p at 120fps, there is a brand new 5MP selfie camera too. And, it's the same screen size and resolution but we think it's exactly what Apple meant with the only thing that's changed is everything",
             41000,
             "Apple"),
        new product("Apple-MacBook-Pro","Apple MacBook Pro MF841HN/A 13-inch Laptop",
            "A groundbreaking Retina display. Powerful dual-core and quad-core Intel processors. Fast flash storage. High-performance graphics. Great built-in apps. And now in the 13-inch model, a revolutionary new Force Touch trackpad and even longer battery life.1 Whatever you can imagine, MacBook Pro with Retina display gives you the power to create.",
            129900,
            "Apple"),
        new product(
            "Nike-Team-India-Cricket-Cap-2015", "Nike Team India Cricket Cap 2015",
            "Support your favorite team this world cup by wearing this special edition Team India Cap. Blue cap, has a curved visor with stitched detail, panelled crown with eyelet detailing and applique branding.",
            1280.00,
            "Nike"),
        new product(
            "Citizen-Eco-Drive-Chronograph", "Citizen Eco-Drive Chronograph White Dial Men's Watch - AT1183-07A -24 cm",
            "Citizen Eco-Drive AT1183-07A Chronograph Watch - For Men",
            17121,
            "Citizen")
    ];
}

shop.prototype.getProduct = function (id) {
    for (var i = 0; i < this.products.length; i++) {
        if (this.products[i].id == id)
            return this.products[i];
    }
    return null;
}