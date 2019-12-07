import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Post;
import org.springframework.data.redis.samples.retwisj.Range;

public class PostTest {

	private Post postTest = null;

	@Before
	public void initRange() {
		postTest = new Post();

	}

	@Test
	public void setContentTest() {
		postTest.setContent("test");
		assertEquals(postTest.getContent(),"test");
	}

	@Test
	public void setUidTest() {
		postTest.setUid("test");
		assertEquals(postTest.getUid(),"test");
	}

	@Test
	public void setTimeTest() {
		postTest.setTime("test");
		assertEquals(postTest.getTime(),"test");
	}

	@Test
	public void setReplyPidTest() {
		postTest.setReplyPid("test");
		assertEquals(postTest.getReplyPid(),"test");
	}

	@Test
	public void setReplyUidTest() {
		postTest.setReplyUid("test");
		assertEquals(postTest.getReplyUid(),"test");

	}



/*TODO test to String*/

}
