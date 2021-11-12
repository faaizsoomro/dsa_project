public class Queue {
	private int maxSize=100;
	private String[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue () {
		queArray= new String[maxSize];
		front =0;
		rear=-1;
		nItems=0;
	}
	
	public void insert(String j) {
		if(!isFull()) {
		if(rear==maxSize-1)
			rear=-1;
		queArray[++rear]=j;
		nItems++;
		}
	}
	
	public String remove()
	{
	
		String temp= queArray[front++];
		if(front==maxSize)
			front=0;
			nItems--;
		return temp;
	}
	
	public String peekFront()
	{
		return queArray[front];
	}
	public String peekRear()
	{
		return queArray[rear];
	}
	public Boolean isEmpty() {
		if(nItems==0)
			return true;
		else
			return false;
	}
	public Boolean isFull()
	{
		if(nItems==maxSize)
			return true;
		else
			return false;
	}
	public int size() {
		return nItems;
	}
	public void display()
	{
		for(int i=nItems;i>0;i--)
		{
			System.out.print(queArray[i]+"  ");
		}
	}
        
}