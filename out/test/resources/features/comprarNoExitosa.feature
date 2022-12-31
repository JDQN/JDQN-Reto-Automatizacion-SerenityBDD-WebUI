Feature: El usurio realizar la compra de suplementos deportivos
  en el aplicativo zonafit

  Rule: Como usuario quiero comprar suplementos deportivos
        para el rendimiento deportivo

    Scenario: O2 - Se realiza la no compra exitosa de los suplementos deportivos
      Given el usuario esta en la pagina de inicio del aplicativo zonafit
      When selecciono los productos para agregar al carrtio de compras
      And da click en finalizar compra
      And en el formulario ingresa el numero de cedula incorrecto
      Then aparece un mensaje Ingresa tu Documento de Isdentidad.