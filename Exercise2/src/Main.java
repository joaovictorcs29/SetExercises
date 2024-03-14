import entities.Students;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        for (int i = 1; i <= 3; i++) {
            System.out.printf("How many students for course " + i + ": ");
            int quantStudents = sc.nextInt();
            for (int j = 1; j <= quantStudents; j++) {
                System.out.print("Registration number: ");
                int studentNumber = sc.nextInt();

                if (i == 1) {
                    a.add(studentNumber);
                    System.out.println("Saved in A list");
                }
                if (i == 2) {
                    b.add((studentNumber));
                    System.out.println("Saved in B list");
                }
                if (i == 3) {
                    c.add(studentNumber);
                    System.out.println("Saved in C list");
                }
            }
        }

            Set<Integer> total = new HashSet<>(a);
            total.addAll(b);
            total.addAll(c);

        System.out.println("\nTotal students: " + total.size());
        sc.close();
    }
}
