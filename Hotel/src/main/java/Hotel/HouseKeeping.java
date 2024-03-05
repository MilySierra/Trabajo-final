/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

public class HouseKeeping extends Rooms{
    private static final Lectura ln = new Lectura();
    private static String nombreHk;
    private static int idHk;
    private static boolean limpiar;
    
    public static void cleanRoom(){
        idHk = ln.leerInt("Ingrese su ID");
        nombreHk = ln.leerString("Ingrese su nombre");
        idRoom = ln.leerInt("¿Qué número de habitación está limpiando? ");
        System.out.println("La mucama " + nombreHk + " con Id "+ idHk + " está limpiando la habitación " + idRoom);
        limpiar=true;
    }


    public boolean verifyClean(){
        return limpiar;
    }
    

}
