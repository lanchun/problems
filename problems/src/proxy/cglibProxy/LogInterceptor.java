package proxy.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class LogInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("method start..");
		proxy.invokeSuper(obj, args);
		System.out.println("method end..");
		return null;
	}

	/** 
     * 创建代理对象 
     *  
     * @param target 
     * @return 
     */  
    public  Object getInstance(Class<?> clazz) {  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(clazz);  
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();  
    }  
}
