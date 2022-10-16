package dad;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

	// view

	private Label buscarLabel;
	private TextField buscarTextField;
	private Button buscarButton;
	private Label reemplazarLabel;
	private TextField reemplazarTextField;
	private Button reemplazarButton;
	private CheckBox mayusMinusCheckBox;
	private CheckBox buscarHaciaAtrasCheckBox;
	private CheckBox expresionRegularCheckBox;
	private CheckBox resaltarResultadosCheckBox;
	private Button reemplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	
	public void start(Stage primaryStage) throws Exception {
	
	buscarLabel = new Label("Buscar:");
	buscarTextField = new TextField();
	buscarButton = new Button("Buscar");
	reemplazarLabel = new Label("Reemplazar con:");
	reemplazarTextField = new TextField();
	reemplazarButton = new Button("Reemplazar");
	mayusMinusCheckBox = new CheckBox("Mayúsculas y minúsculas");
	buscarHaciaAtrasCheckBox = new CheckBox("Buscar hacia atrás");
	expresionRegularCheckBox = new CheckBox("Expresión regular");
	resaltarResultadosCheckBox = new CheckBox("Resaltar resultados");
	reemplazarTodoButton = new Button("Reemplazar todo");
	cerrarButton = new Button("Cerrar");
	ayudaButton = new Button("Ayuda");
	
	GridPane checkboxs = new GridPane();
	//checkboxs.setGridLinesVisible(true); // Depuracion
	checkboxs.setPadding(new Insets(5));
	checkboxs.setHgap(5);
	checkboxs.setVgap(5);
	checkboxs.addRow(0, mayusMinusCheckBox, buscarHaciaAtrasCheckBox);
	checkboxs.addRow(1, expresionRegularCheckBox, resaltarResultadosCheckBox);
	
	GridPane root = new GridPane();
	//root.setGridLinesVisible(true); // Depuracion
	root.setPadding(new Insets(5));
	root.setHgap(5);
	root.setVgap(5);
	root.addRow(0, buscarLabel, buscarTextField);
	root.addRow(1, reemplazarLabel, reemplazarTextField);
	root.addRow(2, new Label(""), checkboxs);
	
	
	
	
	ColumnConstraints[] cols = {
			new ColumnConstraints(), 
			new ColumnConstraints(), 
	 };
	
	root.getColumnConstraints().setAll(cols);
	
	RowConstraints[] rows = { new RowConstraints(), 
			new RowConstraints(), 
			new RowConstraints() 
			};

	root.getRowConstraints().setAll(rows);
	
	ColumnConstraints[] colsCheckbox = {
			new ColumnConstraints(), 
			new ColumnConstraints(), 
	 };
	
	checkboxs.getColumnConstraints().setAll(colsCheckbox);
	
	RowConstraints[] rowsCheckBox = {
			new RowConstraints(), 
			new RowConstraints() 
			};

	checkboxs.getRowConstraints().setAll(rowsCheckBox);
	
	
	
	VBox buttonsPanel = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
	buttonsPanel.setPadding(new Insets(5));
	buttonsPanel.setAlignment(Pos.TOP_CENTER);
	buscarButton.setMaxWidth(Double.MAX_VALUE);
	reemplazarButton.setMaxWidth(Double.MAX_VALUE);
	reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
	cerrarButton.setMaxWidth(Double.MAX_VALUE);
	ayudaButton.setMaxWidth(Double.MAX_VALUE);
	
	
	
	HBox todoJunto = new HBox();
	todoJunto.getChildren().setAll(root, buttonsPanel);
	
	primaryStage.setTitle("Buscar y reemplazar");
	primaryStage.setScene(new Scene(todoJunto, 640, 480));
	primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
