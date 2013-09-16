package com.jblackett;

//import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void test() {
		
		String names2evaluate = "wes kim justin leanne ";
		
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("leanne");
		list.add("justin");
		list.add("kim");
		list.add("wes");
		
		Assert.assertEquals(names2evaluate, list.print());
	}

}
