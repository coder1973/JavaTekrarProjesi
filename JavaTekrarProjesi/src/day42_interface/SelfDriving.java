package day42_interface;

public interface SelfDriving {
	
	void selfDrive(); // burada gizli olarak --> public abstract var
	
	public default void methodA() {
		//code
	}
	
	public static void methodB() {
		//code
	}
}
