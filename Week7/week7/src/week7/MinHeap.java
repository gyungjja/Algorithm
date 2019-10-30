package week7;


public class MinHeap {
	private int count;
	private Edge[] item;
	
	public MinHeap()
	{
		count = 0;
		item = new Edge[64];
	}
	
	public void insert(Edge newItem)
	{
		int i;
		if(count >= (item.length - 1))
		{
			System.out.println("Heap is full");
			return;
		}
		count++;
		
		for(i=count ; ;)
		{
			if(i==1)
				break;
			if(newItem.compareTo(item[i/2]) >= 0)
				break;
			item[i] = item[i/2];
			i = i/2;
		}
		item[i] = newItem;		
	}
	
	public Edge delete()
	{
		if(count == 0)
			return null;
		else
		{
			int i, j;
			Edge temp, deletedItem;
			
			deletedItem = item[1];
			temp = item[count--];
			i = 1;
			j = 2 * i;
			
			while(j <= count)
			{
				if(j < count)
				{
					if(item[j+1].compareTo(item[j]) < 0)
						j++;
				}				
				if(item[j].compareTo(temp) < 0)
				{
					item[i] = item[j];
					i = j;
					j = 2 * i;
				}
				else
				{
					item[i] = temp;
					return deletedItem;
				}
			}
			item[i] = temp;
			return deletedItem;
		}
	}
	
	public int numberElements()
	{
		return count;
	}
}