
package u3_ed_03_1;

public class PILA {
    int vectorPila[];
    int TOPE;
    //CONSTRUCTOR
    public  PILA( int N){
        vectorPila = new int [N];
        TOPE=-1;
    }
    //METODO PUSH
    public void Push( int dato){
        TOPE++;
        vectorPila[TOPE]=dato;
    }
    
    //METODO POP
    public int Pop(){
        int sacar=vectorPila[TOPE];
        TOPE--;
        return sacar;
    }
    //MEOTODO PARA COMPROBAR SI PILA ESTA VACIA 
    public boolean estaVacia(){
        return TOPE==-1;
    }
    //METODO PARA SABER SI LA PILA ESTA LLENA
    public boolean estaLlena(){
        return vectorPila.length-1==TOPE;
    }
    //METODO PARA SABER EL DATO ESTA EN EL TOPE DE LA PILA
    public int topePila(){
        return vectorPila[TOPE];
    }
    //METODO PARA SABER EL TAMANO DE LA PILA
    public int capacidadPila(){
        return vectorPila.length;
        
    }
    public void mostrar(){
        for (int i = TOPE; i >=0; i--) {
            System.out.println(""+vectorPila[i]);
        }
    }
}
