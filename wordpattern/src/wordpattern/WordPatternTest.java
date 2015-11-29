package wordpattern;

import static org.junit.Assert.*;

import javax.annotation.PostConstruct;

import org.junit.Before;
import org.junit.Test;

public class WordPatternTest {

	private  Solution solution;

   /* pattern = "abba", str = "dog cat cat dog" should return true.
    pattern = "abba", str = "dog cat cat fish" should return false.
    pattern = "aaaa", str = "dog cat cat dog" should return false.
    pattern = "abba", str = "dog dog dog dog" should return false.*/

	@Before
	public void setup()
	{
		solution = new Solution(); 
	}
	
	
	@Test
	public void test1() {
		
		assertTrue(solution.wordPattern("abba", "dog cat cat dog")); 
		
	}
	
	@Test public void test2()
	{
		
		assertFalse((solution.wordPattern("abba", "dog cat cat fish")));
		//"dog cat cat fish"
	}
	
	@Test public void test3()
	{
		assertFalse((solution.wordPattern("aaaa", "dog cat cat dog")));
		//"dog cat cat fish"
	}
	
	@Test public void test4()
	{
		assertFalse((solution.wordPattern("abba", "dog dog cat dog")));
		//"dog cat cat fish"
	}
	
	@Test public void test5()
	{
		assertFalse((solution.wordPattern("abba", "dog dog dog dog")));
		//"dog cat cat fish"
	}
	

}
