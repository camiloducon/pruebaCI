Feature: insurance calculator
  
   as a user
  I want to do the insurance calculation
  to validate the cost of insurance

  Scenario: successful insurance calculator
    Given that you entered in the application insurance calculator
    When I enter the required data
      | valorBasicoMensual | valorAdministracion |
      |            2000000 |              200000 |
    Then I get a result of insurance calculation
    And send the user data to the candidate bank
      | nombreUsuario | cedulaUsuario | correoElectronicoUsuario | telefonoUsuario | ciudadUsuario |
      | juan          |    1032441728 | juan@juan.com            |       312654911 | Pereira       |
