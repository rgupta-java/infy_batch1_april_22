package com.bookapp.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MockitoWithAL {

	@Test
	public void mockALSize() {
		List list=mock(List.class);
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}
	
	@Test
	public void mockALSizeReturnManyTime() {
		List list=mock(List.class);
		when(list.size())
		.thenReturn(10)
		.thenReturn(20);
		
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}
	
	@Test
	public void mockALSizeWithGet() {
		List list=mock(List.class);
		when(list.get(0)).thenReturn("yms champs");
		assertEquals("yms champs", list.get(0));
	}
	
	@Test
	public void mockALSizeWithAny() {
		List list=mock(List.class);
		when(list.get(anyInt())).thenReturn("yms champs");
		assertEquals("yms champs", list.get(10));
	}
}
