package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center = (sideLength / 2) + 1;
        for (int i = 0;i < sideLength;i++){
            for (int j = 0;j < sideLength;j++){
                if (j == center - 1 || i == center - 1){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
