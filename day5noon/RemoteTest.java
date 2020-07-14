package day5noon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemoteTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		Remote remote=new Remote();
		remote.setCommand(new All(), 1);
		remote.setCommand(new Mom(), 2);
		String ans=remote.useCounter(2);
		//System.out.println(ans);
		assertEquals("TVonTVoffSoundupSoundoffserialset",ans);
	}

}
