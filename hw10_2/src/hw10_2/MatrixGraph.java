package hw10_2;

public class MatrixGraph {
	private int[][] matrix;
	private int n;
	
	public MatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		}
		else if(matrix[v1][v2] != 0) {
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�.");
		}
		else {
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1	;
			System.out.printf("���� �Ϸ�.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else {
			for(int i = 0; i < n; i++) {
				if(matrix[v1][i] != 0)
					System.out.print(i + " ");
			}
		}
	}
	
	public void depthFirstSearch() {
		
	}
}
