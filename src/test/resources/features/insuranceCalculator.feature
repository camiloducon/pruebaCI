Feature: insurance calculator
  
   as a user
  I want to do the insurance calculation
  to validate the cost of insurance

  @successful
  Scenario: successful insurance calculator
    Given that you entered in the application insurance calculator
    When I enter the required data
      | valorBasicoMensual | valorAdministracion |
      |            1350000 |              178000 |
    Then I get a result of insurance calculation
    And send the user data to the candidate bank
      | nombreUsuario             | cedulaUsuario | correoElectronicoUsuario | telefonoUsuario | ciudadUsuario |
      | juan andres castro castro |    1042627262 | jaccastro@gmail.com      |      3147888929 | Pereira       |
