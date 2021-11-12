public class StackX {
	private int maxSize=100;
	private String[] stackArray;
	private int top;
	
	public StackX()
	{
		stackArray=new String[maxSize];
		top=-1;
	}
	
	public void push(String j)
	{
		stackArray[++top]=j;
	}
	
	public String pop()
	{
		return stackArray[top--];
	}
	
	public String peek()
	{
		return stackArray[top];
	}
	
	public Boolean isEmpty() {
		if (top== -1)
			return true;
		else
			return false;
	}
	
	public Boolean isFull()
	{
		if(maxSize== ++top)
			return true;
		else
			return false;
	}
}
