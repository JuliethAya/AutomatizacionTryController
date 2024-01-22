Feature: Prueba de un login

  Scenario Outline: login exitoso
    Given Julieth ingresa a sitio <web>
    When Julieth ingresa sus credenciales
      | username   | password   |
      | <username> | <password> |
    Then Julieth ve el logo de la empresa
    Examples:
      | web                                         | username              | password |
      | https://trycontroller-qa.azurewebsites.net/ | carol.ti@onoff.com.co | 123456   |

