package com.estudandomockito.data.api;

import java.util.Arrays;
import java.util.List;

import com.estudandomockito.data.api.TodoService;

public class TodoServiceStub implements TodoService {
//Problems - Dynamic Conditions - complex code, large and difficult to maintain
	//Service Definition - Use Mock instead of Stub
	public List<String> retrieveTodos(String user) {
		
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn JUnit");
	}

}
