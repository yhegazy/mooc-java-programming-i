import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList(){
      this.todoList = new ArrayList<>();
    }

    public void add(String task){
      this.todoList.add(task);
    }

    public void print(){
      String print = "";
      for (String task: this.todoList){
          print = print + (this.todoList.indexOf(task) +1) + ": " + task + "\n";
      }
        System.out.print(print);
    }

    public void remove(int number){
      this.todoList.remove(number-1);
    }
}
