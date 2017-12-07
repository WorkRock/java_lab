package hw10_1;

public class ListGraph {
	private Node[] list;
	private int n;
	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		}
		else if(list[v1] != null && list[v2] != null 
				&& list[v1].vertex == v2
				&& list[v2].vertex == v1) {
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�.");
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
			System.out.printf("���� �Ϸ�.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else {
			System.out.print("����" + v1 + "�� ��������Ʈ");
			for(Node temp = list[v1]; temp != null; temp = temp.link) {
				System.out.print("->" + temp.vertex);
			}
			System.out.println();
		}
	}

	private class Node{
		int vertex;
		Node link;
	}
}
