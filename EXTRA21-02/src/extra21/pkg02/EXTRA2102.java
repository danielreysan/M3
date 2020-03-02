
package extra21.pkg02;

import java.util.Scanner;
public class EXTRA2102 {


    static String [] arrayNameTeams;
    static int [] arrayPoints, arrayGoals, arrayGoalsRecib, arrayTeams;
    static int golesMediaMarcados = 0, golesMediaRecib=0, puntosMedia=0, diference=0;
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Declaraciones Globales
        
        int option = -1;
        do{
        userMenu();
        option = keyboard.nextInt();
        switch(option){//inicio switch
            case 1:
                System.out.print("How many teams are in the league?: ");
                int teamsNum = keyboard.nextInt();
                arrayTeams = new int [teamsNum];
                arrayNameTeams = new String [teamsNum];
                arrayGoalsRecib = new int [teamsNum];
                arrayGoals = new int [teamsNum];
                arrayPoints = new int [teamsNum];
                for(int i=0 ; i<arrayTeams.length ; i++){
                    System.out.print("What's the name of your team?: ");
                    arrayNameTeams[i] = keyboard.next();
                    System.out.print("How many goals did the team received?: ");
                    arrayGoalsRecib[i] = keyboard.nextInt();
                    System.out.print("How many goals did your team score?: ");
                    arrayGoals[i] = keyboard.nextInt();
                    System.out.print("How many points does your team have?: ");
                    arrayPoints[i] = keyboard.nextInt();
                    golesMediaMarcados += arrayGoals[i];
                    golesMediaRecib += arrayGoalsRecib[i];
                    puntosMedia += arrayPoints[i];
                }
                break;
            case 2:
                int maxValue = 0;
                int maxPosition = 0;
                for(int i=0 ; i<arrayPoints.length ; i++){
                    if(arrayPoints[i]>maxValue){
                        maxValue=arrayPoints[i];
                        maxPosition = i;
                    }
                }
                System.out.println(arrayNameTeams[maxPosition] + " has scored a total of " + arrayGoals[maxPosition] + " goals");
                System.out.println(arrayNameTeams[maxPosition] + " has received a total of " + arrayGoalsRecib[maxPosition] + " goals");
                System.out.println(arrayNameTeams[maxPosition] + " has a total of " + arrayPoints[maxPosition] + " points");
                break;
            case 3:
                maxValue = 0;
                maxPosition = 0;
                for(int i=0 ; i<arrayPoints.length ; i++){
                    if(arrayPoints[i]>maxValue){
                        maxValue=arrayPoints[i];
                        maxPosition = i; 
                    }
                }
                System.out.println(arrayNameTeams[maxPosition-1] + " has scored a total of " + arrayGoals[maxPosition-1] + " goals");
                System.out.println(arrayNameTeams[maxPosition-1] + " has received a total of " + arrayGoalsRecib[maxPosition-1] + " goals");
                System.out.println(arrayNameTeams[maxPosition-1] + " has a total of " + arrayPoints[maxPosition-1] + " points");
                break;
            case 4:
                int minValue = 0;
                int minPosition = 0;
                for(int i=0 ; i<arrayGoalsRecib.length ; i++){
                    if(arrayGoalsRecib[i]<minValue){
                        minValue=arrayGoalsRecib[i];
                        minPosition = i;
                    }
                }
                System.out.println(arrayNameTeams[minPosition] + " has scored a total of " + arrayGoals[minPosition] + " goals");
                System.out.println(arrayNameTeams[minPosition] + " has received a total of " + arrayGoalsRecib[minPosition] + " goals");
                System.out.println(arrayNameTeams[minPosition] + " has a total of " + arrayPoints[minPosition] + " points");
                break;
            case 5: 
                int maxGoals = 0;
                maxPosition = 0;
                for(int i=0 ; i<arrayGoals.length ; i++){
                    if(arrayGoals[i]>maxGoals){
                        maxGoals=arrayGoals[i];
                        maxPosition = i;
                    }
                }
                System.out.println(arrayNameTeams[maxPosition] + " has scored a total of " + arrayGoals[maxPosition] + " goals");
                System.out.println(arrayNameTeams[maxPosition] + " has received a total of " + arrayGoalsRecib[maxPosition] + " goals");
                System.out.println(arrayNameTeams[maxPosition] + " has a total of " + arrayPoints[maxPosition] + " points");
                break;
            case 6:
                golesMediaMarcados = golesMediaMarcados/arrayTeams.length;
                golesMediaRecib = golesMediaRecib/arrayTeams.length;
                System.out.println("The total average of scored goals of all teams are " + golesMediaMarcados);
                System.out.println("The total average of received goals of all teams are " + golesMediaRecib);
                break;
            case 7:
                int minPoints = 0;
                minPosition = 0;
                for(int i=0 ; i<arrayPoints.length ; i++){
                    if(arrayPoints[i]<minPoints){
                        minPoints=arrayPoints[i];
                        minPosition = i;
                    }
                }
                System.out.println("The team who is descending is " + arrayNameTeams[minPosition] + " with a total of " + arrayPoints[minPosition] + " points");
                break;
            case 8:
                for(int i=0 ; i<arrayTeams.length ; i++){
                    System.out.println(arrayNameTeams[i] + " has scored a total of " + arrayGoals[i] + " goals");
                    System.out.println(arrayNameTeams[i] + " has received a total of " + arrayGoalsRecib[i] + " goals");
                    System.out.println(arrayNameTeams[i] + " has a total of " + arrayPoints[i] + " points");
                }
                break;
            case 9:
                for(int i=0 ; i<arrayTeams.length ; i++){
                    diference=arrayGoals[i] - arrayGoalsRecib[i];
                    System.out.println(arrayNameTeams[i] + " has a diference of " + diference + " goals");
                }
                break;
            case 10: p10();
                break;
            default: System.out.println("Opción no valida");
        }//Fin de switch
        }while(option !=10);//Fin de while  
    }//FIN DE MAIN
    
    private static void userMenu() {
        System.out.println("");
        System.out.println("Author: Daniel Reyes Santiago");
        System.out.println("Opción 1 - (Goles): ");
        System.out.println("Opción 2 - (Campeón): ");
        System.out.println("Opción 3 - (Subcampeón): ");
        System.out.println("Opción 4 - (Mejor equipo defensivo): ");
        System.out.println("Opción 5 - (Mejor equipo ofensivo): ");
        System.out.println("Opción 6 - (Media de goles): ");
        System.out.println("Opción 7 - (Descienden): ");
        System.out.println("Opción 8 - (Visualizar datos): ");
        System.out.println("Opción 9 - (Diferencia de goles): ");
        System.out.println("Opción 10 - (Salir): ");
        System.out.print("\nOpción?: ");
    }
    
    private static void p10 (){
        System.out.print("Are you sure you want to exit?(Yes/No): ");
        String answer = keyboard.next();
        if(answer.equals("Yes")){
            System.out.println("Thanks for using this programm. Goodbye!");
        }
    }
    }
