package Praktikum10;
import java.util.Scanner;

class Point {
    String question;
    String answer;
    Point nextPoint;

    public Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
    }
}

public class ScavengerHunt {
    private Point startPoint;
    private Point currentPoint;
    private Scanner scanner;

    public ScavengerHunt() {
        this.startPoint = null;
        this.currentPoint = null;
        this.scanner = new Scanner(System.in); 
    }

    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if (startPoint == null) {
            startPoint = newPoint;
            currentPoint = newPoint;
        } else {
            currentPoint.nextPoint = newPoint;
            currentPoint = newPoint;
        }
    }

    public void startGame() {
        if (startPoint == null) {
            System.out.println("Tidak ada point dalam permainan.");
            return;
        }

        currentPoint = startPoint;

        while (currentPoint != null) {
            System.out.println("Pertanyaan: " + currentPoint.question);
            System.out.print("Jawaban Anda: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(currentPoint.answer)) {
                System.out.println("Jawaban Anda benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Maaf, jawaban Anda salah. Coba lagi.");
            }
            currentPoint = currentPoint.nextPoint;
        }

        System.out.println("Anda telah menemukan harta karun!");
    }

    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();

        game.addPoint("Pertanyaan 1", "jawaban1");
        game.addPoint("Pertanyaan 2", "jawaban2");
        game.addPoint("Pertanyaan 3", "jawaban3");

        game.startGame();
    }
}
