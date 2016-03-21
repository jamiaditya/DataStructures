'use strict';

var shopApp = angular.module('ProductsShop', [
    'ngRoute'
]);

shopApp.config(function ($routeProvider, $locationProvider) {

	$routeProvider
	.when('/shop', {
		templateUrl: 'templates/shop.html',
		controller: shopController 
	})
	.when('/products/:productid', {
		templateUrl: 'templates/product.html',
		controller: shopController
	})
	.when('/cart', {
		templateUrl: 'templates/cart.html',
		controller: shopController
	})
	.otherwise({
		redirectTo: '/shop'
	});

	//$locationProvider.html5Mode(true);

});

shopApp.factory("DataService", function () {

	var myshop = new shop();
	var myCart = new cart("Productsshop");
	return {
		shop: myshop,
		cart: myCart
	};
});