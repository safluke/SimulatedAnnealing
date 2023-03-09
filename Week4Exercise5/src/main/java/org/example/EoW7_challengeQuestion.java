package org.example;

import java.util.Random;
import java.util.Scanner;

public class EoW7_challengeQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter probability: ");
        double probability = scanner.nextDouble();

        System.out.print("Enter iterations: ");
        int iterations = scanner.nextInt();

        // Optional: ask for random seed
        System.out.print("Enter random seed (optional): ");
        long randomSeed = scanner.nextLong();

        Random rand;
        if (randomSeed >= 0) {
            rand = new Random(randomSeed);
            System.out.println("Probability: " + probability + " | Total iterations: " + iterations + " | Random Seed: " + randomSeed);
        } else {
            rand = new Random();
            System.out.println("Probability: " + probability + " | Total iterations: " + iterations);
        }

        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < iterations; ++i) {
            String to_print = "iteration " + String.valueOf(i+1) + ": ";
            if (rand.nextDouble() < probability) {
                to_print += "currentSolution = randomNeighbour";
            } else {
                to_print += "Discard randomNeighbour and keep currentSolution";
            }
            System.out.println(to_print);
        }

        scanner.close();
    }
}