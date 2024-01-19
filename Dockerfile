# Utiliza una imagen base con Java 13 y Alpine Linux
FROM openjdk:13-alpine

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR construido en el paso de construcción
COPY target/delicias.jar delicias.jar

# Expone el puerto 8080 que utiliza Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor se inicia
CMD ["java", "-jar", "delicias.jar"]
