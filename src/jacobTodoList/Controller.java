package jacobTodoList;

import jacobTodoList.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize(){
        TodoItem item1= new TodoItem("Mail birthday card","Buy a 30th birthday card for John",
                LocalDate.of(2019, Month.NOVEMBER,26));
        TodoItem item2= new TodoItem("Doctors appointment","See dr. smith at 123 main street",
                LocalDate.of(2019, Month.DECEMBER,6));
        TodoItem item3= new TodoItem("Mikolaj quwa","Prezenty quwa",
                LocalDate.of(2019, Month.DECEMBER,15));
        TodoItem item4= new TodoItem("Dounat birthday ","Give a lot of love ",
                LocalDate.of(2019, Month.NOVEMBER,28));
        TodoItem item5= new TodoItem("Christmas  ","Snow Good and love ",
                LocalDate.of(2019, Month.DECEMBER,24));
        todoItems =  new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }
    @FXML
    public void handleClickListView()
    {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        itemDetailsTextArea.setText();
//        System.out.println(item);
        StringBuilder sb = new StringBuilder(item.getDetails());
          sb.append("\n\n\n\n");
          sb.append("DUE: ");
          sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(sb.toString());
    }


}
