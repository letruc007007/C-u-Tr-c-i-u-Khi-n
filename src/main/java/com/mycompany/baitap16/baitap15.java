/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap16;
import java.util.Random;
import java.util.Scanner;

public class baitap15 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int attempts = 0;
        String userInput;

        do {
            int randomNumber = random.nextInt(11); 
            System.out.print("Nhập số bạn đoán (0-10): ");
            int userGuess = sr.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Chúc mừng! Bạn đoán đúng. Có điểm.");
                score++;
            } else {
                System.out.println("Rất tiếc! Số đúng là: " + randomNumber);
            }

            System.out.print("Bạn có muốn chơi tiếp không? (nhập 'k' để kết thúc, phím khác để tiếp tục): ");
            userInput = sr.next();

        } while (!userInput.equalsIgnoreCase("k"));

       
        double accuracy = (attempts > 0) ? (double) score / attempts * 100 : 0;

       
        System.out.println("\nTrò chơi kết thúc!");
        System.out.println("Tổng số lần đoán: " + attempts);
        System.out.println("Số lần đoán đúng: " + score);
        System.out.printf("Tỷ lệ đoán trúng trung bình: %.2f%%\n", accuracy);

        sr.close();
    }
}