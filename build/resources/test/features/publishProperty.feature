Feature: Publish Property
  
  as a user of metrocuadrad
  I want to publish the publication of my property
  to sell my property

  @successful
  Scenario: Sell property ocasional
    Given I want sell my property
    When I select a plan
    And I made the login in the application
      | usuario              | contrasena |
      | stg14mar@yopmail.com | Colombia1* |
    Then I can fill out the necessary information to publish my property
      | tipooferta | tipoinmueble | valorventa | valorarriendo | incluyeadministracion | valoradministracion | ubicacioninmueble | ubicacionexacta            | direccioninmueble | barrioinmueble | barrioinmuebleexacto       | estrato | areaprivada | areaconstruida | numeropisos | tiempoconstruido | habitaciones | banos | parqueaderos | tipoparqueadero | caracteristicaparqueadero | videoinmueble                               | comentariosadicionales                                                           | avisoimpreso                                             |
      | Arrendar   | Casa         |  123000000 |        300000 | No                    |             1700000 | bogot             | Bogotá D.C. (Cundinamarca) | calle85 n 15-10   | chico          | CHICO - LA CABRERA - Chicó |       3 |          70 |            100 |           3 | Remodelado       |            2 |     2 |            2 | Comunal         | Cubierto                  | https://www.youtube.com/watch?v=Ju9NB00Oe3E | para la prueba se realiza el envio de datos de prueba que fueron sacados al azar | todo lo que se necesite para que el aviso sea disponible |

  @constructora
  Scenario: publish property constructora
    Given I want to publish a property
    When I entered the data login
      | usuario                   | contrasena |
      | fecharegistro@yopmail.com | ZTUVMQi    |
    Then select the information required to publish the property
      | nombreproyecto | tipoinmueble | etapaconstruccion | descripcionproyecto                                     | tiempoconstruido | parqueaderovisitantes | sobreviaprincipal | sobreviasecundaria | moneda   | fechaestimadaentrega | ciudadproyecto | direccionproyecto | nombrebarrioproyecto | estratoproyecto | vigilancia | videoproyecto                               | emailcontacto | nombresalaventas | mismaubicacionproyecto | ciudadsala | direccionsala | nombrebarriosala | estratosala | celularsala | viawhatsapp | telefonofijosala | extensionsala |
      | Arrendar       | Apartamento  | Para Entrega      | es algo nuevo A LA VENTA PARA LA DISTRIBUCION A PUBLICO | Entre 0 y 5 anos | Si                    | No                | Si                 | Dolar US | 10-10-2019           | Bogota         | calle 85 n 12 -10 | macarena             |               5 |          0 | https://www.youtube.com/watch?v=Ck_BOyWBzXo |               |                  |                        |            |               |                  |             |             |             |                  |               |
