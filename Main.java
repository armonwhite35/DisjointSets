/***Armon White
 * Dr. Burg
 * CSC 201
 * 4/7/2021
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ans = 0; //keeps track of if the user wants to stop or keep going
        Scanner o = new Scanner(System.in);
        System.out.println("How many elements");
        int e = o.nextInt();
        DisjointSet ds = new DisjointSet(e); //initializes sets and roots

        while( ans != -1) {//loop for creating equivalences
            System.out.print("Give a pair of integers: ");
            int num1 = o.nextInt();
            int num2 = o.nextInt();
            ds.union(num1, num2);

            System.out.println("Would you like to continue? (0 = Yes, -1 = No)");
            ans = o.nextInt();
        }
        ds.printDSets(); //prints sets
    }
}
