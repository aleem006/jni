
public class MainClass {

	/**
	 * jni program using C++
	 */
	public native void print();
	
	public static void main(String[] args) {

		new MainClass().print();
	}
	static{
		System.loadLibrary("MainClass");
	}

}
