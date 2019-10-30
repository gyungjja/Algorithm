
public class BSTree {
	
	private BSTNode root;
	//Ž��
	public BSTNode search(int key){
		BSTNode p = root;	//���ο� ��忡 �ű��
		while(p != null)
		{
			if(p.getKey() > key){	//�뵵�� �����Ͱ��� Ű���� ũ��
				p = p.getLeft();	//��������
			}
			else if(p.getKey() == key){	//����� �����ΰ��� Ű���� ��ġ�ϸ� 
				return p;	//����
			}
			else
				p = p.getRight();	//�����Ͱ��� Ű���� ������ ����������
		}
		return p;	//��ȯ
		
	}
	//����
	public void insert(int key){
		BSTNode p = root;	//���ο� ��忡 �ű��
		BSTNode q = new BSTNode();	//�θ���
		while(p != null){
			if(key == p.getKey())	//Ű�� �����Ͱ��� ������
				return;		//����
			q = p;	//�θ��忡 �ű��
			if(key < p.getKey())	//Ű���� �����Ͱ����� ������
				p = p.getLeft();	//����
			else 
				p = p.getRight();	//Ű���� �����Ͱ����� ũ�� ������
			}
		BSTNode newNode = new BSTNode();	//���ο� ��忡 Ž���� ��尪������ �ְ�
		newNode.setKey(key);	//�־��ٲ� ����
		newNode.setRight(null);	//�־��ٲ� ����
		newNode.setLeft(null);	//�־��ٲ� ����
		
		if(root == null)	//null�̸�
			root = newNode;	
		else if(key < q.getKey())	//Ű���� �θ��庸�� ������
			q.setLeft(newNode);		//���ʿ�
		else	//Ű���� �θ��庸�� ũ��
			q.setRight(newNode);	//�����ʿ�
		return;	//����
		
	}
	//����
	
	public void delete(int key)
	{
		BSTNode parent = root;
		BSTNode p = root;
		boolean isLeftChild = false;
		
		while(p.getKey() != key)	//���� ã��
		{
			parent = p;	//�θ�
			if(p.getKey() > key)	//�θ���Ű�� Ű������ ũ��
			{
				isLeftChild = true;	//���� �ڽİ� ���� ��ġ�ϸ�
				p = p.getLeft();	//��������
			}
			else	//�ƴϸ�
			{
				isLeftChild = false;	//�����ڽİ� ���� ��ġ���� ������
				p = p.getRight();	//����������
			}
			if(p == null)	//��� ���� ������
				return;		//��ȯ
		}
		
		if((p.getLeft() == null) && (p.getRight() == null)) //��������� ���
		{
			if(p == root)	//root���� p �̸�
				root = null;	//root�� null
			if(isLeftChild == true)	//������ ����
				parent.setLeft(null);	//�θ��� ���� null����
			else //�ƴϸ�
				parent.setRight(null);	//�θ��� ������ null ����
		}
		else if((p.getRight() == null) || (p.getLeft() == null)) //����� ������ 1�� ���
		{
			if(p.getRight() == null)	//�������ڽ� ������
			{
				if(p == root)	//root��尡 p�̸�
					root = p.getLeft();	//p���ʰ��� root��
				else if(isLeftChild)	//������ ���� �ٸ���
					parent.setLeft(p.getLeft());	//�θ��� ���ʿ� ���ʰ� ����
				else
					parent.setRight(p.getLeft());	//�θ���� �����ʿ� ���ʰ� ����
			}
			
			else if(p.getLeft() == null)	//�����ڽ� ������
			{
				if(p == root)
					root = p.getRight();
				else if(isLeftChild)	//������ ���� �ٸ���
					parent.setLeft(p.getRight());	//�θ��� ���ʿ� �����ʰ� ����
				else
					parent.setRight(p.getRight());	//�θ��� �����ʿ� �����ʰ� ����
			}
		}
		else if(p.getLeft() != null && p.getRight() != null) //������ ����� ������ 2�� ���
		{
			BSTNode q = minNode(p);	//��� q�� ���p�ּҰ���� �ְ�
			if(p == root)	//��� p�� ���������
				root = q;	//��� q�� ��Ʈ
			else if(isLeftChild)	//������ ���� �ٸ���
				parent.setLeft(q);	//�θ��� ���ʿ� q�� ����
			else
				parent.setRight(q);	//�θ���� �����ʿ� q�� ����
			q.setLeft(p.getLeft());	//q�� ���� ��忡 ���p ���ʰ� ����
		}
		return;	//��ȯ
	}
		
	

	private BSTNode minNode(BSTNode deleteBSTNode){	//�ּҰ� ã��
		BSTNode min = null;
		BSTNode minParent = null;
		BSTNode q = deleteBSTNode.getRight();
		while(q != null)	//������� ������
		{
			minParent = min;	
			min = q;
			q = q.getLeft();
		}
		if(min != deleteBSTNode.getRight())	//��������� �������� ������� ������
		{
			minParent.setLeft(min.getRight());	//�θ���ʳ�忡 �����ʰ� ����
			min.setRight(deleteBSTNode.getRight());	//�ּҰ������ �����ʿ� �����ʰ� ����
		}
		return min;
	}
	
	public void print() {	//����Ʈ�Լ�
		printBST(root);
		System.out.println();
	}
	
	private void printBST(BSTNode root) {
		if(root != null) {	//������� ������
			System.out.print("<");
			printBST(root.getLeft());	//�������
			System.out.print(root.getKey());	//Ű�����
			printBST(root.getRight());	//���������
			System.out.print(">");
		}
	}

	
	
}