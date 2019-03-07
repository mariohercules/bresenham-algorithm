import java.util.List;
import java.awt.Point;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bresenham Line Algorithm");

		System.out.println("\nEnter dimensions of grid");
		int rows = scan.nextInt();
		int cols = scan.nextInt();

		Point[][] grid = new Point[rows][cols];

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				grid[i][j] = new Point(i, j);

		System.out.println("\nEnter coordinates of point 1 and point 2");
		int sr = scan.nextInt();
		int sc = scan.nextInt();
		int fr = scan.nextInt();
		int fc = scan.nextInt();

		Bresenham b = new Bresenham();

		List<Point> line = b.encontrarLinha(grid, sr, sc, fr, fc);

		b.desenharTela(grid, line);

	}

}
