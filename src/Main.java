import java.util.List;
import java.awt.Point;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bresenham Line Algorithm");

		System.out.println("\nEntre com as dimensao da grade:");
		int linhas = scan.nextInt();
		int colunas = scan.nextInt();

		Point[][] grid = new Point[linhas][colunas];

		for (int i = 0; i < linhas; i++)
			for (int j = 0; j < colunas; j++)
				grid[i][j] = new Point(i, j);

		System.out.println("\nEntre com as coordenadas do ponto 1 e ponto 2");
		int x0 = scan.nextInt();
		int y0 = scan.nextInt();
		int xf = scan.nextInt();
		int yf = scan.nextInt();

		Bresenham b = new Bresenham();

		List<Point> line = b.encontrarLinha(grid, x0, y0, xf, yf);

		b.desenharTela(grid, line);

	}

}
