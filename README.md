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

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/89d5ac26-4d0c-448c-9b58-d9c962f8ae10)

![image](https://github.com/danielsperezb/BonoParcialArep/assets/101849347/0a112e1a-f682-4de0-afc2-771888b75b4b)


Pegas esa url con el pull: docker pull danielsperezb/bonoparcial

Y en tu linea de comandos pones:

docker run -d -p 34005:6000 --name bonoparcialdockercontainer3 danielsperezb/bonoparcial

Puedes cambiar el bono de 34005 a 34007 o el que gustes, y tambien el nombre de bonoparcialdockercontainer3 a bonoparcialdockercontainer4


