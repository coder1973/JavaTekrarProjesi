package day42_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; // yazmasak bile -public static final- bulunur
	
	public abstract void charge();
	
	void charge2(); //yazmasak bile public abstract gizli olarak yazilir
	
	public default void methodA() {
		//code
	}
	
	public static void methodB() {
		//code
	}


}
