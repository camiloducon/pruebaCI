Feature: Search Property
  
  as a user of metrocuadrado
  I want to perform a search in the application
  to search with the different options

  Scenario: search property
    Given I want to rent a property
      | tipobusqueda | tipoinmueble | ciudadbarrio |
      | Arriendo     | Casas        | bogota       |
    When I search a property
      | palabraclave | precio        |
      | pruebatest   | 400001-500000 |
    Then it brings me the different options
      | nombre | telefono | email          |
      | pepito | prueba   | prueb1@pru.com |
