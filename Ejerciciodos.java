package ejerciciodos;

import java.util.Scanner;


public class Ejerciciodos {
 Scanner sc = new Scanner(System.in);
    
    static class Nodo {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;
    Nodo inicio = null;
    
    public void agregar() {
        Nodo temp = new Nodo();
        System.out.println("agregar el dato ");
        temp.dato=sc.nextLine();
        
        if (fin == null) {
            fin = temp;
            fin.sig = null;
            inicio = temp;
        } else {
            inicio.sig=temp;
            temp.sig = null;
            inicio = temp;
            System.out.println("Dato agregado "+ inicio.dato);
        }
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.println(" DATO " + "" + actual.dato + "");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
    public void eliminarultimonodo (){
        
        System.out.println("Dato eliminado: "+ fin.dato);
        fin = fin.sig;
        
    }

    public void eliminarprimernodo (){
        Nodo actual = fin;
        while(actual.sig != inicio ){
            actual = actual.sig;
        }
       System.out.println("Dato eliminado: "+ inicio.dato);
       actual.sig = null;
       inicio = actual;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Ejerciciodos n = new Ejerciciodos();
        do {
            System.out.println(("\n》》》》》》MENU NODOS《《《《《《《\n"
                    + "1 Agregar \n"
                    + "2 Mostrar \n"
                    + "3 Eliminar primer dato introducido \n"
                    + "4 Eliminar ultimo dato \n"
                    + "5 Salir \n" ));
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                 
                case 3:
                    n.eliminarultimonodo();
                    break;
                 
                case 4:
                    n.eliminarprimernodo();
                    break;
            }
        } while (opt != 6);
    }
}
    
