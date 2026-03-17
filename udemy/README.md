# Sección 4 - Estructura Condicional

## Expressôes comparativas:
< menor que
> mayor que
<= menor o igual que
>= mayor o igual que
== igual
!= diferente

## Expressôes lógicas

### operadores lógicos
&& y (TODAS las condiciones tienen que ser verdaderas)
|| o (por lo menos UNA de las condiciones tiene que ser verdadera)
! no (invierte la condición. Ej: x=5 --> !x > 3 --> resultado = F pq sería verdadero pero al invertir, da falso)

## Estrutura condicional
### simple:
    if ( <condición>) {
        <comando 1>
        <comando 2>
    }

Ej:
    x=10    if ( x > 5) {
                <System.out.println("Boa tarde")>
                <System.out.println("Boa noite")>
            }

Como la condición es V, se van a ejecutar los dos comandos. Si fuera F (ej: x == 8), ignoraría los comandos.

### compuesta:
    if ( <condición>) {
        <comando 1>
        <comando 2>
    }
    else {
        <comando 3>
        <comando 4>
    }

Si la condición es V, ejecuta los comandos del bloque if (1,2). Si es F, ejecuta los del bloque else (3,4)

## Cadena de estructura condicional

    if ( <condición 1>) {
        <comando 1>
        <comando 2>
    }
    else if ( <condición 2>) {
            <comando 3>
            <comando 4>
    }
    else {
            <comando 5>
            <comando 6>
    }

## Operadores de atribución acumulativo

a += b -----> a = a + b;
a -= b -----> a = a - b;
a *= b -----> a = a * b;
a /= b -----> a = a / b;
a %= b -----> a = a % b;

## Sintaxis SWITCH-CASE (muchos if else juntos)

    switch (expresión) {

    case valor1:
        comando1;
        comando2;
        break;

    case valor2:
        comando3;
        comando4;
        break;
    ...

    default:    //este sería el último else aka la opción que queda si ninguna se cumple//
        comando5;
        comando6;
        break;

    }

# Sección 5 - Extructura Repetitiva

## Estructura while: (no se sabe previamente el nº de repeticiones)
    while (condición) {
        comando 1
        comando 2
    }
si la condición es V, ejecuta los comandos y vuelve a la condición;
si la condición es F, salta fuera de la estructura y no ejecuta los comandos;

VIP: preguntar siempre cuál es la condición para que se mantenga el loop (ayuda a saber qué poner dentro de los paréntesis de while);

## Estructura for: (se sabe el nº de repeticiones)
    for (inicio; condición; incremento) {
        comando 1
        comando 2
    }

inicio: solo se ejecuta la primera vez;
condición: = a while;
incremento: ejecuta cada vez que dé la vuelta;

### cuenta regresiva
    for (int i=4; i>=0; i--) {
        System.out.println("valor de i: " + i);
    }

## Estructura do-while: 
    do {
        comando 1
        comando 2
    } while (condición);

El bloque de comandos se ejecuta una vez OBLIGATORIAMENTE, y si la condición fuera V, se repite, si no, salta fuera.


# Sección 6 - Vectores

Un vector o array unidimensional es una colección de datos de tamaño fijo, indexada (acceso a elementos por medio de índices) y homogénea (datos del mismo tipo).

La primera posición de un vector en Java es 0.
El array debe guardarse antes de utilizarse y una vez guardado, su qtd de elementos es fija.

## Cómo crear un vector

Declaración:
    int[] A;               declaración de un vector de números enteros llamado A.

    String[] B;            declaración de un vector de texto llamado B.

Instancia:
    A = new int[10];        creación de un nuevo vector con 10 números enteros (de 0 a 9).

    B = new String[8];      creación de un vector de Strings con posición de 0 a 7.

## Cómo acceder a los elementos de un vector

    A[3] = 10;                          colocar el valor 10 en la posición 3 del vector A.
       

    for (int i=0; i<5; i++) {           en el vector A, posición 0, entrará el valor 10...
        A[i] = i + 10;                                           1, entrará el valor 11...
    }                                   y así hasta que la posición 4 porque i<5.


## Estructura for each: tipo de vector + mote + : + nombre de la colección

En vez de usar:                                    Tenemos la String[] ciudades y creamos una variable i
    for (int i=0; i < N; i++) {                    para hacer la cuenta.
        System.out.println(ciudades[i]);
    }

Usamos:
    for (String c : ciudades) {                    Para cada String c(o cualquier otro nombre que funcione 
        System.out.println(c);                     como mote de cada elemento del vector) dentro del vector ciudades.
    }

Sirve para recorrer una colección entera sin tener que hacer el for(int i=0;i< N;i++) { ciudades[i]; }


# Sección 7 - Matrices

Una matriz o array bidimensional(líneas y columnas) es una colección de datos de tamaño fijo, indexada (acceso a elementos por medio de índices) y homogénea (datos del mismo tipo).

La primera posición de una matriz en Java es 0,0 (línea 0, columna 0).
El array debe guardarse antes de utilizarse y una vez guardado, su qtd de elementos es fija.

## Cómo crear una matriz

Declaración:
    int[][] A;               declaración de una matriz de números enteros llamada A.

    String[][] B;            declaración de una matriz de texto llamada B.

Instancia:
    A = new int[2][3];        creación de una nueva matriz que recibe 2 líneas y 3 columnas.

    B = new String[8][4];      creación de una matriz de Strings que recibe 8 líneas y 4 columnas

## Cómo acceder a los elementos de una matriz

    A[2][3] = 10;                       colocar el valor 10 en la línea 2, columna 3 de la matriz A.
       

    for (int i=0; i<2; i++) {           en la matriz A, línea 0, columna 0, entrará el valor sc...
        for (int j=0; j<3; j++) {                                        1, entrará el valor sc...
            A[i][j] = sc.nextInt();                                      2, entrará el valor sc... porque j<3.
        }                                                     1, columna 0, entrará el valor sc...
    }                                   


La diagonal principal de una matriz es mat[i][i];