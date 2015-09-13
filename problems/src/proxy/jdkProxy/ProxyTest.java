package proxy.jdkProxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		UserDao target = new UserDaoImpl();

		LogHandler handler = new LogHandler(target);

		UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				handler);
		
		userDaoProxy.save();
		userDaoProxy.delete();
	}
}
