package test.service;

import repository.TodoRepository;
import repository.TodoRepositoryImp;
import service.TodoListServiceImp;
import service.TodoService;

public class TodoListTest {
    public static void main(String[] args) {
        testShowVoidTodo();
    }

    public static void testShowVoidTodo(){
        TodoRepositoryImp todoRepository = new TodoRepositoryImp();
        TodoService todoService = new TodoListServiceImp(todoRepository);

        todoService.showTodo();
    }
}
