Feature: Publish Property
  
  as a user of metrocuadrad
  I want to publish the publication of my property
  to sell my property

  Scenario: Sell property
    Given I want sell my property
    When I select a plan
    And I made the login in the application
      | usuario              | contrasena |
      | stg14mar@yopmail.com | Colombia1* |
    Then I can fill out the necessary information to publish my property
      | tipooferta | tipoinmueble | valorventa | valorarriendo | valoradministracion | ubicacioninmueble | ubicacionexacta            | direccioninmueble | barrioinmueble | barrioinmuebleexacto          | estrato | areaprivada | areaconstruida | numeropisos | tiempoconstruido | habitaciones | baños | parqueaderos |
      | Vender     | Finca        |  123000000 |        300000 |             1700000 | bogot             | Bogotá D.C. (Cundinamarca) | calle85 n 15-10   | chico          | SAN CRISTOBAL NORTE - Country |       3 |          70 |            100 |           3 |               10 |            2 |     2 |            2 |
