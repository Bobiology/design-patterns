package singleton.pattern;

public class Synchronized {
	private volatile static Synchronized singletonObject;
	private Synchronized() {}
	public static Synchronized getInstance() {
		/*if(singletonObject==null) {
			synchronized(){
				if(singletonObject==null) {
					singletonObject=new Synchronized();
				}
			}
		}*/
		return singletonObject;
	}

}
