Feature: Find Property
  
  as a user of metrocuadrado
  I want to perform a find in the application
  to search with the different options

  @successful
  Scenario: search property
    Given I want to rent a property
      | tipobusqueda | tipoinmueble | ciudadbarrio |
      | Compra Nuevo | Casas        |              |
    When I find a property
      | palabraclave | preciocompra              | valorrangodesde | valorrangohasta | area     | habitaciones | banos | garajes | antiguedad  |
      |              | 100'000.001 a 150'000.000 |                 |                 | Hasta 60 |            2 |     1 |       1 | Sobre Plano |
    Then it brings me the different options
      | nombre                | telefono    | correo                  |
      | carlos andres peralta | 31224472728 | carlossndresp@gmail.com |
