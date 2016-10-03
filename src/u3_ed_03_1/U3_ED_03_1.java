
package u3_ed_03_1;

import java.util.Scanner;


public class U3_ED_03_1 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int N;
        int captura;
        int tamaño;
        System.out.println("De que tamaño desea la pila");
        tamaño=leer.nextInt();
        PILA obj=new PILA(tamaño);

        int opcion;
        do{
            System.out.println("QUE DESEA HACER?");
            System.out.println("1. INSERTAR ELEMENTO");
            System.out.println("2. ELIMINAR");
            System.out.println("3. PILA ESTA VACIA");
            System.out.println("4. PILA ESTA LLENA");
            System.out.println("5. QUE ELEMENTO ESTA EN TOPE");
            System.out.println("6. CAPACIDAD");
            System.out.println("7. SALIR");
	System.out.println("Aprendiendo github");
            
        
            opcion=leer.nextInt();
            switch(opcion){
                case 1: System.out.println("Insertando elementos...");
                N=leer.nextInt();
                if(!obj.estaLlena())
                    obj.Push(N);
                else{
                    System.out.println("La pila esta llena");
                }
                
                        
                    break;
                    
                case 2: System.out.println("Eliminando elementos...");
                if(!obj.estaVacia()){
                    System.out.println(""+obj.Pop());
                }
                else{
                    System.out.println("No hay nada");
                }
                        
                    break;
                    
                case 3: System.out.println("Verificando si la pila esta vacia");
                        if(obj.estaVacia()==true)
                            System.out.println("La pila esta vacia");
                        else
                            System.out.println("Si hay datos");
                    break;
                    
                case 4: System.out.println("Verificando si la pila esta llena");
                        if (obj.estaLlena()==true){
                              System.out.println("La pila esta llena");
                                obj.estaLlena();
                        }
                        else{
                            System.out.println("No esta llena, aun hay espacios");
                        }
                                
                                
                    break;
                case 5: System.out.println("Que elemento esta en tope");
                if(!obj.estaVacia()){
                    System.out.println(""+obj.topePila());
                }
                else{
                    System.out.println("No hay nada");
                }
                    
                        
                    
                    break;
                    
                case 6: System.out.println("capacidad mostrar");
                    
                    obj.mostrar();
                        
                        
                    
                        obj.capacidadPila();
                    break;
                    
                case 7: System.out.println("Saliendo");
                deafult:
                System.out.println("NO EXISTE");
                    
            }
            
        }while(opcion!=7);
        
    }
}
