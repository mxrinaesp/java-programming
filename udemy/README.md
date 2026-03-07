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