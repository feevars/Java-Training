package com.estudandomockito.business;

import java.util.ArrayList;
import java.util.List;

import com.estudandomockito.data.api.TodoService;
//TodoBusinessImpl is called SUT
//is a dependency of TodoService because we need to call todoService to get the users
public class TodoBusinessImpl {
	
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
