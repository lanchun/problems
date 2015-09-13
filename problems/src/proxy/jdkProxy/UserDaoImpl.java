package proxy.jdkProxy;

public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("a user saved!");
	}

	@Override
	public void delete() {
		System.out.println("deleted a user!");
	}

}
