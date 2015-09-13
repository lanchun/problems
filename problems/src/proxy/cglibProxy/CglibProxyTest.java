package proxy.cglibProxy;

public class CglibProxyTest {

	public static void main(String[] args) {
		LogInterceptor li = new LogInterceptor();
		Target proxy = (Target) li.getInstance(Target.class);
		proxy.foo();
	}

}
