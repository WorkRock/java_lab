package hw10_2;

import java.util.LinkedList;
import java.util.Queue;

public class MatrixGraph {
	private int[][] matrix;
	private int n;

	private boolean[] visitedDfs;
	private boolean[] visitedBfs;

	Queue<Integer> queue = new <Integer>LinkedList();

	public MatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
		visitedDfs = new boolean[n];
		visitedBfs = new boolean[n];
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
			matrix[v2][v1] = 1	;
			System.out.printf("삽입 완료.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("인접 정점 오류 - 잘못된 정점 번호입니다.");
		else {
			for(int i = 0; i < n; i++) {
				if(matrix[v1][i] != 0)
					System.out.print(i + " ");
			}
		}
	}

	private void dfs(int i) {
		visitedDfs[i] = true;

		System.out.print(i + " ");

		for(int j = 0; j < n; j++) {
			if(matrix[i][j] == 1 && visitedDfs[j] != true)
				dfs(j);
		}
	}

	public void depthFirstSearch()
	{
		for (int i = 0; i < n; i++) {
			visitedDfs[i] = false;
		}

		dfs(0);

		for (int i = 0; i < n; i++) {
			if(visitedDfs[i] != true) {
				System.out.print(i + " ");
			}
		}	
	}

	private void bfs(int i) {
		visitedBfs[i] = true;

		queue.offer(i);
		
		while(!queue.isEmpty()){
			int item = queue.poll();

			System.out.print(item + " ");

			for(int j =0; j < n; j++){
				if(matrix[item][j] == 1 && visitedBfs[j] == false){
					queue.offer(j);
					visitedBfs[j] = true;
				}
			}
		}
	}

	public void breadthFirstSearch() {
		for (int i = 0; i < n; i++){
			visitedBfs[i] = false;
		}

		bfs(0);

		for (int i = 0; i < n; i++) {
			if(visitedBfs[i] != true) {
				System.out.print(i + " ");
			}
		}
	}

}
