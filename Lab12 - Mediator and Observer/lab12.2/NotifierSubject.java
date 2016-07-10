package lab12_2;

public interface NotifierSubject {
	public void addName(String name);

	public void removeName(int index);

	public void notifyObservers();
}
