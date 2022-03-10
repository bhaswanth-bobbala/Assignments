package assignment1;

import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Nested
	class Finder{
		@Test
		@DisplayName("Test1")
		public void Test1() {
			MinMaxFinder finder=new MinMaxFinder();
			assertArrayEquals(new int[]{1,6}, finder.findMinMax(new int[] {2,3,1,6,5}));
		}
		
		@Test
		@DisplayName("Test2")
		public void Test2() {
			MinMaxFinder finder=new MinMaxFinder();
			assertArrayEquals(new int[]{3,56}, finder.findMinMax(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53} ));
		}
		
		@Test
		@DisplayName("Test3")
		public void Test3() {
			MinMaxFinder finder=new MinMaxFinder();
			assertArrayEquals(new int[]{11,101}, finder.findMinMax(new int[] {32,98,11,52,101,71}));
		}
	}

}
