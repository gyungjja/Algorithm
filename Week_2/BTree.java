package week2;


public class BTree {
	private TreeNode root;  // Ʈ������� root ����.
	
	public BTree(){
		this.root = null; // �����ڿ� ���԰��� ������� root�� null
	}
	public BTree(BTree left,Object data, BTree right){ // ���԰��� ��������� ������.
		root = new TreeNode(data);	//data ����
		root.setLeft(left.root);	//����
		root.setRight(right.root);	//����
	}
	public void setRoot(TreeNode root){	//root ����
		this.root = root;
	}
	public TreeNode getRoot(){	//root�� ����
		return this.root;
	}
	public boolean isEmpty(){
		return root == null;
		
	}
	public BTree leftSubTree(){
		BTree leftTree = new BTree(); //����Ʈ�� ����.
		leftTree.root = this.root.getLeft(); // ����Ʈ���� ��Ʈ�� �������Ʈ���� ����.
		return leftTree; // ��ȯ
		
	}
	public BTree rightSubTree(){	//������ ����Ʈ�� ��ȸ
		BTree rightTree = new BTree();
		rightTree.root = this.root.getRight();
		return rightTree;
		
	}
	public Object getRootData(){	//root ��������
		return this.root;
	}
	public void inorder(){	//Ʈ�� ���� ��ȸ
		this.B_inorder(this.root);
	}
	private void B_inorder(TreeNode T){
		if(T != null) {
			this.B_inorder(T.getLeft()); // ���� ����Ʈ���� ���� ��ȸ
			System.out.print(T.getData() + " ");	//��Ʈ��带 �湮
			this.B_inorder(T.getRight());	//������ ����Ʈ�� ������ȸ
		}
	}
	public void preorder(){	//Ʈ�� ���� ��ȸ
		this.B_preorder(this.root);
		
	}
	private void B_preorder(TreeNode T){
		if(T != null) {
			System.out.print(T.getData()+" ");	//��Ʈ��� �湮
			B_preorder(T.getLeft());	//���� ����Ʈ�� ���� ��ȸ
			B_preorder(T.getRight());	//������ ����Ʈ�� ���� ��ȸ
		}
		
	}
	public void postorder(){	//Ʈ������ ��ȸ
		this.B_postorder(this.root);
		
	}
	private void B_postorder(TreeNode T){
		if(T != null) {
			B_postorder(T.getLeft());	//���� ����Ʈ���� ������ȸ
			B_postorder(T.getRight());	//������ ���� Ʈ���� ������ȸ
			System.out.print(T.getData() + " ");	//��Ʈ��� �湮
		}
		
	}
	
	public void iterInorder(){ //�ݺ��� ���� ��ȸ
		Stack stack = new Stack(); //stack ��ü ����
		TreeNode p = root;	//root ���� p�� ����
		
		if(p != null)	//��Ʈ(������)�� ������
			stack.push(p);	//���ÿ� p�� �ְ�
		
		while(!stack.isEmpty()) {	//�����Ͱ� ������ �ݺ�
			if(p != null) {	
				p=stack.peek();	//top ������ �ִ��� Ȯ��
				p=p.getLeft();	//���� ��ȸ
				while(p!=null) {	//�����Ͱ� ������
					stack.push(p);	//p�� �ְ�
					p=p.getLeft();	//���ʼ�ȸ
				}
			}
			p=stack.pop();	//�����͸� ����
			System.out.print(p.getData()+" ");	//��Ʈ��� �湮
			p=p.getRight();	//������ ��ȸ
			if(p != null)	
				stack.push(p);	//�����͸� ����
		}
		
		
	}
	public void iterPreorder(){ //�ݺ��� ���� ��ȸ
		Stack stack = new Stack();
		TreeNode p = root;
		
		if(p != null)//��Ʈ(������)�� ������
			stack.push(p);	//���ÿ� �����͸� �ְ�
		while(!stack.isEmpty()) {	//�����Ͱ� ���������� �ݺ�
			if(p != null) {	
				p=stack.peek();	//top ������ �ִ��� Ȯ��
				System.out.print(p.getData()+" ");	//��Ʈ��� �湮
				p = p.getLeft();	//���� ��ȸ
				while(p != null) {	//�����Ͱ� ������
					stack.push(p);	//�����͸� �ְ�
					System.out.print(p.getData() + " ");	//��Ʈ���湮
					p=p.getLeft();	//���� ��ȸ
				}
			}
			p=stack.pop();	//�����͸� ����
			p=p.getRight();	//������ �湮
			
			if(p != null)
				stack.push(p);	//�����͸� ����
				}
			}
}