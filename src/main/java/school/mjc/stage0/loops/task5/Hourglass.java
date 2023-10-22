package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height != 0) {
            for (int i = 0; i < height / 2 + 1; i++) {
                for (int j = 0; j < height; j++) {
                    if (j >= i && j < height - i) {
                        System.out.print("8");
                    } else if (height % 2 == 0 && i == height / 2) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }
                if (height % 2 == 0 && i == height / 2)
                    break;
                System.out.println();
            }

            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < height; j++) {
                    if (j >= i && j < height - i) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
