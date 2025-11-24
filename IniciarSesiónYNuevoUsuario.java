import java.util.Scanner;


import java.util.Random;
  
  

  public class interfaz {
     public static void NuevoUsuario(int[]cuentas, String[]nombredelusuario, String[]numerodecelular, int [] nip, double [] saldo, int persona){
      
         Scanner sc = new Scanner(System.in);

        System.out.println("REGISTRO DE NUEVO USUARIO:");
        
        System.out.print("Ingrese número de cuenta: ");
        cuentas[persona] = sc.nextInt();

        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese nombre completo: ");
        nombredelusuario[persona] = sc.nextLine();
        
        System.out.print("Ingrese número de celular: ");
        numerodecelular[persona] = sc.nextLine();
     
        System.out.print("Elija un NIP: ");
        nip[persona] = sc.nextInt();
        
        
        saldo[persona]=1000;

        System.out.println("USUARIO REGISTRADO CON ÉXITO.");
 
 }
  
   public static void MostrarUsuarios(int[]cuentas, String [] nombredelusuario, String [] numerodecelular, int persona){
   System.out.println("LISTA DE USUARIOS REGISTRADOS:");
                for (int i = 0; i <= persona; i++) {
                    System.out.println("\nUsuario: " + nombredelusuario[i]);
                    System.out.println("Cuenta: " + cuentas[i]);
                    System.out.println("Celular: " + numerodecelular[i]);
 }}
    
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
                System.out.println("Operacion a realizar");
                System.out.println("Operación a realizar...");
                 break;
            }
        }
        if (!encontrado) {
            System.out.println("Cuenta o NIP incorrectos.");
        }
    }
  
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
    int [] cuentas = new int [10]; 
    String [] nombredelusuario = new String [10];
    String [] numerodecelular = new String [10];
    int [] nip = new int [10];
    int persona = 0; 
    double [] saldo= new double[10];
    
    cuentas[0]=12345678;
    nombredelusuario[0]="Ximena Meza Fuertes";
    numerodecelular[0]="1234567891";
    nip[0]=1234;
    saldo[0]=10000.0;
    
    System.out.println("---------- Menu Cajero ---------- ");  
    System.out.println("1. Crear usuario nuevo"); 
    System.out.println("2. Iniciar sesion");
    System.out.println(". Mostrar listado de cuentas");
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
                   MostrarUsuarios(cuentas, nombredelusuario, numerodecelular, persona);
                    break;
               
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
    
    }
    
}



