package gt.umg.prograII;

import java.util.Scanner;

public class Test {
    static Alumno alumno;
    static Producto producto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresela opcion que desea ejecutar");
        System.out.println("1.....................Alumno");
        System.out.println("2.....................Producto");
        System.out.print("Escoga su opcion: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el nombre:");
                alumno.setCarne(sc.nextLine());
                System.out.println("Ingrese el carnet");
                alumno.setCarne(sc.nextLine());
                System.out.println("Ingrese la edad del alumno");
                alumno.setEdad(sc.nextInt());
                break;
            case 2:
                System.out.println("Ingrese Id");
                producto.setIdentficador(sc.nextInt());
                System.out.println("Ingrese el nombre");
                producto.setNombre(sc.nextLine());
                System.out.println("Ingrese el precio");
                producto.setPrecio(sc.nextDouble());
                break;
        }

    }
}
