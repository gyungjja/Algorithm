
public class BSTree {
	
	private BSTNode root;
	//탐색
	public BSTNode search(int key){
		BSTNode p = root;	//새로운 노드에 옮기고
		while(p != null)
		{
			if(p.getKey() > key){	//노도의 데이터값이 키보다 크면
				p = p.getLeft();	//왼쪽으로
			}
			else if(p.getKey() == key){	//노드의 데이턱값이 키값과 일치하면 
				return p;	//종료
			}
			else
				p = p.getRight();	//데이터값이 키보다 작으면 오른쪽으로
		}
		return p;	//반환
		
	}
	//삽입
	public void insert(int key){
		BSTNode p = root;	//새로운 노드에 옮기고
		BSTNode q = new BSTNode();	//부모노드
		while(p != null){
			if(key == p.getKey())	//키와 데이터값이 같으면
				return;		//리턴
			q = p;	//부모노드에 옮기고
			if(key < p.getKey())	//키값이 데이터값보다 작으면
				p = p.getLeft();	//왼쪽
			else 
				p = p.getRight();	//키값이 데이터값보다 크면 오른쪽
			}
		BSTNode newNode = new BSTNode();	//새로운 노드에 탐색한 노드값정보를 넣고
		newNode.setKey(key);	//넣어줄꺼 생성
		newNode.setRight(null);	//넣어줄꺼 생성
		newNode.setLeft(null);	//넣어줄꺼 생성
		
		if(root == null)	//null이면
			root = newNode;	
		else if(key < q.getKey())	//키값이 부모노드보다 작으면
			q.setLeft(newNode);		//왼쪽에
		else	//키값이 부모노드보다 크면
			q.setRight(newNode);	//오른쪽에
		return;	//리턴
		
	}
	//삭제
	
	public void delete(int key)
	{
		BSTNode parent = root;
		BSTNode p = root;
		boolean isLeftChild = false;
		
		while(p.getKey() != key)	//값을 찾기
		{
			parent = p;	//부모
			if(p.getKey() > key)	//부모노드키가 키값보다 크면
			{
				isLeftChild = true;	//왼쪽 자식과 값이 일치하면
				p = p.getLeft();	//왼쪽으로
			}
			else	//아니면
			{
				isLeftChild = false;	//왼쪽자식과 값이 일치하지 않으면
				p = p.getRight();	//오른쪽으로
			}
			if(p == null)	//노드 값이 없으면
				return;		//반환
		}
		
		if((p.getLeft() == null) && (p.getRight() == null)) //리프노드인 경우
		{
			if(p == root)	//root노드는 p 이면
				root = null;	//root는 null
			if(isLeftChild == true)	//삭제할 노드면
				parent.setLeft(null);	//부모노드 왼쪽 null설정
			else //아니면
				parent.setRight(null);	//부모노드 오른쪽 null 설정
		}
		else if((p.getRight() == null) || (p.getLeft() == null)) //노드의 차수가 1인 경우
		{
			if(p.getRight() == null)	//오른쪽자식 없으면
			{
				if(p == root)	//root노드가 p이면
					root = p.getLeft();	//p왼쪽값을 root에
				else if(isLeftChild)	//삭제할 노드와 다르면
					parent.setLeft(p.getLeft());	//부모노드 왼쪽에 왼쪽값 설정
				else
					parent.setRight(p.getLeft());	//부모느드 오른쪽에 왼쪽값 설정
			}
			
			else if(p.getLeft() == null)	//왼쪽자식 없으면
			{
				if(p == root)
					root = p.getRight();
				else if(isLeftChild)	//삭제할 노드와 다르면
					parent.setLeft(p.getRight());	//부모노드 왼쪽에 오른쪽값 설정
				else
					parent.setRight(p.getRight());	//부모노드 오른쪽에 오른쪽값 설정
			}
		}
		else if(p.getLeft() != null && p.getRight() != null) //삭제할 노드의 차수가 2인 경우
		{
			BSTNode q = minNode(p);	//노드 q에 노드p최소값노드 넣고
			if(p == root)	//노드 p가 비어있으면
				root = q;	//노드 q는 루트
			else if(isLeftChild)	//삭제할 노드와 다르면
				parent.setLeft(q);	//부모노드 왼쪽에 q값 설정
			else
				parent.setRight(q);	//부모느드 오른쪽에 q값 설정
			q.setLeft(p.getLeft());	//q의 왼쪽 노드에 노드p 왼쪽값 설정
		}
		return;	//반환
	}
		
	

	private BSTNode minNode(BSTNode deleteBSTNode){	//최소값 찾기
		BSTNode min = null;
		BSTNode minParent = null;
		BSTNode q = deleteBSTNode.getRight();
		while(q != null)	//비어있지 않으면
		{
			minParent = min;	
			min = q;
			q = q.getLeft();
		}
		if(min != deleteBSTNode.getRight())	//삭제노드의 오른쪽이 비어있지 않으면
		{
			minParent.setLeft(min.getRight());	//부모왼쪽노드에 오른쪽값 설정
			min.setRight(deleteBSTNode.getRight());	//최소값노드의 오른쪽에 오른쪽값 삭제
		}
		return min;
	}
	
	public void print() {	//프린트함수
		printBST(root);
		System.out.println();
	}
	
	private void printBST(BSTNode root) {
		if(root != null) {	//비어있지 않으면
			System.out.print("<");
			printBST(root.getLeft());	//왼쪽출력
			System.out.print(root.getKey());	//키값출력
			printBST(root.getRight());	//오른쪽출력
			System.out.print(">");
		}
	}

	
	
}