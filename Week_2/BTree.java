package week2;


public class BTree {
	private TreeNode root;  // 트리형노드 root 생성.
	
	public BTree(){
		this.root = null; // 생성자에 대입값이 없을경우 root는 null
	}
	public BTree(BTree left,Object data, BTree right){ // 대입값을 받은경우의 생성자.
		root = new TreeNode(data);	//data 저장
		root.setLeft(left.root);	//설정
		root.setRight(right.root);	//설정
	}
	public void setRoot(TreeNode root){	//root 설정
		this.root = root;
	}
	public TreeNode getRoot(){	//root를 얻어옴
		return this.root;
	}
	public boolean isEmpty(){
		return root == null;
		
	}
	public BTree leftSubTree(){
		BTree leftTree = new BTree(); //왼쪽트리 생성.
		leftTree.root = this.root.getLeft(); // 왼쪽트리의 루트를 현재왼쪽트리로 대입.
		return leftTree; // 반환
		
	}
	public BTree rightSubTree(){	//오른쪽 서브트리 순회
		BTree rightTree = new BTree();
		rightTree.root = this.root.getRight();
		return rightTree;
		
	}
	public Object getRootData(){	//root 가져오기
		return this.root;
	}
	public void inorder(){	//트리 중위 순회
		this.B_inorder(this.root);
	}
	private void B_inorder(TreeNode T){
		if(T != null) {
			this.B_inorder(T.getLeft()); // 왼쪽 서브트리를 중위 순회
			System.out.print(T.getData() + " ");	//루트노드를 방문
			this.B_inorder(T.getRight());	//오른쪽 서브트리 중위순회
		}
	}
	public void preorder(){	//트리 전위 순회
		this.B_preorder(this.root);
		
	}
	private void B_preorder(TreeNode T){
		if(T != null) {
			System.out.print(T.getData()+" ");	//루트노드 방문
			B_preorder(T.getLeft());	//왼쪽 서브트리 전위 순회
			B_preorder(T.getRight());	//오른쪽 서브트리 전위 순회
		}
		
	}
	public void postorder(){	//트리후위 순회
		this.B_postorder(this.root);
		
	}
	private void B_postorder(TreeNode T){
		if(T != null) {
			B_postorder(T.getLeft());	//왼쪽 서브트리를 후위순회
			B_postorder(T.getRight());	//오른쪽 서브 트리를 후위순회
			System.out.print(T.getData() + " ");	//루트노드 방문
		}
		
	}
	
	public void iterInorder(){ //반복적 중위 순회
		Stack stack = new Stack(); //stack 객체 생성
		TreeNode p = root;	//root 값을 p에 저장
		
		if(p != null)	//루트(데이터)가 있으면
			stack.push(p);	//스택에 p를 넣고
		
		while(!stack.isEmpty()) {	//데이터가 있으면 반복
			if(p != null) {	
				p=stack.peek();	//top 데이터 있는지 확인
				p=p.getLeft();	//왼쪽 순회
				while(p!=null) {	//데이터가 있으면
					stack.push(p);	//p를 넣고
					p=p.getLeft();	//왼쪽순회
				}
			}
			p=stack.pop();	//데이터를 빼고
			System.out.print(p.getData()+" ");	//루트노드 방문
			p=p.getRight();	//오른쪽 순회
			if(p != null)	
				stack.push(p);	//데이터를 넣음
		}
		
		
	}
	public void iterPreorder(){ //반복적 전위 순회
		Stack stack = new Stack();
		TreeNode p = root;
		
		if(p != null)//루트(데이터)가 있으면
			stack.push(p);	//스택에 데이터를 넣고
		while(!stack.isEmpty()) {	//데이터가 있을때까지 반복
			if(p != null) {	
				p=stack.peek();	//top 데이터 있는지 확인
				System.out.print(p.getData()+" ");	//루트노드 방문
				p = p.getLeft();	//왼쪽 순회
				while(p != null) {	//데이터가 있으면
					stack.push(p);	//데이터를 넣고
					System.out.print(p.getData() + " ");	//루트노드방문
					p=p.getLeft();	//왼쪽 순회
				}
			}
			p=stack.pop();	//데이터를 빼고
			p=p.getRight();	//오른쪽 방문
			
			if(p != null)
				stack.push(p);	//데이터를 넣음
				}
			}
}