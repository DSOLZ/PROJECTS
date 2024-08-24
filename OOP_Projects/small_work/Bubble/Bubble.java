import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bubble{
    public static int countOutOfPosition(double[] arr){
        int count = 0;

        for(int i = 0; i < arr.length-1; i++){
            for(int k = i+1; k < arr.length; k++){
                if(arr[k] < arr[i]){
                    count = count + 1;
                }
            }
        }

        return count;    
    }

    public static boolean bubble(double[] arr){
        double z = 0;
        boolean bool = false;

        for(int i = 0; i < arr.length-1; i++){
            z = arr[i];
            if(arr[i] > arr[i+1]){
                arr[i] = arr[i+1];
                arr[i+1] = z;
                bool = true;
            }
        }
        return bool;
    }




    public static void main (String[] args) throws IOException{
        File dataSorted = new File("dataSorted.txt");
        File dataReverseSorted = new File("dataReverseSorted.txt");
        File dataRandom = new File("dataRandom.txt");

        double[] sortedData = new double[100];
        double[] reverseSortedData = new double[100];
        double[] randomData = new double[100];

        int i = 0;
        Scanner sd = new Scanner(dataSorted);
        while(sd.hasNextDouble()){
            sortedData[i] = sd.nextDouble();
            i++;
        }

        i = 0;
        Scanner  rd = new Scanner(dataRandom);
        while(rd.hasNextDouble()) {
            randomData[i] = rd.nextDouble();
            i++ ;
        }

        i = 0;
        Scanner  rs = new Scanner(dataReverseSorted);
        while(rs.hasNextDouble()){
            reverseSortedData[i] = rs.nextDouble();
            i++;
        }

        int count = 0;

        System.out.println("The quantity of numbers 'out of position' in dataSorted.txt is " + countOutOfPosition(sortedData));

        while(bubble(sortedData) == true){
            count++;
        }
        System.out.println("It takes " + count + " iterations to eliminate all adjacent 'out of position' numbers in this file");


        System.out.println("\n****************************************************************************************************\n");


        System.out.println("The quantity of numbers 'out of position' in dataRandom.txt is " + countOutOfPosition(randomData));
            count = 0;
        while(bubble(randomData) == true){
            count++;
        }
        System.out.println("It takes " + count + " iterations to eliminate all adjacent 'out of position' numbers in this file");


        System.out.println("\n****************************************************************************************************\n");

        
        System.out.println("The quantity of numbers 'out of position' in dataReverseSorted.txt is " + countOutOfPosition(reverseSortedData));
            count = 0;
        while(bubble(reverseSortedData) == true){
            count++;
        }
        System.out.println("It takes " + count + " iterations to eliminate all adjacent 'out of position' numbers in this file");


    }       

}