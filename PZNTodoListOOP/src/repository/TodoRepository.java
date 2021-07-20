package repository;

import entity.Todo;

public interface TodoRepository {
    Todo[] getAll();

    void add(Todo todoLits);
    void remove(Integer number);
}
