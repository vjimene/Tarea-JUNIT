# Emulador de máquina de café
## Descripción
Este programa emula una máquina de café la cual contiene acciones básicas como vender bebidas, ver inventario y agregar materias primas.

## Tecnología
- `Java` como lenguaje de programación.
- `Junit` como framework de pruebas unitarias.
- `log4j` para loggear.
- `Maven` para gestión de paquetes.
- `Eclipse` como IDE.

## Instalación
Para este programa se utilizó el lenguaje de programación `Java`, el cual puede se obtenido en [este link](https://www.java.com/es/), utilizado en el entorno de desarrollo Eclipse. Para implementar distintas bibliotecas se utilizó el gestor `Maven`, el cual se requiere para ejecutar este programa y puede ser obtenido [aquí](https://maven.apache.org). Luego, se requiere descargar esta carpeta en su máquina local.  

## Instrucciones de uso
Una vez descargada la carpeta, abrir desde el Eclipse y correr desde la interfaz del IDE.  
Lo primero que el programa solicitará serán 3 recetas, de la siguiente forma:
```
  Primera receta
  nombre de receta: Café con leche
  precio: 200
  unidades de cafe: 4
  unidades de chocolate: 0
  unidades de leche: 2
  unidades de azucar: 2
```
Donde el precio y las unidades de café, chocolate, leche y azucar son número enteros.  
Una vez ingresadas las 3 recetas el programa entra en un estado de espera, donde el usuario puede seleccionar entre 3 opciones:
```
[1] Agregar inventario
[2] Verificar inventario
[3] Comprar bebida
```
Para seleccionar debe ingresar por teclado el número al que corresponde su opción. 
- Si selecciona [$1$]:
    El programa solicitará ingresar inventario de la siguiente forma:
    ```
    Unidades de cafe: 20
    unidades de chocolate: 20
    unidades de leche: 20
    unidades de azucar: 20
    ```
    Todas las unidades del inventario son enteros.
    Hay que destacar que por defecto, la máquina comienza con el inventario en 0
- Si selecciona [$2$]:
  El programa muestra el inventario de la siguiente forma:
  ```
  Unidades de cafe: 20
  Unidades de leche: 20
  Unidades de chocolate: 20
  Unidades de azucar: 20
  ```
  
- Si selecciona [$3$]:
  El programa solita ingresar 
  ```
  Seleccione una receta de café
    [1] cafe con leche precio: 200
    [2] cafe americano precio: 150
    [3] chocolate caliente: 250
  ```
  Luego, solicita el dinero para comprar 
  ```
  ingrese el dinero: 200
  ```
  Todo en valores enteros
