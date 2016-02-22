var mainApp = angular.module('OneLoginMain', [ 'ngRoute' ]);
mainApp.controller('OneLoginController', function($scope, $http, $window) {
	$scope.applications = "";
	$scope.SendHttpPostData = function() {
		$http({
			method : "POST",
			url : "\login",
			data : {
				username : "Ravi",
				password : "angular#1234"
			},
			mimeType : 'application/json',
			headers : {
				'Content-Type' : 'application/json'
			}
		}).then(function mySucces(response) {
			$scope.applications = response.data;
			$window.location.hash = '#/applicationDetails';
		});
	}
	$scope.getApplicationDetails = function(name) {
		$http({
			method : "POST",
			url : "\applicationdetails",
			data : {
				application : [name]
			},
			mimeType : 'application/json',
			headers : {
				'Content-Type' : 'application/json'
			}
		}).then(function mySucces(response) {
			$scope.applications = response.data;
			$window.location.hash = '#/applicationDetails';
		});
	}
});

mainApp.config(function($routeProvider) {
	$routeProvider.when('/login', {
		templateUrl : 'static/includes/login.html'
	}).when('/applicationDetails', {
		templateUrl : 'static/includes/applicationdetails.html',
	});
});
