package pila;

import java.util.Scanner;//libreria mandamos a llamar al metodo Scanner para poder utilizarlo

public class Pila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto que no ayudara a leer los datos del teclado 
        int tope = 0, opcion = 0; //creacion de variables son =0 por que los estamos iniciando de 0 "contadores"
        System.out.println("Esta pila trabaja con letras\n ");
        char pila[] = new char[27]; //declaracion y creacion de la pila
        do {//para repetir ciertos pasos hasta que se cumpla la condicion
            System.out.println("\nelija la opcion\n ");
            System.out.println("1.Ingrese dato\n");
            System.out.println("2.Mostrar pila \n");
            System.out.println("3.Llenar pila \n");
            System.out.println("4.Borra la ultima letra \n");
            System.out.println("5.Ordenar pila \n");
            System.out.println("6.Acomo de pila aleatoriamente \n");
            System.out.println("7.salir \n");
            opcion = sc.nextInt();//mandas a llamar al objeto sc
            switch (opcion) {//va a tranbajar con nuestra variable "opcion"
                case 1://casos
                    if (tope == 27) {
                        System.out.print("La pila esta llena");
                    } else {//cuando no se cumple la condicon del if

                        System.out.println("Ingrese la letra\n");
                        pila[tope] = sc.next().charAt(0);//vamos a leer un tipo caracter y la vamos a posicionar en la pila en la posicion 0
                        tope++;//va a sumar 1
                    }
                    break;
                case 2://caso 2
                    if (tope == 0) {
                        System.out.print("Pila vacia");
                    } else {
                        for (int x = tope - 1; x >= 0; x--) {//para poder imprimir la pila, 
                            System.out.print(" " + pila[x]);
                        }
                    }
                    break;//finalizacion del caso
                case 3:
                    int x = 65;
                    for (; tope < 26; tope++) {//65 donde se inicia el valor de a y por cada vez que se cumpla el for
                        pila[tope] = (char) x;//sumara 1 el valor de la variable que ocupamos 
                        x++;
                    }
                    System.out.println("Estoy lleno :3");

                    break;
                case 4:
                    if (tope == 0) {
                        System.out.print("No hay letras para eliminar ");
                    } else {
                        tope--;//vamos a quitarle un numero al selecionar la opcon de borrar una letra
                        System.out.print("Letra eliminada");
                    }
                    break;

                case 5:
                    char aux;
                    for (int b1 = 0; b1 < tope; b1++) {
                        for (int b2 = 0; b2 < tope - 1; b2++) {
                            if (pila[b2] < pila[b2 + 1]) {
                                aux = pila[b2];
                                pila[b2] = pila[b2 + 1];
                                pila[b2 + 1] = aux;

                            }
                        }
                    }

                    System.out.println("Pila ordenada\n");

                    break;
                case 6:
                    if (tope == 26) {
                        System.out.println("La pila esta llena\n");
                    } else {
                        for (; tope < 26; tope++) {
                            pila[tope] = (char) ((Math.random() * (90 - 65 + 1)) + 65);
                        }
                        System.out.println("Pila llena auntomaticamente");

                    }

            }

        } while (opcion != 7);//son los 5 casos que se deben de cumplir y finalizara el programa

    }

}
