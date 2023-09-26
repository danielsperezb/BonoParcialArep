# Docker Imagen con Todo Completado - ¿Cómo Probarlo?

**URL Pública del Docker Hub:** [https://hub.docker.com/r/danielsperezb/finalbonoparcial](https://hub.docker.com/r/danielsperezb/finalbonoparcial)

1. Abre tu CMD.
2. Pega el comando Docker Pull: `docker pull danielsperezb/finalbonoparcial`
3. Luego, ejecuta el contenedor con el comando: `docker run -d -p 34000:6000 --name finalbonoparcialcontainer danielsperezb/finalbonoparcial`

Puedes acceder a las funciones desde tu navegador:

- [http://localhost:34000/index.html](http://localhost:34000/index.html) para probar todas las funciones juntas.
- O prueba cada función por separado con las siguientes URLs:

  - **Sin:** [http://localhost:34000/sin/2](http://localhost:34000/sin/2)
  - **Cos:** [http://localhost:34000/cos/2](http://localhost:34000/cos/2)
  - **Palíndromo:** [http://localhost:34000/palindromo/assa](http://localhost:34000/palindromo/assa)
  - **Magnitud Vector:** [http://localhost:34000/magnitudVector/2/3](http://localhost:34000/magnitudVector/2/3)

## Pruebas de Funcionamiento por Separado

### Sin:

![Sin](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/2ff71f78-c566-4a20-940e-73eed7c40f03)

### Cos:

![Cos](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/551e2272-a721-4705-a94b-0dbd77d7a43b)

### Palíndromo:

![Palíndromo](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/bee5903a-6edc-4160-b17f-53c341a15622)

### Magnitud Vector:

![Magnitud Vector](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/feacca08-2e16-4045-b654-bca579aa18cd)

## Pruebas de Funcionamiento todo junto:

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/c3f96e34-9d4f-422d-b2d1-149cd32320ec)


# Parte 2 - Finalización de Magnitud de Vector y Cliente Asíncrono

Modificamos el proyecto para publicar servicios REST que calculan:

- Retorna la magnitud de un vector real de dos dimensiones. Por ejemplo: [http://localhost:4567/magnitudVector/1/1](http://localhost:4567/magnitudVector/1/1)

![Magnitud Vector](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/54a4a61b-877c-40d3-945e-26580c8005f8)
![Magnitud Vector](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/a0e0d238-9519-4374-a512-bfba9d2c4942)

Modificamos el Cliente para que se puedan llamar asíncronamente estas funciones, por ejemplo, con un formulario para cada función.

# Primera Parte Realizada (Contiene todo excepto el cliente con formularios y la magnitud del vector)

Modificamos el proyecto para publicar servicios REST que calculan:

- **Sin:** [http://localhost:4567/sin/2](http://localhost:4567/sin/2)

![Sin](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/b176e4a3-6a64-4af9-be35-f6b10a2d1577)
![Sin](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/def8af36-03b2-4f50-ac4a-c3fb39444166)

- **Cos:** [http://localhost:4567/cos/2](http://localhost:4567/cos/2)

![Cos](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/2320080f-ef90-4d01-bb89-ff5c7c6fc0df)
![Cos](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/1824602d-c4e2-485e-9b61-45b73df055b4)

- **Determinar si una cadena es un palíndromo:** [http://localhost:4567/palindromo/assa](http://localhost:4567/palindromo/assa)

![Palíndromo](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/1114737d-b2f9-4c09-a39e-80cec0272835)
![Palíndromo](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/bd27a604-0cec-4e81-a6e5-31f1ea71ff6a)

## Funcionamiento en Docker

![Funcionamiento en Docker](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/1953a4df-99b8-4126-ab37-fd1e38419c3d)

**Sin:**

![Sin](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/5c210e27-01e0-4c42-8d34-6859508b0ba7)

**Cos:**

![Cos](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/5caa9b28-e076-4c54-bba8-2824e6e5ae03)

**Palíndromo:**

![Palíndromo](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/f92fc527-ac66-4c5f-b658-0ffe9fa13884)

## Subí a Docker Hub

![Subí a Docker Hub](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/91042833-d1f3-479e-bb2a-b29f4224db60)

Donde ya se ven los tags

![Tags](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/b50c33c4-b25f-47a7-9fe3-e3db03fd25d3)

Comandos:

![Comandos](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/cd6d74ab-c3a8-492c-82e3-66737fb636c6)

**Final Primera Parte Realizada (Contiene todo excepto el cliente con formularios y la magnitud del vector)**

## Extra

### A) Pasos para Subir la Imagen a Docker Hub

1. Verifica que tu imagen se haya creado correctamente.
   ![Verificación](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/835544de-66c0-4f33-89a9-71e15ff1e4d3)

2. Crea una instancia del contenedor a partir de la imagen, enlazando un puerto físico de tu máquina al puerto 6000 del contenedor.
   ![Creación de Instancia](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/a041b350-6ed1-4fff-b50c-3fbf03748c76)

3. Verifica que el contenedor esté en ejecución (opcional).
   ![Contenedor en Ejecución](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/47a92356-365a-4256-a7be-51e92933fe04)

4. Crea un repositorio en Docker Hub, dándole el mismo nombre que has estado utilizando.
   ![Creación de Repositorio](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/d5b641a9-558f-46f9-9205-56e0e17dd9c4)

5. Inicia sesión en Docker Hub.
   ![Inicio de Sesión](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/c4a20225-d1fe-4509-90eb-abfd686427ad)

6. Empuja la imagen al repositorio en Docker Hub.
   ![Empujar la Imagen](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/2cbe607b-f94d-4051-9041-bbd986acb3bc)

### B) Cómo Descargar la Imagen en Otra PC

1. Abre una terminal y ejecuta el comando `docker pull danielsperezb/bonoparcial` con la URL de la imagen en Docker Hub.
   ![Descargar la Imagen](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/d46af293-1ce2-404e-add5-4f61858d5c42)

2. Luego, crea una instancia del contenedor como lo hiciste anteriormente, enlazando el puerto que desees.
   ![Creación de Instancia](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/0a112e1a-f682-4de0-afc2-771888b75b4b)
