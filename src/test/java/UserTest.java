import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Post;
import org.springframework.data.redis.samples.retwisj.Range;
import org.springframework.data.redis.samples.retwisj.User;


public class UserTest {

	private User userTest = null;

	@Before
	public void initRange() {
		userTest= new User("nom","pass");

	}

	@Test
	public void newUserTest() {
		assertEquals(userTest.getName(),"nom");
		assertEquals(userTest.getPass(),"pass");	
	}	
	
	@Test
	public void setIdTest() {
		Long value= 1L;
		userTest.setId(value);
		assertEquals(userTest.getId(),value);	
	}
	
	@Test
	public void setPassTest() {
		userTest.setPass("newpass");
		assertEquals(userTest.getPass(),"newpass");	
	}
	
	@Test
	public void setAuthKeyTest() {
		userTest.setAuthKey("auth");
		assertEquals(userTest.getAuthKey(),"auth");	
	}


}
