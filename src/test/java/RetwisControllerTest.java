import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Post;
import org.springframework.data.redis.samples.retwisj.Range;
import org.springframework.data.redis.samples.retwisj.User;


public class RetwisControllerTest {


	private User userTest = null;
	
	

	@Before
	public void initUserName() {
		String testName = "nom";
		String testPassword = "pass";
		userTest= new User(testName,testPassword);

	}

	@Test
	public void newUserTest() {
		String testName = "nom";
		String testPassword = "pass";
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
		String testNewPassword = "newpass";
		userTest.setPass(testNewPassword);
		assertEquals(userTest.getPass(),testNewPassword);	
	}
	
	@Test
	public void setAuthKeyTest() {
		String testAuthKey = "auth";
		userTest.setAuthKey(testAuthKey);
		assertEquals(userTest.getAuthKey(),testAuthKey);	
	}



}
