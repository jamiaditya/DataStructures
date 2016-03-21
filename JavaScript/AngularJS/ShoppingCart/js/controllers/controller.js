'use strict';

/*shopApp.controller('shopController',['$scope','$routeParams','DataService',function($scope,$routeParams,DataService){
	$scope.shop = DataService.shop;
    $scope.cart = DataService.cart;

    if ($routeParams.productid != null) {
        $scope.product = $scope.shop.getProduct($routeParams.productid);
    }
}]);*/
function shopController($scope, $routeParams, DataService) {

    $scope.shop = DataService.shop;
    $scope.cart = DataService.cart;

    if ($routeParams.productid != null) {
        $scope.product = $scope.shop.getProduct($routeParams.productid);
    }
}