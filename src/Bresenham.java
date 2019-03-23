import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

public class Bresenham {

	public List<Point> encontrarLinha(Point[][] grade, int x0, int y0, int x1, int y1) {

		List<Point> linha = new ArrayList<Point>();

		int deltaX = Math.abs(x1 - x0);
		int deltaY = Math.abs(y1 - y0);

		int sx = x0 < x1 ? 1 : -1;
		int sy = y0 < y1 ? 1 : -1;

		int erro = deltaX - deltaY;
		int e2;

		while (true) {
			linha.add(grade[x0][y0]);

			if (x0 == x1 && y0 == y1)
				break;

			e2 = 2 * erro;
			if (e2 > -deltaY) {
				erro = erro - deltaY;
				x0 = x0 + sx;
			}

			if (e2 < deltaX) {
				erro = erro + deltaX;
				y0 = y0 + sy;
			}
		}
		return linha;
	}

	public void desenharTela(Point[][] grade, List<Point> linha) {
		int linhas = grade.length;
		int colunas = grade[0].length;

		System.out.println("\nGrade : \n");

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (linha.contains(grade[i][j]))					
					System.out.print("(" + i + "," + j + ")");
				else					
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
