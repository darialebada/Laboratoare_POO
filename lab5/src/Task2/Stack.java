package Task2;

import Task1.Task;

import java.util.ArrayList;

public class Stack implements Container {
    ArrayList<Task> list = new ArrayList<Task>();

    @Override
    public Task pop() {
        if (list.isEmpty())
            return null;
        Task rmv = list.get(list.size() - 1);
        list.remove(rmv);
        return rmv;
    }

    @Override
    public void push(Task task) {
        list.add(task);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if (list.size() == 0)
            return true;
        return false;
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            Task element = container.pop();
            this.push(element);
        }
    }

    @Override
    public ArrayList<Task> getTasks() {
        return list;
    }
}
