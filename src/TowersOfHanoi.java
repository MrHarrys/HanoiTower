import java.util.Scanner;

public class TowersOfHanoi {

    static int numberOfTowers;

    public static void move(int n, int startTower, int endTower) {
        if (n == 0) {
            return;
        }
        int intermediatePole = (numberOfTowers * 2) - startTower - endTower;
        move(n - 1, startTower, intermediatePole);
        System.out.println("Move " + n + " disk from " + startTower + " tower to " + endTower + " tower.");
        move(n - 1, intermediatePole, endTower);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int numberOfDisk = scanner.nextInt();
        try {
            System.out.print("Enter number of towers: ");
            numberOfTowers = scanner.nextInt();
            try {
                move(numberOfDisk, 1, numberOfTowers);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}