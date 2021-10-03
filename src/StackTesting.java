import static org.junit.Assert.*;

import org.junit.Test;

public class StackTesting {

	@Test
	public void testStackSize() {
		
		MyStack s = new MyStack(0);
		
		assertEquals(0, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpush1()  throws Exception {
		
		
		MyStack s= new MyStack(1);
		s.push(1);
		assertEquals(1, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpush2() throws Exception {
		
		MyStack s= new MyStack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		assertEquals(3, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpush3() throws Exception {
		
		MyStack s= new MyStack(10);
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		assertEquals(10, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpush4() throws Exception {
		
		int n=10;
		MyStack s= new MyStack(12);
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		s.push(10);
		s.push(11);
		
		assertEquals(n+2, s.size());
	}
	
	@Test (expected = Exception.class)
	public void testpop1() throws Exception {
		
		MyStack s= new MyStack(1);
		s.push(1);
		s.pop();
		assertEquals(0, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpop2() throws Exception  {
		
		MyStack s= new MyStack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		assertEquals(1, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpop3() throws Exception {
		
		MyStack s= new MyStack(10);
		for(int i=0;i<10;i++) {
			s.push(i);
			s.pop();
		}
		
		assertEquals(0, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpop4() throws Exception {
		
		MyStack s= new MyStack(10);
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		s.pop();
		assertEquals(9, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpop5() throws Exception {
		
		MyStack s= new MyStack(10);
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		for(int i=0;i<5;i++) {
			s.pop();
		}
		
		assertEquals(5, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpop6() throws Exception {
		
		MyStack s=new MyStack(6);
		s.push(1);
		s.pop();
		s.push(2);
		s.pop();
		s.push(3);
		s.pop();
		s.push(4);
		s.pop();
		s.push(5);
		s.pop();
		s.push(6);
		s.pop();
		s.push(8);
		
		assertEquals(1, s.size());
	}
	
	@Test(expected = Exception.class)
	public void testpop7() throws Exception {
		
		int n=10;
		MyStack s= new MyStack(10);
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		s.pop();
		s.pop();
		
		assertEquals(n-2, s.size());
	}

}
