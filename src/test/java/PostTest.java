import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Post;
import org.springframework.data.redis.samples.retwisj.Range;

public class PostTest {

	private Post postTest = null;
	private string testValue = "test";

	@Before
	public void initPostTest() {
		postTest = new Post();

	}

	@Test
	public void setContentTest() {
		postTest.setContent(testValue);
		assertEquals(postTest.getContent(),testValue);
	}

	@Test
	public void setUidTest() {
		postTest.setUid(testValue);
		assertEquals(postTest.getUid(),testValue);
	}

	@Test
	public void setTimeTest() {
		postTest.setTime(testValue);
		assertEquals(postTest.getTime(),testValue);
	}

	@Test
	public void setReplyPidTest() {
		postTest.setReplyPid(testValue);
		assertEquals(postTest.getReplyPid(),testValue);
	}

	@Test
	public void setReplyUidTest() {
		postTest.setReplyUid(testValue);
		assertEquals(postTest.getReplyUid(),testValue);

	}



/*TODO test to String*/

}
