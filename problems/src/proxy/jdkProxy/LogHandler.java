package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class LogHandler implements InvocationHandler {

	public Object target;

	public LogHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		System.out.println("method ["+methodName+"] starts at:"+new Date());
		
		method.invoke(target, args);
		
		System.out.println("method ["+methodName+"] ends at:"+new Date());
		
		return null;
	}

}
