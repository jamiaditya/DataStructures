//Using DataService Service to initialise shop and Cart.
shopApp.factory("DataService", function() {
	var myshop = new shop();
	var myCart = new cart("Productsshop");
	return {
		shop: myshop,
		cart: myCart
	};
});