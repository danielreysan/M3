
package uf1p18;

import java.util.Arrays;
import java.util.Scanner;

public class UF1P18 {
    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Declaraciones Globales
        int option = -1;
        do{
        userMenu();
        option = keyboard.nextInt();
        switch(option){//inicio switch
            case 1:
            int [] arrayNumber = new int []{7, 12, 13, 16, 18};
            viewArrayInt(arrayNumber);
                break;
            case 2:
            int [] arrayIva;
            arrayIva = new int []{0, 4, 10, 21}; 
            viewArrayInt(arrayIva);
                break;
            case 3: 
            int [] arrayIva2 = new int [4];
            arrayIva2 [0] = 0;  
            arrayIva2 [1] = 4;
            arrayIva2 [2] = 10;
            arrayIva2 [3] = 21;
            viewArrayInt(arrayIva2);
                break;
            case 4:
                System.out.print("What's the dimension of the array?: ");
                int dimension = keyboard.nextInt();
                
                int [] arrayPrices = new int [dimension];
                for(int i=0 ; i<arrayPrices.length ; i++){
                    System.out.print("What's the price of the product " + (i+1) +"?: ");
                    int prices = keyboard.nextInt();
                    arrayPrices[i] = prices;
                }
                viewArrayInt(arrayPrices);
                break;
            case 5: 
                System.out.print("How many students are in the class?: ");
                int numStud = keyboard.nextInt();
                String [] arrayStudentsName = new String [numStud];
                float [] arrayStudentsSize = new float [numStud];
                for(int i=0 ; i<arrayStudentsName.length ; i++){
                    System.out.print("What's the name of the student [" + (i+1) + "]: ");
                    arrayStudentsName [i] = keyboard.next();
                    System.out.print("What's her/his size?: ");
                    arrayStudentsSize [i] = keyboard.nextFloat();
                }
                viewStudent(arrayStudentsName, arrayStudentsSize);
                break;
            case 6:
                System.out.print("How many students are in the class?: ");
                numStud = keyboard.nextInt();
                arrayStudentsName = new String [numStud];
                arrayStudentsSize = new float [numStud];
                float sizeAverage = 0;
                for(int i=0 ; i<arrayStudentsName.length ; i++){
                    System.out.print("What's the name of the student [" + (i+1) + "]: ");
                    arrayStudentsName [i] = keyboard.next();
                    System.out.print("What's her/his size?: ");
                    arrayStudentsSize [i] = keyboard.nextFloat();
                    sizeAverage += arrayStudentsSize[i];
                }
                sizeAverage = sizeAverage/numStud;
                viewStudents(arrayStudentsName, arrayStudentsSize, sizeAverage);
                break;
            case 7:
                System.out.print("Write the number of the day you want to know?: ");
                int dayNumb = keyboard.nextInt();
                String [] arrayDaysOfWeek = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                System.out.println("The number " + dayNumb + " is a " + arrayDaysOfWeek[dayNumb]);
                break;
            case 8:
                System.out.print("Can you tell me your DNI withput the letter?: ");
                int dni = keyboard.nextInt();
                char letter = functionDNI(dni);
                System.out.println("Your DNI is " + dni + letter);
                break;
            case 9:
                System.out.print("How many players have the team of basketball?: ");
                int numbPlayers = keyboard.nextInt();
                int [] arrayPoints = new int [numbPlayers];
                String [] arrayNames = new String [numbPlayers];
                float average = 0;
                int totalPoints = 0;
                for(int i=0 ; i<arrayPoints.length ; i++){
                    System.out.print("What's your name?: ");
                    arrayNames [i] = keyboard.next();
                    System.out.print("How many points did you score in the last game?: ");
                    arrayPoints [i] = keyboard.nextInt();
                    average += arrayPoints [i];
                    totalPoints += arrayPoints [i];
                }
                average = average/numbPlayers;
                System.out.println("The total score in the last game is " + totalPoints + " points");
                System.out.println("The average of all the points in the last game are " + average + " points");
                for(int i=0 ; i<arrayPoints.length ; i++){
                    if(arrayPoints[i]>average){
                        System.out.println("The player " + arrayNames[i] + " pass the average of the points of all the players with a score of " + arrayPoints[i] + " points");
                    }
                    if(arrayPoints[i]<average){
                        System.out.println("The player " + arrayNames[i] + " didn't pass the average of the points of all the players with a score of " + arrayPoints[i] + " points");
                    }
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
        System.out.println("Opción 1 - (dimensionar e inicializar): ");
        System.out.println("Opción 2 - (dimensionar e dar valores posteriormente): ");
        System.out.println("Opción 3 - (dimensionar y dar valores posteriormente, uno por uno): ");
        System.out.println("Opción 4 - (declarar un array y posteriormente dimensionar y dar valores): ");
        System.out.println("Opción 5 - (2 arrays): ");
        System.out.println("Opción 6 - (procesar arrays): ");
        System.out.println("Opción 7 - (una función): ");
        System.out.println("Opción 8 - (una función): ");
        System.out.println("Opción 9 - (invención): ");
        System.out.println("Opción 10 - (salir): ");
        System.out.print("\nOpción?: ");
    }
    
    private static void p10 (){
        System.out.print("Are you sure you want to exit?(Yes/No): ");
        String answer = keyboard.next();
        if(answer.equals("Yes")){
            System.out.println("Thanks for using this programm. Goodbye!");
        }
    }

    private static void viewArrayInt(int[] arrayNumber) {
        for(int i=0 ; i<arrayNumber.length ; i++){
        System.out.println("Array[" + (i+1) + "]:" + arrayNumber[i]);
        }
        System.out.println(Arrays.toString(arrayNumber));
    }
    

    private static void viewStudent(String[] arrayStudentsName, float[] arrayStudentsSize) {
        for(int i=0 ; i<arrayStudentsName.length ; i++){
        System.out.println("Student [" + (i+1) + "]:" + arrayStudentsName[i] + "\t" + "Size [" + (i+1) + "]: " + arrayStudentsSize[i] + "m");
        }
    }

    private static void viewStudents(String[] arrayStudentsName, float[] arrayStudentsSize, float sizeAverage) {
        System.out.println("The average of all the students is " + sizeAverage + "m");
        for(int i=0 ; i<arrayStudentsName.length ; i++){
            if(arrayStudentsSize[i]>sizeAverage){
                System.out.println("The student " + arrayStudentsName[i] + " pass the average of the size of all the students with a " + arrayStudentsSize[i] + "m");
            }
        }
    }

    private static char functionDNI(int dni) {
        char letter = ' ';
        String stringDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int res = dni%23;
        letter = stringDNI.charAt(res);
        return letter;
    }
    
    }
