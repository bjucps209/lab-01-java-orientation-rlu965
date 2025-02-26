package app;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MainWindow {

    // Model variables

    private TicTacToeGame model = new TicTacToeGame();

    // GUI controls

    @FXML VBox vbox;

    @FXML Label lblMessage;
    
       
    
        // FXML Event Handlers
    
        @FXML 
        void initialize() {
            model.setGrid( new char[][]{
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
        });
    }

    @FXML
    void onButtonClicked(ActionEvent event) {
        Button btnClicked = (Button) event.getSource();

        ObservableList<Node> hboxList = vbox.getChildren();
        for (int row = 0; row < model.getGrid().length; ++row) {
            HBox hbox = (HBox) hboxList.get(row);
            ObservableList<Node> btnList = hbox.getChildren();
            for (int col = 0; col < model.getGrid()[row].length; ++col) {
                if (btnClicked == btnList.get(col)) {
                    model.processMove(row, col);
                    btnClicked.setText(String.valueOf(model.getGrid()[row][col]));
                    if (model.getWinner() != ' ') {
                        lblMessage.setText(model.getWinner() + " Wins!");
                        
                    }
                }
            }
        }

    }

  

   
}
