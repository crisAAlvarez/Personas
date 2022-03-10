
package TareaGrupal;



public class Principal {
    public static void main(String[] args){
    
    Doctor objeto1 = new Doctor();
    
    objeto1.setNombre("Gerardo Caraccioli");
        System.out.println("El nombre del Doctor es: " + objeto1.getNombre());
    
    
    objeto1.setEdad(45);
        System.out.println("La edad del Doctor es: " + objeto1.getEdad());
        
        
    objeto1.setExperiencia(8);
        System.out.println("Los años de experiencia son: " + objeto1.getExperiencia());
    
    }  
}
