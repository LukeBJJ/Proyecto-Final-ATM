/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author Light
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}











package matrices;

import java.util.Scanner;


public class MATRICES {
    
  public static void NuevoUsuario(int[]cuentas, String[]nombredelusuario, String[]numerodecelular, int [] nip, double [] saldo, int persona){
        Scanner sc = new Scanner(System.in);
        System.out.println("REGISTRO DE NUEVO USUARIO:");
        System.out.print("Ingrese numero de cuenta: ");
        cuentas[persona] = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese nombre completo: ");
        nombredelusuario[persona] = sc.nextLine();
        
        System.out.print("Ingrese numero de celular: ");
        numerodecelular[persona] = sc.nextLine();
        System.out.print("Elija un NIP: ");
        nip[persona] = sc.nextInt();
        saldo[persona]=1000;
        System.out.println("USUARIO REGISTRADO CON EXITO.");
        
 }
  
  public static void MostrarUsuarios(int[]cuentas, String [] nombredelusuario, String [] numerodecelular){
   System.out.println("LISTA DE USUARIOS REGISTRADOS:");
                for (int i = 0; i <= cuentas.length; i++) {
                    System.out.println("\nUsuario: " + nombredelusuario[i]);
                    System.out.println("Cuenta: " + cuentas[i]);
                    System.out.println("Celular: " + numerodecelular[i]);}}
    
  public static void IniciarSesion(int[]cuentas, int[] nip) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu cuenta: ");
        int cuentaIngresada = sc.nextInt();
        System.out.print("Ingresa tu NIP: ");
        int nipIngresado = sc.nextInt();
        sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < cuentas.length;  i++ ) {
           
            if (cuentas[i] == cuentaIngresada && nip[i] == nipIngresado){
                encontrado = true;
               
                System.out.println("---------- MENU ----------");

                int opcion=sc.nextInt();
                switch(opcion){
                    case 1:
                       // Consultarsaldo();
                        break;
                        
                    case 2:
                        // retiro
                        break;
                        
                    case 3:
                        // deposito
                        break;
                        
                    case 4:
                        //transferencia
                        break;
                        
                    case 5:
                       // administrar
                        break; 
                        
                    case 6:
                       //salir
                        break;
                      
               }
                break; }}
        if (!encontrado) {
            System.out.println("Cuenta o NIP incorrectos.");
        }
    }
  
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
    int [] cuentas = new int [3]; 
    String [] nombredelusuario = new String [3];
    String [] numerodecelular = new String [3];
    int [] nip = new int [3];
    int persona = 0; 
    double [] saldo= new double[3];
    
    cuentas[0]=12345678;
    nombredelusuario[0]="Ximena Meza Fuertes";
    numerodecelular[0]="1234567891";
    nip[0]=1234;
    saldo[0]=10000.0;
    
 
    boolean sesion=true;
    while(sesion==true){
    System.out.println("---------- Menu Cajero ---------- ");  
    System.out.println("1. Crear usuario nuevo"); 
    System.out.println("2. Iniciar sesion");
    System.out.println("3. Mostrar listado de cuentas");
    System.out.println("Elija una opcion: ");
    int opcion=sc.nextInt();
     switch (opcion) {
                case 1:
                   persona=persona+1;
                   NuevoUsuario(cuentas, nombredelusuario, numerodecelular, nip, saldo, persona);
                    break;
                
                case 2:
                  IniciarSesion(cuentas, nip);
                    break;
                
                case 3:
                   MostrarUsuarios(cuentas, nombredelusuario, numerodecelular);
                    break;
               
                default:
                    System.out.println("Opción no válida.");
                    break;
            }}
    
    }
    
}

