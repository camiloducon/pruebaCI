Feature: credit calculator
  
   as a user
  I want to do the credit calculation
  to verify the viability

  @creditCalculator @tools
  Scenario: successful credit calculator
    Given that you entered in the application credit calculator
    When I fill in the information requested by the application
      | ingresosMensuales | plazoEnAnos |
      |           2000000 |          20 |
    Then I get a result of credit calculation
    And send the user's data to the bank
      | nombreUsuario      | cedulaUsuario | correoElectronicoUsuario | telefonoUsuario | ciudadUsuario |
      | juan pablo segovia |    1098017262 | juansegovia@gmail.com    |      3126549110 | bogota        |

  @quotaCalculator @tools
  Scenario: successful quota value calculator
    Given that you entered in the application credit calculator
    When I fill in the information requested by the calculation request
      | valorCredito | plazoEnAnos |
      |    100000000 |          10 |
    Then I get a calculation result of the quotas
    And send the user data to the bank
      | nombreUsuario      | cedulaUsuario | correoElectronicoUsuario | telefonoUsuario | ciudadUsuario |
      | pedro pablo ibanez |    1032441763 | pedropablo@ibanez.com    |      3048641313 | bogota        |
