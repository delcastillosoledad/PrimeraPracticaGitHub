public class Jarra {
private int capacidad;
private int cantidad; 
//constructor
public Jarra(int capacidadInicial){ 
    if(capacidadInicial<=0){
throw new RuntimeException("ERROR: no se pueden crear jarras con capacidad menor" + "o igual que cero.");
} 
 this.capacidad=capacidadInicial;
}
public void metodoComunitario(){ // Comentario incluido para pruebas
System.out.println("Aqui escribimos todos"); 
}
//capacidadCantidad
public int capacidad(){
    return this.capacidad; }
public int cantidad(){
    return this.cantidad;
}