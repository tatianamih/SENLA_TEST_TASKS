package senla.mikhalchenko.task3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*На вход приходят 2 вектора, описанные координатами точек начала (x1,y1)
и конца (x2,y2) вектора. Найти длины векторов, а так же вектор произведения
первого вектора на второй и второго на первый (получим 2 новых вектора).
Векторы выводить в формате “начало (x1,y1), конец (x2,y2).
 */
public class Task3 {
    private int getTheVectorCoordinateX(int x1, int x2) {
        return x2 - x1;
    }

    private int getTheVectorCoordinateY(int y1, int y2) {
        return y2 - y1;
    }

    private void findVectorLength(int x1, int y1, int x2, int y2) {
        System.out.println("The initial coordinates of the points  "
                + "(" + x1 + "," + y1 + ")");
        System.out.println("the ending coordinates of the points  "
                + "(" + x2 + "," + y2 + ")");
        double vectorLengthInt = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        String vectorLengthString = String.format("%.0f", vectorLengthInt);
        System.out.println("The length of the vector is "
                + vectorLengthString);
    }

    private void findVectorMultiplyTheVectors(int aX1, int aY1, int aX2, int aY2, int bX1, int bY1, int bX2, int bY2) {
        int aZ = 0;
        int bZ = 0;
        int aX = getTheVectorCoordinateX(aX1, aX2);
        int aY = getTheVectorCoordinateX(aY1, aY2);
        int bX = getTheVectorCoordinateX(bX1, bX2);
        int bY = getTheVectorCoordinateX(bY1, bY2);

        int[] newVector = {aY * bZ - aZ * bY, aZ * bX - aX * bZ, aX * bY - aY * bX};
        System.out.print("(");
        for (int i = 0; i < newVector.length - 1; i++) {
            System.out.print(newVector[i] + ",");
        }
        System.out.println(newVector[newVector.length - 1] + ")");
    }


    public static void main(String[] args) {

        Task3 task3 = new Task3();
        Scanner input = new Scanner(System.in);

        System.out.println("Input the initial coordinates of the points of the vector A");
        int aX1 = input.nextInt();
        int aY1 = input.nextInt();

        System.out.println("Enter the ending coordinates of the points of the vector A");
        int aX2 = input.nextInt();
        int aY2 = input.nextInt();

        System.out.println("Input the initial coordinates of the points of the vector B");
        int bX1 = input.nextInt();
        int bY1 = input.nextInt();

        System.out.println("Input the ending coordinates of the points of the vector B");
        int bX2 = input.nextInt();
        int bY2 = input.nextInt();

        System.out.println(("For vector A"));
        task3.findVectorLength(aX1, aY1, aX2, aY2);

        System.out.println(("For vector B"));
        task3.findVectorLength(bX1, bY1, bX2, bY2);

        System.out.println("Vector product :");
        System.out.print("A(" + task3.getTheVectorCoordinateX(aX1, aX2) + "," +
                task3.getTheVectorCoordinateY(aY1, aY2) + ",0)" +
                " * B(" + task3.getTheVectorCoordinateX(bX1, bX2) + "," +
                task3.getTheVectorCoordinateY(bY1, bY2) + ",0) = C");
        task3.findVectorMultiplyTheVectors(aX1, aY1, aX2, aY2, bX1, bY1, bX2, bY2);

        System.out.print("B(" + task3.getTheVectorCoordinateX(bX1, bX2) + "," +
                task3.getTheVectorCoordinateY(bY1, bY2) + ",0)" +
                " * A(" + task3.getTheVectorCoordinateX(aX1, aX2) + "," +
                task3.getTheVectorCoordinateY(aY1, aY2) + ",0) = D ");
        task3.findVectorMultiplyTheVectors(bX1, bY1, bX2, bY2, aX1, aY1, aX2, aY2);
    }
}
