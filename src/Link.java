public class Link {
	public String iData;
	public Link next;
	public Link prev;
	
	public Link(String d) {
		iData=d;
	}
        public void displayLink() {
		System.out.print(iData);
	}
	
}
