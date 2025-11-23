
package atm;


public class AdministrarYDepositar {






    
public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    Object [] admi = {"Pliego Bastida Lucas", 0000};
    
    
    
    boolean flag = false;
    
    while (flag != true){
    
    System.out.println("<<<<<Cajero Automatico>>>>>");
    
     System.out.println("");
             
      System.out.println("2. Administrar");    
    
      System.out.println("3. Depositar");
      
       System.out.println("");
       
        System.out.println("");
        
         System.out.println("");
        
         System.out.println("Ingrese una opcion:");
         
         int num = sc.nextInt();
         
         
         switch(num){
        
             case 1:
        
          System.out.println("");
                 
      
                 
    
        
        break;
        
             case 2:
                 
         System.out.println(""); 
         
          while (flag != true){
                 
         System.out.println("Que desea realizar");
         
         System.out.println("1. " + "Cambiar nombre");
         
         System.out.println("2. " + "Editar Nip");
        
         System.out.println("3. " + "Cancelar Trabsaccion");
         
         System.out.println("Ingrese una opcion:");
          
         int opc = sc.nextInt();
         
         
         switch(opc){
              
                 case 1:
                              Nombre(admi);  
                 break;
                 
             case 2:
            Nip(admi);
                 break;
              
                 
             case 3:
                 
             System.out.println("Operacion Finalizada");
             System.out.println();
             System.out.println();
                 break;
                                     
         }
    return;}
   
        break;
         
       
          

       
             case 3:
                 boolean off = false;
    
    while (flag != true){
                 
         System.out.println("Cuanto desea depositar");
         
         System.out.println("1. " + "$100");
         
         System.out.println("2. " + "$500");
         
         System.out.println("3. " + "$1,000");
         
         System.out.println("4. " + "Elija la cantidad:");
   
         System.out.println("5. " + "Cancelar Trabsaccion");
         
         int opc = sc.nextInt();
         
         
         switch(opc){
             
             case 1:
                 
                 Deposito(100);
                 break;
                 
             case 2: 
                 
                 Deposito(500);
                 break;
                 
             case 3:
                 
                  Deposito(1000);
                 break;
                 
             case 4:
                 
                 
                 
               System.out.println("Solo se aceptan billetes de $100");
               System.out.println("-------------------------------------------------------");
               System.out.println();
               
               
               System.out.println("Ingrese una cantidad:");
             
                 int cantidad =  sc.nextInt();
                 
                 if (cantidad % 100 == 0 && cantidad > 0){
                 
                 Deposito(cantidad);
                 
                 }else{System.out.println("Error en transaccion");
                 
                 break;} 
                 
                 System.out.println();
                 System.out.println("--------------------------------------------");
                 break;
              
                 
             case 5:
                 
             System.out.println("Operacion Finalizada");
             System.out.println();
             System.out.println();
                 break;
                 
 
                            
         }
    return;}
         
     
      
         
         

        break;
        
             case 4:
             
      
         System.out.println("");
         
    
       
       
        System.out.println("");
       
   
       

       
         
        break;
        
        
             case 5:
                 
        System.out.println("");
        
 
        
   
        
        
        break;
        
 
             case 6:
                 
        flag = true;
         
         break;
         
         
             default:
                 
                 System.out.println("Default");
          
    
    
    
    }
         
    }
    
    
    
}

    
}

