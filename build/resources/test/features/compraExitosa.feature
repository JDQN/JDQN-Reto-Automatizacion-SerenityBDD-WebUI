Feature: El usurio realizar la compra de suplementos deportivos
         en el aplicativo zonafit

  Rule: Como usuario quiero comprar suplementos deportivos
        para el rendimiento deportivo

  Scenario: 01 - Se realiza la compra exitosa de los suplementos deportivos
    Given el usuario esta en la pagina de inicio del aplicativo zonafit
    When selecciono los productos para agregar al carrtio de compras
    And da click en finalizar compra diligenciar el formulario correctamente
    Then aparece un mensaje Gracias. Tu pedido ha sido recibido.

