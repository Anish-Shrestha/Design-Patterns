package lab3_1package;

public interface TargetQueue {
	
	public void enqueue(String str);
    public String dequeue();
    public String front();
    public boolean isEmpty();
}
