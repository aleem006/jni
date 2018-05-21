
public class MainClass {

	/**
	 * jni program
	 */
	public native void print();
	
	public static void main(String[] args) {

		new MainClass().print();
	}
	static{
		System.loadLibrary("MainClass");
	}

}
