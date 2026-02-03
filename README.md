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


## Command-line arguments
    -podemos run code de dos maneras desde el terminal:

        * sin argument:
                ~/Escritorio/....$  javac ex112.java (java compiler + file name)
                                    java ex112.java 
    
        * con argument (porque vamos a multiplicar números): 
            - abro el archivo nuevo (ex113.java):
                    Dentro del archivo hay

                        public static void main (String args[]) {
                            String zero = args [0];
                            String one = args [1];

                            System.out.println(Integer.parseInt(zero) * Integer.parseInt(one));
                        }

                    Lo cual significa que hay dos elementos de texto (strings). Al ejecutarlos, Integer.parseInt "transforma" esos textos en números y permite hacer el cálculo.

            - compilo los cambios e información del archivo:
                ~/Escritorio/....$  javac ex113.java 

            - en el terminal escribo el comando y los números que quiero calcular:
                ~/Escritorio/....$  java ex113.java 8 9

            -le doy a intro, y el terminal me devuelve el resultado:
                ~/Escritorio/....$  java ex113.java 8 9 72


## Print statements
    - tenemos 3 print statements. El comando es system.out.print. Out es de output:
        System.out.print("Coffee");
        System.out.print("Small 1.00");
        System.out.print("Large 2.00");

    - así, van a salir todas las palabras juntas. Para que cada comando aparezca en líneas diferentes, usar println:
        System.out.println("Coffee");

    - para que haya un espacio mayor entre las palabras, usar \t (tab):
        System.out.println("Small\t 1.00");

    - para separar dos palabra en dos líneas sin hacer dos print statements separados, usar \n (new line):
        System.out.println("Large\n 2.00");


## Import and use the Scanner class
    - creamos un nuevo objeto ("in") dentro de la clase Scanner (sirve para leer lo que escribimos con el teclado):
        Scanner in = new Scanner(System.in);

    - al run code, va a salir una pregunta:
        System.out.println("Thank you for visiting us. What is your name?");

    - esto significa que el "in" que hemos creado va a leer una línea completa de texto que escribamos en el terminal y se va a guardar en name:
        String name = in.nextLine();

        Por eso, después del run code, si contestamos a la pregunta con "Marina", el "in" va a leer eso y ...

    - ... va a devolver esta frase con "Marina":
        System.out.println("Welcome, " + name);

    - para que la clase Scanner funcione, hay que escribir en la primera línea del archivo:
        import java.util.Scanner
    

## Variables in blocks
    - para que el system.out funcione, la variable (salesTax) debe estar dentro del mismo bloque de código donde se declaró: 
        if (location ==  "Utah") {
            double salesTax = .047;
            System.out.println("Your sales tax rate is " + salesTax * 100 + "%.");
        }

    Si la sacáramos del bloque del if, daría error, aunque estuviera dentro del main.


## Variables in methods
    - aquí java no compilará porque el double está solo en el bloque del if:
                if (location == "Utah") {
                double salesTax = .047;
                }
                else {
                    salesTax = .05;
                }

    - para que funcione, hay que escribir el double en el main y luego sí la variable (salesTax) en cada bloque:
        public static void main (String args []){
            String location = "Utah";
            double salesTax = .00;

                if (location == "Utah") {
                    salesTax = .047;
                }
                else {
                    salesTax = .05;
                }
        }
        
    Usamos el double antes de la variable porque son números decimales; String cuando es texto e int cuando son números enteros.
