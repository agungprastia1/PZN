package service;

import entity.Todo;
import repository.TodoRepository;

public class TodoListServiceImp implements TodoService{
    private TodoRepository todoRepository;

    public TodoListServiceImp(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public void showTodo() {
        Todo[] model = todoRepository.getAll();
        System.out.println("=== ->> TODOLIST <<-- ===");
        for(var i = 0; i< model.length;i++){
            var todo = model[i];
            var no = i+1;

            if(todo != null){
                System.out.println(no+" "+todo.getTodo());
            }
        }
    }

    @Override
    public void addTodo(String todolist) {
        Todo todo = new Todo(todolist);
        todoRepository.add(todo);
    }

    @Override
    public void removeTodo(Integer number) {

    }
}
