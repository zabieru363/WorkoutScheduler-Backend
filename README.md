# Workout Scheduler

## Aplicación de rutinas y entrenamientos personalizados con Java + Springboot

### ¿En que consiste?
Se trata de una aplicación en la que los usuarios pueden crear rutinas de entrenamiento y compartirlas entre sí
para que la gente pueda entrenar en cualquier lugar de manera cómoda y sencilla. Ofrece rutinas de entrenamiento
ya creadas listas para que cualquier persona, ya sea principiante, intermedio o avanzado las pueda hacer ya que
la aplicación al registrarse el usuario esta le pregunta con que nivel cuenta. De todas formas el usuario tiene
la posibilidad de buscar rutinas ya que dispone de un buscador con filtros para ello.
También los usuarios pueden dejar valoraciones de las rutinas y dar me gusta, guardar en favoritos y guardados.

### Estado del proyecto
Todavía en desarrollo

### Librerías, módulos y recursos utilizados
- Java
- SpringBoot
- PostgreSQL
- Spring Data JPA
- Spring Security
- Lombok
- Spring Validator
- JWT
- JavaMailSender
- Map Struct
- Swagger

### Documentación de la API (en local)
http://localhost:8080/ws/api/v1/swagger-ui/index.html

### ¿ Cómo levantarlo en local?
- Bajate la rama develop del repositorio y haz una copia en tu máquina (ahí se van publicando los últimos cambios)
Esto lo puedes hacer con el siguiente comando: git clone https://github.com/zabieru363/WorkoutScheduler-Backend.git
- Instala JDK 17 o superior (recomendado JDK 17)
- Instala Docker Desktop para poder almacenar los contenedores
- Crea un fichero de variables de entorno .env en el root del proyecto y añádelo a la configuración de arranque del proyecto de tu IDE.
El nombre de las variables está en ./src/main/java/.../utils/EnvValidator (la única no necesaria es JWT_EXPIRATION, ya que tiene un valor
por defecto)
- La variable de entorno DB_URL debe de quedar así: jdbc:postgresql://localhost:5000/workout-schedule, de lo contrario la base de datos no
se creará correctamente al levantar los contenedores.
- Genera una palabra secreta para JWT, puedes hacerlo con esta web: https://jwtsecrets.com
- Pon ese token en tu archivo .env (en la variable JWT_SECRET)
- Haz un docker compose up -d para levantar los contenedores (el proyecto ya viene con un docker-compose.yml para crear automaticamente los contenedores)
- (Opcional): Para que funcione el envío de emails puedes añadir una cuenta de Google que no utilices y crear una contraseña de aplicación.
Esto puedes hacerlo desde Google Account. Una vez generada la contraseña de aplicación debes ponerla en la variable MAIL_PASSWORD
y la cuenta que vayas a usar en la variable MAIL_USERNAME de tu fichero .env
- Ya puedes levantar el proyecto y trabajar con la base de datos.

Puedes dejar aportaciones o ideas si te intersa ayudarme en el proyecto
