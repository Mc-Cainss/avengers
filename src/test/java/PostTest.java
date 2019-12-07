import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Post;
import org.springframework.data.redis.samples.retwisj.Range;

public class PostTest {

	private Post postTest = null;
	

	@Before
	public void initPostTest() {
		postTest = new Post();

	}

	@Test
	public void setContentTest() {
		String testValue = "test";
		postTest.setContent(testValue);
		assertEquals(postTest.getContent(),testValue);
	}

	@Test
	public void setUidTest() {
		String testValue = "test";
		postTest.setUid(testValue);
		assertEquals(postTest.getUid(),testValue);
	}

	@Test
	public void setTimeTest() {
		String testValue = "test";
		postTest.setTime(testValue);
		assertEquals(postTest.getTime(),testValue);
	}

	@Test
	public void setReplyPidTest() {
		String testValue = "test";
		postTest.setReplyPid(testValue);
		assertEquals(postTest.getReplyPid(),testValue);
	}

	@Test
	public void setReplyUidTest() {
		String testValue = "test";
		postTest.setReplyUid(testValue);
		assertEquals(postTest.getReplyUid(),testValue);

	}



/*TODO test to String*/

}
