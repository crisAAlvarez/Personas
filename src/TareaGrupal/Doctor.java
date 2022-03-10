

package TareaGrupal;


public class Doctor extends Persona {
    private int edad;
    private int experiencia;
    private String nombre;
    
  
    //set y get de edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //set y get anios de experiencia
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    //set y get string nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
}
