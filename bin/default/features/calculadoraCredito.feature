Feature: credit calculator
  
   as a user
  I want to do the credit calculation
  to verify the viability

  Scenario: credit calculator
    Given hat you entered in the application's credit calculator
    When I fill in the information requested by the application
      | ingresosMensuales | plazoEnAnos |
      | 12@12.com         | 12@12.com   |
    Then I get a result of credit calculation
