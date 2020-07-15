package bogdan.jovanovic.todolist;

import bogdan.jovanovic.todolist.datamodel.TodoData;
import bogdan.jovanovic.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults(){
        String shortDesription= shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue=deadlinePicker.getValue();

        TodoItem newItem= new TodoItem(shortDesription,details,deadlineValue);

        TodoData.getInstance().addTodoItem(newItem);

        return newItem;

    }





}
