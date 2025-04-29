# walmart-exam
Examen practico.

Para este examen se deberán utilizar las siguientes tecnologías: Java 1.8, Spring Boot.

1.	Crear un proyecto con los IDs Eclipse o STS haciendo referencia a un proyecto con Spring Boot y maven. En la creación del proyecto especificar el paquete “com.walmart.test”, el Group “com.walmart” y el nombre “sts-prueba-z18”. Incluir en el proyecto las librerías de Spring Data JPA y Spring WEB.
2.	Crear 3 paquetes para incluir las diferentes capas de la prueba: com.walmart.test.service, com.walmart.controller, com.walmart.test.repository y com.walmart.test.vo.
3.	Crear 1 controlador llamado TestController, declarar un request mapping en el controlador con el valor “/api/searchArray”, debe ser de tipo POST, este método recibirá 2 parámetros cada uno será un Array de Strings. 
4.	Validar que los parámetros de entrada estén llenos y no sean nulos, arrojar un error contralado para cada uno de ellos.
5.	Crear 1 servicio llamado TestService que sea llamado por el controlador donde se incluya un método que realice la siguiente lógica: 

El arrayA recibir una lista de Strings con diversos productos por ejemplo:

POLLO 
AGUACATE
TOMATE
CELULAR
MOCHILA
PC
BOCINA
MOCHILA
POLLO 
HUEVO
TOMATE

El arrayB recibirá otra lista de Strings mas pequeña por ejemplo

TOMATE
MOCHILA

El servicio contara cuantas veces se repite cada elemento del arraB en el arraA y regresara un arrayC con el resultado por ejemplo:

arrayC

TOMATE - 2 veces
MOCHILA – 2 veces

6.	Compilar el servicio y desplegar el archivo war en un servidor tomcat o levantarlo directamente con spring boot.
7.	Probar desde SoapUi o alguna otra herramienta el servicio.
8.	Extra!!! – Crear una aplicación en angular o reactJS que consuma el servicio.
