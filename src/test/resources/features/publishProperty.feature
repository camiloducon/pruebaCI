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
      | tipooferta | tipoinmueble | valorventa | valorarriendo | incluyeadministracion | valoradministracion | ubicacioninmueble | ubicacionexacta            | direccioninmueble | barrioinmueble | barrioinmuebleexacto       | estrato | areaprivada | areaconstruida | numeropisos | tiempoconstruido | habitaciones | banos | parqueaderos | tipoparqueadero | caracteristicaparqueadero | videoinmueble                               | comentariosadicionales    | avisoimpreso             |
      | Arrendar   | Casa         |  123000000 |        300000 | No                    |             1700000 | bogot             | Bogotá D.C. (Cundinamarca) | calle85 n 15-10   | chico          | CHICO - LA CABRERA - Chicó |       3 |          70 |            100 |           3 | Remodelado       |            2 |     2 |            2 | Comunal         | Cubierto                  | https://www.youtube.com/watch?v=Ju9NB00Oe3E | a b c d e f g h i j k l m | p o i u y t r h j k kl l |
