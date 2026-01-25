package DesignPatterns;

// this is lazy intitialization
class SingleTon{
	private static SingleTon instance = null;
	private SingleTon() {
		
	}
	public static synchronized SingleTon getInstance() {
		if(instance == null) {
			return new SingleTon();
		}
		return instance;
	}
}

// this is eager initialization
class EagerSingleTon{
	private static final EagerSingleTon instance = new EagerSingleTon() ;
	private EagerSingleTon() {}
	public static synchronized EagerSingleTon getInstance() {
		return instance;
	}
}

// clonable not accepted 
class EagerSingleTonNotClone implements Cloneable{
	private EagerSingleTonNotClone() {}
	private static final EagerSingleTonNotClone instance  = new EagerSingleTonNotClone();
	public static synchronized EagerSingleTonNotClone getEagerSingleTonNotClone() {
		return instance;
	}
	
	clone(){
		throw Exception("Not allowed");
	}
}
public class Single1 {
	public static void main(String[] args) {
		
	}
}
