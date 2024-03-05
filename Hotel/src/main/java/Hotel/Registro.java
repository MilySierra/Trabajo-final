package Hotel;

public class Registro {
    
    public static void menu(){
    Lectura nw = new Lectura();
    int i = 0;
    int j = 0;
    while (j != 3){
            System.out.println("Bienvenidos al sistema de limpiza, a continuacion tendra las siguientesw opciones a elegir "
                    + "(Tenga en cuenta seleccionar la opción 1 y seguidamente la 2 y evite la opción 3 hasta que no haya ingresado"
                    + " el total de habitaciones): ");
            
            System.out.println("1. Ingresar habitacion");
            System.out.println("2. Ingresar mucama");
            System.out.println("3. Salir");
            i = nw.leerInt("Ingrese la opción");
            
            switch (i){
                case 1 -> {
                    Rooms.registroID(10);
                    Rooms.registroSuciedad(1);
                    Rooms.validarSuciedad(1);
            }
                case 2 -> {
                    HouseKeeping.cleanRoom();
            }
                case 3 -> j = 3;
            }
    
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
}
