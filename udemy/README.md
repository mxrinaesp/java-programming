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