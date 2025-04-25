module MCV_Team_Juego_Pinguino {
	requires java.sql;
	
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens vista to javafx.fxml;
	
	exports vista;
	exports controlador;
	exports modelo;
}