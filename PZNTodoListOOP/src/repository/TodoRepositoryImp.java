package repository;

import entity.Todo;

public class TodoRepositoryImp implements TodoRepository{
    Todo[] data = new Todo[10];
    @Override
    public Todo[] getAll() {
        return data;
    }

    public boolean isFull(){
        var isFull = true;
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void reSize(){
        if (isFull()){
            var temp = data;
            data = new Todo[data.length * 2];
            for (var i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    public void add(Todo todoLits) {
        reSize();
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoLits;
                break;
            }
        }
    }

    @Override
    public void remove(Integer number) {

    }
}
