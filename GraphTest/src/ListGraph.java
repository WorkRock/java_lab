import java.util.LinkedList;
import java.util.Queue;


public class ListGraph {
	private Node[] list;
	private int n;
	private boolean[] visitedDfs;
	private boolean[] visitedBfs;
	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
		visitedDfs = new boolean[n];
		visitedBfs = new boolean[n];
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다.");
		}
		else if(list[v1] != null && list[v2] != null 
				&& list[v1].vertex == v2
				&& list[v2].vertex == v1) {
			System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다.");
		}
		else {
			Node newNode1 = new Node();

			newNode1.vertex = v2;
			newNode1.link = list[v1];
			list[v1] = newNode1;

			Node newNode2 = new Node();

			newNode2.vertex = v1;
			newNode2.link = list[v2];
			list[v2] = newNode2;
			System.out.printf("삽입 완료.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("인접 정점 오류 - 잘못된 정점 번호입니다.");
		else {
			System.out.print("정점" + v1 + "의 인접리스트");
			for(Node temp = list[v1]; temp != null; temp = temp.link) {
				System.out.print("->" + temp.vertex);
			}
			System.out.println();
		}
	}

	public void dfs(int i) {
		visitedDfs[i] = true;

		System.out.print(i + " ");

		Node temp = list[i];

		while(temp != null) {
			if(visitedDfs[temp.vertex] != true)
				dfs(temp.vertex);

			temp = temp.link;
		}
	}

	public void depthFirstSearch() {
		for(int i = 0; i < n; i++) {
			visitedDfs[i] = false;
		}

		dfs(0);

		for(int i = 0; i < n; i++) {
			if(visitedDfs[i] != true) {
				System.out.print(i + " ");
			}
		}
	}

	public void bfs(int i) {
		Node temp = new Node();
		visitedBfs[i] = true;
		Queue<Integer> q = new <Integer>LinkedList();
		
		q.offer(i);
		
		System.out.print(i + " ");
		
		while(!q.isEmpty()) {
			i = q.poll();
			for(temp = list[i]; temp != null; temp = temp.link) {
				if(visitedBfs[temp.vertex] != true) {
					visitedBfs[temp.vertex] = true;
					q.offer(temp.vertex);	
					System.out.print(temp.vertex + " ");
				}
			}
		}
}

	public void breadthFirstSearch() {
		for(int i = 0; i < n; i++) {
			visitedBfs[i] = false;
		}

		bfs(0);

		for(int i = 0; i < n; i++) {
			if(visitedDfs[i] != true) {
				System.out.print(i + " ");
			}
		}
	}

	private class Node{
		int vertex;
		Node link;
	}
}
