package SingletonandImmutable;

public class Singleclass {
	private static Singleclass singleclass;
	static{
		singleclass=new Singleclass();
	}
	private Singleclass(){
		
	}
	public static Singleclass getInstance(){
		if(singleclass==null){
			synchronized (Singleclass.class) {
				if (singleclass==null)
				singleclass=new Singleclass();	
			}
		}
		return singleclass;
	}

}
