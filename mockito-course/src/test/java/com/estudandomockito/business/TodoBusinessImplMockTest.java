package com.estudandomockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.estudandomockito.business.TodoBusinessImpl;
import com.estudandomockito.data.api.TodoService;
import com.estudandomockito.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
}
