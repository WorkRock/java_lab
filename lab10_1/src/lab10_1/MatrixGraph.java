package lab10_1;

public class MatrixGraph {
	private int[][] matrix;
	private int n;
	public MatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다.");
		}
		else if(matrix[v1][v2] != 0) {
			System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다.");
		}
		else {
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
			System.out.printf("삽입 완료.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("인접 정점 오류 - 잘못된 정점 번호입니다.");
		else {
			for(int i = 0; i < n; i++) {
				if(matrix[v1][i] != 0)
					System.out.println(i + " ");
			}
		}
	}
}
