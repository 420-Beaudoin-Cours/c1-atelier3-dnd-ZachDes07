package sample;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;


public class Controller {
    public TextField txfSource;
    public ImageView poubTarget;


    /**
     * Démarre le drag
     * @param mouseEvent
     */
    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        if(txfSource.getText().isEmpty()) {
            content.putString(txfSource.getText());
            db.setContent(content);
        }
    }

    /**
     * accepte le drag
     * @param dragEvent
     */
    public void poubTargetDragDropped(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    /**
     * Drop le drag
     * @param dragEvent
     */
    public void poubTargetDragOver(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        txfSource.setText(db.getString());
        txfSource.clear();
    }

    /**
     * Démarre le drag
     * @param mouseEvent
     */
    public void txfComboDragDetected(MouseEvent mouseEvent) {
        Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        if (txfSource.getText().isEmpty()) {
            content.putString(txfSource.getText());
            db.setContent(content);
        }
    }

    public void comboDragDropped(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void comboDragOver(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        txfSource.setText(db.getString());
        txfSource.clear();
    }
}
