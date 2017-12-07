package hw9_1;

/* 
 * ���ϸ�: MyBinarySearchTree.java
 * �ۼ���: 2017.11.23.
 * �ۼ���: 201632023 ������
 * ����: int�� Ű�� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

import java.util.NoSuchElementException;

class MyBinarySearchTree {
	// Ʈ���� ��Ʈ ��带 ����ų �ν��Ͻ� ���� root �����ϰ� null�� �ʱ�ȭ
	// (��) ...
	private Node root = null;


	// Ʈ���� ��带 ǥ���ϴ� Ŭ���� - �ʵ�(int�� key, leftChild, rightChild), ������(key���� �Ű������Ͽ� �ʱ�ȭ)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;
		private Node(int key) {
			this.key = key;
		}
	}

	// (1) ��ü��ȸ�� ���� toString() �������̵�
	@Override
	public String toString() {
		String result = inorder(root);
		return result;
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ���ڿ��� �����ϴ� �޼ҵ�(��� �˰���)
	private String inorder(Node p) {
		String result = "";
		if(p != null) {
			result += inorder(p.leftChild);
			result += p.key + " ";
			result += inorder(p.rightChild);
		}
		return result;
	}

	// (2) ��� ����
	public void insert(int key) { 
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� key�� �����ϴ� �޼ҵ� (��� �˰���)
	private Node insertKey(Node p, int key) {
		if(p == null) {		
			Node newNode = new Node(key);
			return newNode;	
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;		// ��Ʈ �Һ�
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;		// ��Ʈ �Һ�        
		}
		else {  // key = p.key �� ��� ���� ����
			System.out.println("Insertion fail! key duplication : " + key);
			return p;  	// ��Ʈ �Һ�
		}
	}   

	// (3) ���� ��ȸ
	public void printPostorder() {
		postorder(root);
		System.out.println();
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�
	private void postorder(Node p) {
		if(p != null) {
			postorder(p.leftChild);
			postorder(p.rightChild);
			System.out.println(p.key);
		}
	}


	// (4) �˻� - Ʈ���� key�� �����ϴ� �� ���θ� �����ϴ� �޼ҵ�  
	public boolean contains(int key) {
		return contains(root, key);
	}

	private boolean contains(Node p, int key) {
		if(p.key == key) {
			return true;
		}
		else {
			if(key < p.key) {
				if(p.leftChild!=null) { 
					return contains(p.leftChild, key);
				}
				else 
					return false;
			}
			else {
				if(p.rightChild!=null) {
					return contains(p.rightChild, key);
				}
				else
					return false;
			}
		}
	}


	public int max(){
		return max(root);
	}

	// (5) �ִ밪 ��ȸ - Ʈ���� �ִ� Ű ���� �����ϴ� �޼ҵ�  
	public int max(Node p) throws NoSuchElementException{
		if(root == null){
			// ���� Ʈ���� ��� ���� �߻�
			throw new NoSuchElementException("�ִ밪 ��ȸ ����");
		}
		else{
			if(p.rightChild != null)
				return max(p.rightChild);
			else 
				return p.key;// ���� Ʈ���� �ƴ� ���, �ִ� Ű ���� ã�� ����
		}
	}

	// (6) ����  - Ʈ���� key�� �����ϰ�, ���� ���� ���θ� �����ϴ� �޼ҵ� (�ݺ� �˰���)
	public boolean add(int key) {
		if(root==null) {
			root = new Node(key);
			return true;
		}

		Node tmp = root;

		while(true) {
			if(tmp.key == key) {
				return false;
			}

			else if(key < tmp.key) {
				if(tmp.leftChild == null) {
					tmp.leftChild = new Node(key);
					return true;
				}
				tmp = tmp.leftChild;
			}
			else {
				if(tmp.rightChild == null) {
					tmp.rightChild = new Node(key);
					return true;
				}
				tmp = tmp.rightChild;
			}
		}
	}
}