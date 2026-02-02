## First Java file
    - debe haber una class que coincida con el nombre del archivo

    - dentro de esa class va lo principal de los archivos java: main method.
        <<public static void main (String args[]){}>>

        * void: no necesita return un valor
        * static: podemos ejecutar el method sin necesidad de un objeto

    -dentro del method escribimos lo que va a aparecer(print) en el output cuando "run code":
        System.out.print("...");

    -ctrl-s y guardar con la extensión .java


## Consume a class instance
    - abajo tenemos una clase (Product) y dentro de ella un tipo(coffee/tea), un nombre(medium roast/organic white) y un precio (9.99/7.99)  

    - arriba tenemos la clase y la instancia (o ejemplo):
        Product product1 = new Product(type, name, price);
    
    - ejecutamos el código:
        System.out.println(product1.name) o (product1.type)
    y nos aparece el nombre o tipo de ese ejemplo en el output