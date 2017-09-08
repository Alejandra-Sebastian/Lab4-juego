## Escuela Colombiana de Ingeniería
## Procesos de desarrollo de Software – PDSW
## Ejercicio de laboratorio


# Parte I. - Jugando a ser un cliente HTTP

1. Abra una terminal Linux.
2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
	* Host: www.escuelaing.edu.co
	* Puerto: 80

	Teniendo en cuenta los parámetros del comando telnet:

	```bash
	telnet HOST PORT
	```

3. Antes de que el servidor cierre la conexión por falta de comunicación:	
	* Revise la página 36 del [RFC del protocolo HTTP](https://tools.ietf.org/html/rfc2616), sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso 'sssss/abc.html', usando la versión 1.0 de HTTP.
	* Asegúrese de presionar ENTER dos veces después de ingresar el comando.
	* Revise el resultado obtenido. Qué codigo de error sale?, revise el significado del mismo en [la lista de códigos de estado HTTP](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes).
	* Qué otros códigos de error existen?, en qué caso se manejarán?

4. Realice una nueva conexión con telnet, esta vez a:
	* Host: www.info.gov.hk
	* Puerto: 80
	* Versión HTTP: 1.1

	Ahora, solicite (GET) el recurso /index.html. Qué se obtiene como resultado?

Muy bien!, acaba de usar del protocolo HTTP sin un navegador Web!. Cada vez que se usa un navegador, éste se conecta a un servidor HTTP, envía peticiones (del protocolo HTTP), espera el resultado de las mismas, y -si se trata de contenido HTML- lo interpreta y dibuja. Claro está, las peticiones GET son insuficientes en muchos casos. Investigue: cual es la diferencia entre los verbos GET y POST?
