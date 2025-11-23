/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author Light
 */
public class RetirarYtransferir {
     public static void retirar(Object [][] cuentas){
            Scanner sc=new Scanner(System.in);
            System.out.println("¿Cuanto desea retirar?(Numero enteros)");
            int retiro=sc.nextInt();
             if(retiro<=(double)cuentas[0][2]){
               double saldo = (double) cuentas[0][2];  
        double nuevo = saldo - retiro;
        cuentas[0][2] = nuevo;
        System.out.println("Nuevo saldo: " + nuevo);    
             } else {
                 System.out.println("Fondos insuficientes"); 
             }
            
    }
        

    
    public static void transfe(Object [][] cuentas){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de cuenta destino: ");
       int destino = sc.nextInt();
       for(int i=0;i<cuentas.length;i++){
         if((int)cuentas[i][0]==destino){
             System.out.print("¿Cuanto desea depositar?");
       double monto = sc.nextDouble();
             if(monto<=(double)cuentas[0][2]){
                cuentas[i][2] = (double) cuentas[i][2] + monto;
            cuentas[0][2] = (double) cuentas[0][2] - monto; 
            System.out.println("tRANSFERENCIA REALIZADA CON EXITO");
            System.out.println("");
            System.out.println("");
    System.out.println("======================================");
    System.out.println("              TICKET                ");
    System.out.println("======================================");
    System.out.println("       Operación: TRANSFERENCIA       " );
    System.out.println("         Monto: $" + monto + "        ");
    System.out.println("       Saldo anterior:$" + cuentas[0][2]);
    System.out.println("   Fecha: " + java.time.LocalDateTime.now());
    System.out.println("======================================");
    System.out.println("       ¡Gracias por su operación!");
    System.out.println("======================================");

             }
             else {
                 System.out.println("Saldo no suficiente");
             }
             
         }

                     }
        
    }
             
          public static void main(String[] args) {
        
        Object [][] cuentas={{111, "Xim", 2000.0},
            {222, "Luquin", 5000.0}};
        retirar(cuentas);
        transfe(cuentas);
        
        
    }
}

