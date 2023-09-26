-----------------DOCKER IMAGEN CON TODO COMPLETADO----------------------

Pasos:

1. ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/835544de-66c0-4f33-89a9-71e15ff1e4d3)
   
2. Revisamos que se creo bien (OPCIONAL)
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/41b73234-e2a8-426b-b6d1-7169ab950122)

3. Ahora creamos una instacia, podrian ser mas. De la imagen creada anteriormente: y con el puerto 6000 enlazado a un puerto físico de su máquina (opción -p):
    ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/a041b350-6ed1-4fff-b50c-3fbf03748c76)

4. Ver si el contenedor esta corriendo (OPCIONAL)
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/47a92356-365a-4256-a7be-51e92933fe04)
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/dfea2d25-ae78-4f76-b7ed-8467f4ec5a0e)
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/7e1de94a-1e6b-40e9-a5b8-6d570c8bc99d)

5.  Creo el repositorio en Docker HUB:
  Esta vez lo nombre: finalbonoparcial

https://hub.docker.com/repository/docker/danielsperezb/finalbonoparcial/general
![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/d5b641a9-558f-46f9-9205-56e0e17dd9c4)

6. Nombre de nombre de nuestro repositorio a como la venimos llamando
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/d923562d-8a30-4382-958f-334dd4aded53)

7. Verificacion Opcional
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/dd946c9c-38a3-4c6a-be0a-3076de170a42)

8. Iniciamos Sesion en Docker
   ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/c4a20225-d1fe-4509-90eb-abfd686427ad)

9. Empuje la imagen al repositorio en DockerHub
    ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/2cbe607b-f94d-4051-9041-bbd986acb3bc)










Modifique su proyecto publicando servicios REST para calcular:

- Sin

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/b176e4a3-6a64-4af9-be35-f6b10a2d1577)

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/def8af36-03b2-4f50-ac4a-c3fb39444166)



- Cos

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/2320080f-ef90-4d01-bb89-ff5c7c6fc0df)
![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/1824602d-c4e2-485e-9b61-45b73df055b4)


- Determinar si una cadena es un palíndromo

  ![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/1114737d-b2f9-4c09-a39e-80cec0272835)
![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/bd27a604-0cec-4e81-a6e5-31f1ea71ff6a)


- Retorna la maginitud de un vector real de dos dimensiones, es decir recibe dos parámetros reales.


Modifique el Cliente para que se puedan llamar asíncronamente estas funciones, por ejemplo con una formulario para cada función.



Publíquelo en GIt.


FUNCIONAMIENTO EN DOCKER:


![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/1953a4df-99b8-4126-ab37-fd1e38419c3d)

sin:

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/5c210e27-01e0-4c42-8d34-6859508b0ba7)


cos:

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/5caa9b28-e076-4c54-bba8-2824e6e5ae03)

palindromo:

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/f92fc527-ac66-4c5f-b658-0ffe9fa13884)


SUBI A DOCKER HUB:

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/91042833-d1f3-479e-bb2a-b29f4224db60)

Donde ya se ven los tags

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/b50c33c4-b25f-47a7-9fe3-e3db03fd25d3)


Comandos: 
![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/cd6d74ab-c3a8-492c-82e3-66737fb636c6)


¿ Como subir la imagen de Docker a cualquier PC?

Vas a la siguiente url: https://hub.docker.com/r/danielsperezb/bonoparcial

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/d46af293-1ce2-404e-add5-4f61858d5c42)


![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/0a112e1a-f682-4de0-afc2-771888b75b4b)


Pegas esa url con el pull: docker pull danielsperezb/bonoparcial

Y en tu linea de comandos pones:

docker run -d -p 34005:6000 --name bonoparcialdockercontainer3 danielsperezb/bonoparcial

Puedes cambiar el bono de 34005 a 34007 o el que gustes, y tambien el nombre de bonoparcialdockercontainer3 a bonoparcialdockercontainer4


