
  Feature: Get all products from the api

    Scenario: Verify the get api for the products
      Given I hit the url of get products api end point
      When I pass the url in the request
      Then I receive the response code as 200



