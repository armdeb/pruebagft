# Prueba técnica GFT e Inditex

Prueba técnica para Inditex donde explicamos los pasos seguidos y requisitos del sistema para ejecutarlo

## Requisitos

* Java 17+ instalado
* Lombok instalado en el IDE

## Explicación

Se ha usado una arquitectura hexagonal por ser la preferida por la empresa para la prueba. He usado un facade para evitar los antipatrones ya que el servicio no debería de componer
El modelo quedó sin lógica asi como alguna gestión de excepciones, pero no era necesario añadir nada más asique  seguimos el enunciado usando el código justo.
El servicio se ha quedado como una pasarela al repositorio por falta de lógica fuera de la BDD. 

### Principios
Se han usado los principios SOLID y he decidido usar las interfaces de  JPA para construir queries abstractas a través del nombre del método. El nombre de la operación queda bastante claro y la querie que va a realizar

#### Ejecución y pruebas 
 Existe una clase con las pruebas mçínimas en su correspondiente carpeta que puedes ejecutar desde tu IDE( probado con Intellij)

PARA PRUEBAS CON POSTMAN 

Paso 1: Iniciar la Aplicación Spring Boot
	Para ejecutar: mvnw spring-boot:run


Paso 2: Configurar Postman

Abrimos Postman y asegúrate de tener configurado un entorno con las variables necesarias para los parámetros de tu solicitud (applyDate, productId, brandId).


Paso 3: Crear una Solicitud en Postman
Creamos  una nueva solicitud en Postman seleccionando el método GET.
Ingresamos la URL de nuestro endpoint  http://localhost:8080/precios

Agrega los parámetros a la solicitud utilizando las variables del entorno configurado.
Paso 4: Enviamos la Solicitud desde Postman
Haclcemos clic en el botón "Send" para enviar la solicitud.

Paso 5: Verificar la Respuesta
Verifica la respuesta en la pestaña "Body" de Postman para asegurarte de que la respuesta sea la esperada. Podemos revisar también las pestañas "Headers" y "Status" para obtener información adicional.