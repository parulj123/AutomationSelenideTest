package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemoFinish {
	
	@Test
	public void test1() {
		System.out.println("I am Inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am Inside Test 2");
	}
	@Test
	public void test3() {
		System.out.println("I am Inside Test 3");
	}
}
