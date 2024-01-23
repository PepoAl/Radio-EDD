import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Instancia de clase Radio
        Radio radio1 = new Radio();
        Scanner input = new Scanner(System.in);
        boolean state = true;
        String menu = "--------Menu--------\n1.Prender el radio\n2.Cambia de frecuencia\n3.Siguiente emisora\n4.Emisora anterior\n5.Guardar emisora\n6.Seleccionar emisora guardada\n7.Apagar el radio";
        int choice;
        int favBotton;

        do{
            System.out.println(menu);
            System.out.println("Ingrese una de las siguientes opciones: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                //Prender el radio
                case 1:
                radio1.tooglePowerOffOn();
                if(radio1.getState()==true){
                    System.out.println("Se ha prendido el radio");
                }else{
                    System.out.println("Se ha apagado el radio");
                }
                    break;
                //Cambiar de frecuencia
                case 2:
                radio1.toogleAMFM();
                if(radio1.getStateAMFM()==true){
                    System.out.println("La frecuencia es AM");
                }else{
                    System.out.println("La frecuencia es FM");
                }
                break;
                //Siguiente emisora
                case 3:
                radio1.nextFrequency();
                System.out.println("La frecuencia actual es: "+ radio1.getCurrentFrequency());
                break;
                //Emisora anterior
                case 4:
                radio1.previousFrequency();
                System.out.println("La frecuencia actual es: "+ radio1.getCurrentFrequency());
                break;
                //Guardar emisora
                case 5:
                System.out.println("Ingrese el boton que quiere configurar (1 al 12): ");
                favBotton = input.nextInt();
                input.nextLine();
                radio1.setFavFrequency(favBotton);
                break;
                //Seleccionar emisora guardada
                case 6:
                System.out.println("Ingrese el boton de la frecuencia que desea (1 al 12):  ");
                favBotton = input.nextInt();
                input.nextLine();
                System.out.println("Frecuencia seleccionada: "+radio1.getFavFrequency(favBotton));
                break;
                //Salir del ciclo
                case 7:
                state = false;
                System.out.println("Saliendo del programa...");
                break;
            }

        }while(state);

        
    }
    
}
    