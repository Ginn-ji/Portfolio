import java.util.Scanner;
public class name{
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        System.out.println ( "Enter array size:");
        int size = s.nextInt();
        int array []= new int [size];
    } 
        System.out.println("Please place the elements:");
        for (int i = 0; i < array.lenght; i++);
        {
        System.out.print (array[i]+ " ");
        }
        System.out.print("Do you want to change an element? (yes/no)");
        String choice = s.next();

        if (choice.equalsIgnoreCase("yes")){
            System.out.print("Enter the index of an element you want to change");
            int index = s.nextInt();
            System.out.print ("Enter a new value");
            int newVal = s.nextInt ();
            array [index] = newVal;

        }
    }
