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
      |              | 200'000.001 a 250'000.000 |                 |                 | 61 a 100 |            4 |     4 |       3 | Sobre Plano |
    Then it brings me the different options
      | nombre         | telefono    | correo         |
      | carlos peralta | 31224472728 | prueb1@pru.com |
