var app = angular.module('sentinelDashboardApp');

app.service('AuthorityRuleNacosService', ['$http', function ($http) {
  this.check = function () {
    return $http({
      url: '/nacos/auth/check',
      method: 'POST'
    });
  };

  this.login = function (param) {
    return $http({
      url: '/nacos/auth/login',
      params: param,
      method: 'POST'
    });
  };

  this.logout = function () {
    return $http({
      url: '/nacos/auth/logout',
      method: 'POST'
    });
  };
}]);
