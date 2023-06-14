package Multithreading;

public class multithread {
	
	
	public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new multidemu());
            object.start();
        }
    }

}
