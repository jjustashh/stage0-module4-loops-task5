package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength != 0) {
//            for (int i = 1; i <= sideLength; i++) {
//                for (int j = 1; j <= sideLength; j++) {
//                    if (i == j || j == sideLength - i + 1) {
//                        System.out.print('8');
//                    } else {
//                        System.out.print(' ');
//                    }
//                }
//                System.out.println();
//            }

            for (int i = 1; i <= sideLength; i++) {
                for (int j = 1; j <= sideLength; j++) {
                    if (i == sideLength / 2 + 1 || j == sideLength / 2 + 1) {
                        System.out.print('8');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }
}
