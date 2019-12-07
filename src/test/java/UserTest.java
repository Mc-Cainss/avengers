import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Post;
import org.springframework.data.redis.samples.retwisj.Range;
import org.springframework.data.redis.samples.retwisj.User;


public class UserTest {

	private User userTest = null;
	private string testName = "nom";
	private string testPassword = "pass";

	@Before
	public void initRange() {
		userTest= new User(testName,testPassword);

	}

	@Test
	public void newUserTest() {
		assertEquals(userTest.getName(),testName);
		assertEquals(userTest.getPass(),testPassword);	
	}	
	
	@Test
	public void setIdTest() {
		Long value= 1L;
		userTest.setId(value);
		assertEquals(userTest.getId(),value);	
	}
	
	@Test
	public void setPassTest() {
		string testNewPassword = "newpass";
		userTest.setPass(testNewPassword);
		assertEquals(userTest.getPass(),testNewPassword);	
	}
	
	@Test
	public void setAuthKeyTest() {
		string testAuthKey = "auth";
		userTest.setAuthKey(testAuthKey);
		assertEquals(userTest.getAuthKey(),testAuthKey);	
	}


}
