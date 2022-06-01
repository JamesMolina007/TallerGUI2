/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergui_q1;

/**
 *
 * @author James Josue Molina
 */
public class Persona {
    private String user;
    private String nombre;
    private String correo;
    private String tipo;
    private String lugar;
    private float x;
    private float y;
    
    
    public Persona(){
    }

    public Persona(String user, String nombre, String correo, String tipo, String lugar, float x, float y) {
        this.user = user;
        this.nombre = nombre;
        this.correo = correo;
        this.tipo = tipo;
        this.lugar = lugar;
        this.x = x;
        this.y = y;
    }
    
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Persona{" + "user=" + user + ", nombre=" + nombre + ", correo=" + correo + ", tipo=" + tipo + ", lugar=" + lugar + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
