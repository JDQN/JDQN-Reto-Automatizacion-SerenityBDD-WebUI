Feature: El usurio realizar la compra de suplementos deportivos
  en el aplicativo zonafit

  Rule: Como usuario quiero comprar suplementos deportivos
        para el rendimiento deportivo

    Scenario: O2 - Se realiza una compra no exitosa de los suplementos deportivos
      Given el usuario esta en la pagina de inicio del aplicativo
      When selecciona los productos para agreagar al carrtio de compras
      And da click en finalizar compra
      And diligencia el formulario sin ingresar numero de cedula
      Then aparece un mensaje Ingresa tu Documento de Identidad.



