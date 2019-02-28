Feature: Tools Property
  
  as a user of metrocuadrado
  I want to use the tools of the application
  so to get information as required

  @tools
  Scenario: Property request
    Given want to look for a property with specific characteristics
    When I do the specification registration
    Then I register successfully

  @tools1
  Scenario: Property record
    Given I Want to publish a property with specific characteristics
    When I type the characteristics
    Then I record successfully
