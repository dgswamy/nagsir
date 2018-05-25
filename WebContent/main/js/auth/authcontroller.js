mainApp.controller('authcontroller',function($scope,$http){
	console.log("inside authcontroller");
	$scope.hello = "heloooooooo";
	$scope.login = function (){
		var signobj = {
			"username":$scope.username,
			"password":$scope.password
		}
		
		$http.post("http://localhost:8080/nagsir/signup",signobj)
		.success(function(data, status, headers, config) {
        // this callback will be called asynchronously
        // when the response is available
        console.log(data+" "+status);
    }).
		error(function(data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
	}
});