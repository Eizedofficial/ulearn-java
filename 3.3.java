public class TodoList {
 	private ArrayList<String> Todos = new ArrayList<>();

    public void add(String todo) {
        Todos.add(todo);
    }

    public void add(int index, String todo) {
        Todos.add(index, todo);
    }

    public void edit(String todo, int index) {
        Todos.set(index, todo);
    }

    public void delete(int index) {
        if(index >= 0 && index < (long) Todos.size())
            Todos.remove(index);
    }

    public ArrayList<String> getTodos() {
        return Todos;
    }
}
