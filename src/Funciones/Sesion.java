/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author Admin
 */
public class Sesion {
    private static String usuario;
    private static String rol;
    private static String nombre;
    private static String apellidoP;
    private static String apellidoM;

    // --- SETTERS ---
    public static void iniciarSesion(String usuario, String rol,
                                     String nombre, String apellidoP, String apellidoM) {
        Sesion.usuario = usuario;
        Sesion.rol = rol;
        Sesion.nombre = nombre;
        Sesion.apellidoP = apellidoP;
        Sesion.apellidoM = apellidoM;
    }

    // --- GETTERS ---
    public static String getUsuario() { return usuario; }
    public static String getRol() { return rol; }
    public static String getNombreCompleto() {
        return nombre + " " + apellidoP + " " + apellidoM;
    }

    // --- CERRAR SESIÓN ---
    public static void cerrarSesion() {
        usuario = null;
        rol = null;
        nombre = null;
        apellidoP = null;
        apellidoM = null;
    }
    public static void MostrarEstado(){
        System.out.println(usuario);
    }

}


