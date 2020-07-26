package myArrayList;

public class MyArrayList {
	
	int top=-1;
	int length=1;
	int a[] = new int[length*2];
	
	public int[] createArray(int[] arr) 
	{
		
		int new_arr[] = new int[length*2];
		for(int i=0;i<length;i++)
		{
			new_arr[i]=a[i];
		}
		
		length=2*length;
		return new_arr;
		
	}

	//This function implement the functionality of adding functionality in arraylist 
	public void add(int data)
	{
		if(top==length-1)
		{
			a = createArray(a);
		}
		a[++top]=data;
	}
	public void add(int data, int index)
	{
		if(top==length-1)
		{
			a = createArray(a);
		}
		for(int i=0; i<=top-index;i++)
		{
			a[top+1-i]=a[top-i];
		}
		a[index]=data;
		top++;
		
	}
	public int remove(int index)
	{
		int i;
		for(i=0;i<top-index;i++)
		{
			 a[index+i]=a[index+i+1];
		}
		a[index+i]=0;
		top--;
		return a[index];
	}
	
	public boolean contain(int data)
	{
		for(int i=0;i<=top;i++)
		{
			if(a[i]==data)
			{
				return true;
			}
		}
		return false;
	}
	
	public void print()
{
		for(int i=0;i<=top;i++)
		{
		System.out.print(a[i]+" ");
		}
}
	

}
