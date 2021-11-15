package com.company;
import ibadts.Collection;

public class Main {

    public static void main(String[] args) {
//Example
        /*
        int[] arr = {-4, 2, 16, 78, 165, 8885};
        int N = arr.length;
        int key = 16;

        int lo = 0;
        int hi = N - 1;
        boolean found = false;

        while (!found && lo <= hi){

            int mid = (lo + hi) / 2;
            int v = arr[mid];
            if (key == v)
                found = true;
            else if (key < v)
                hi = mid -1;
            else
                lo = mid + 1;

        }
        System.out.println(found);
*/
        /*


        // HW 1


        int[] arr = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int N = arr.length;
        int key = 22;

        int lo = 0;
        int hi = N - 1;
        boolean found = false;

        while (!found && lo <= hi) {

            int mid = (lo + hi) / 2;
            int v = arr[mid];
            System.out.println(v);
            if (key == v)
                found = true;
            else if (key < v)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        System.out.println(found);

    */




        //HW.2

        String[] STUDENTS = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] GRADES = {"B", "D", "B", "A"};
        String student = "Dianna";

        for (int i = 0; i < STUDENTS.length; i++){
            if (STUDENTS[i] == student){
                System.out.println(GRADES[i]);
                break;
            }
        }



    }
}
