var mainApp = angular.module('OneLoginMain', [ 'ngRoute' ]);
mainApp.controller('OneLoginController', function($scope, $http) {
	$scope.SendHttpPostData = function() {
		$http({
			method : "POST",
			url : "\login",
			 data: {
                 username: "Ravi",
                 password: "tcs#1234"
             },headers: {
                 'Content-Type': 'application/json'}
		}).then(function mySucces(response) {
			alert("hai");
		});
	}
});

mainApp.config(function($routeProvider) {
	$routeProvider.when('/login', {
		templateUrl : 'static/includes/login.html'
	});
});
