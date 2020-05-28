import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием, введите номер, чтобы выстрелить, -1 чтобы выйти%n", player.getSlotsCount());

        int slot;

        slot = scanner.nextInt();

        while (slot != -1) {
            player.showWithWeapon(slot);
            slot = scanner.nextInt();
        }

        System.out.println("Game over!");
    }
}
