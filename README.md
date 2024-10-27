# Challenge_ONE_Conversor_de_Monedas
Challenge conversor de monedas, realizado para el programa ONE de Oracle y AluraLATAM.

- Estado del proyecto: Finalizado con opcion de actualización.
  # Se desarrollo una aplicaión para realizar la conversión de diferentes monedas, realizando solicitudes a una API de tasas de cambio.
  - En total la aplicaión esta compuestas por las siguientes 3 clases:
    - Principal.java.
    - Conversor.java.
    - ConsultaConversion.java.

  ## Funcionalidades del proyecto.

- Clase Principal.
  - `Funcionalidad 1`: Se encuentra el metodo de captura de información.
  - `Funcionalidad 2`: En el main se podra encontrar el objeto teclado para recibir la información.
  - `Funcionalidad 3`: Se podra encontrar el menú del conversor con los diferentes casos de las opciones de ocnversión.
  - `Funcionalidad 4`: Al final se encontrará el try catch de comprobación.
- Clase Conversor.
  - `Funcinalidad 1`: Se encontrará el método de conversión a peso Argentino.
  - `Funcionalidad 2`: Se encontrará el método de conversión a dolar Americano.
  - `Funcionalidad 3`: Se encontrará el método de conversión a real Brasileño. 
  - `Funcinalidad 4`: Se encontrará el método de conversipon a peso Colombiano.
- Clase ConsultaConversion.
  - `Funcionalidad 1`: Se encuentra al inicio un switch case para obtener la opción para seleccionar el tipo de moneda por el que se desea realizar la consulta.
  - `Funcionalidad 2`: Se encuentra el código de la URI para realizar la consulta a la API.
  - `Funcionalidad 3`: Se encuentra el cliente y la solicitud HttpRequest.
  - `Funcionalidad 4`: Al final se encuentra el try catch de comprobación.
