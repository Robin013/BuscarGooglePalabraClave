#autor Robinc

  Feature: Hallar un webSite dado una palabra clave
    Como un usuario del motor de busqueda
    necesito buscar la palabra reservada Bancolombia
    Para encontrar el sitio oficial del Grupo


  Scenario: Buscar el sitio oficial del grupo

    Given el sitio del motor de busqueda de Google
    When cuando digito la palabra a buscar Bancolombia
    And puedo navegar al sitio oficial
    Then puedo ver por el sitio oficial