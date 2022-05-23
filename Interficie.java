package Projecte3;

import java.net.MalformedURLException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Interficie extends Application{
    
    public static void main (String[] args) throws MalformedURLException{
         
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bp = new BorderPane();
        stage.getIcons().add(new Image("Imatges/logo.png"));
        ImageView logo = new ImageView ("Imatges/logo.png");
        logo.setOpacity(0.7);
        logo.setFitHeight(100);
        logo.setFitWidth(100);
        HBox hb = new HBox();
        hb.getChildren().add(new Label("ESKYDAM"));
        hb.setTranslateX(120);
        hb.setTranslateY(20);
       
        hb.setStyle("-fx-font-weight:bold");
        hb.setStyle("-fx-font-size: 20");
        hb.setMinWidth(160);
        hb.setAlignment(Pos.CENTER);
        
        Label lblDades = new Label ("Dades del Client");
        lblDades.setFont(new Font(30));
        lblDades.setTextFill(Color.web("#0e0edb"));
        lblDades.setTranslateX(250);
        lblDades.setTranslateY(50);
        

        Label lblDni = new Label("DNI: ");
        lblDni.setTranslateX(250);
        lblDni.setTranslateY(140);
        
        TextField txtDni = new TextField();
        txtDni.relocate(350, 135);
        
        
        Label lblNom = new Label ("Nom: ");
        lblNom.setTranslateX(250);
        lblNom.setTranslateY(200);
        
        TextField txtNom = new TextField();
        txtNom.relocate(350, 195);
       
        Label lblCognoms = new Label ("Cognoms: ");
        lblCognoms.setTranslateX(250);
        lblCognoms.setTranslateY(260);
       
        TextField txtCognoms = new TextField();
        txtCognoms.relocate(350, 255);
        
        ImageView logo2 = new ImageView ("Imatges/user.png");
        logo2.setFitHeight(140);
        logo2.setFitWidth(140);
        logo2.setTranslateX(520);
        logo2.setTranslateY(140);
       
       
        Label lblCurs = new Label ("Dades del Curs");
        lblCurs.setFont(new Font(30));
        lblCurs.setTextFill(Color.web("#0e0edb"));
        lblCurs.setTranslateX(250);
        lblCurs.setTranslateY(320);
        
        Label lblId = new Label("ID del curs: ");
        lblId.setTranslateX(250);
        lblId.setTranslateY(390);
        
        TextField txtId = new TextField();
        txtId.relocate(350, 385);
        
        Label lblnomCurs = new Label("Nom del curs: ");
        lblnomCurs.setTranslateX(250);
        lblnomCurs.setTranslateY(450);
        
        TextField txtnomCurs = new TextField();
        txtnomCurs.relocate(350, 445);
         
        Label lblCategoria = new Label("Categoria: ");
        lblCategoria.setTranslateX(250);
        lblCategoria.setTranslateY(510);
        
        CheckBox cbCol = new CheckBox("Col·lectiu");
        cbCol.setTranslateX(250);
        cbCol.setTranslateY(540);
        cbCol.setIndeterminate(false);
        
        CheckBox cbInd = new CheckBox("Individual");
        cbInd.setTranslateX(350);
        cbInd.setTranslateY(540);
        cbInd.setIndeterminate(false);
        
        CheckBox cbComp = new CheckBox("Competició");
        cbComp.setTranslateX(460);
        cbComp.setTranslateY(540);
        cbComp.setIndeterminate(false);
        
        //TextField txtCategoria = new TextField();
        //txtCategoria.relocate(350, 505);
        
        Label lblPreuH = new Label("Preu per hora: ");
        lblPreuH.setTranslateX(250);
        lblPreuH.setTranslateY(590);
        
        TextField txtPreuH = new TextField();
        txtPreuH.relocate(350, 585);
        
        Label lblNHores = new Label("Numero d'hores: ");
        lblNHores.setTranslateX(250);
        lblNHores.setTranslateY(650);
        
        CheckBox cb1 = new CheckBox("1 hora");
        cb1.setTranslateX(250);
        cb1.setTranslateY(680);
        cb1.setIndeterminate(false);
        
        CheckBox cb2 = new CheckBox("2 hores");
        cb2.setTranslateX(320);
        cb2.setTranslateY(680);
        cb2.setIndeterminate(false);
        
        CheckBox cb3 = new CheckBox("3 hores");
        cb3.setTranslateX(390);
        cb3.setTranslateY(680);
        cb3.setIndeterminate(false);
        
        CheckBox cbTot = new CheckBox("Tot el dia");
        cbTot.setTranslateX(460);
        cbTot.setTranslateY(680);
        cbTot.setIndeterminate(false);
        
        
        Label lblPreu = new Label("Preu total: ");
        lblPreu.setTranslateX(250);
        lblPreu.setTranslateY(740);
        TextField txtPreu = new TextField();
        txtPreu.relocate(350, 735);
        
        Button btnElimina = new Button ("Eliminar");
        btnElimina.relocate(250, 810);
        btnElimina.setTextFill(Color.web("#ffffff"));
        btnElimina.setStyle("-fx-background-color:#0e0edb; ");
        
        Button btnLlogar = new Button ("Llogar");
        btnLlogar.relocate(320, 810);
        btnLlogar.setTextFill(Color.web("#ffffff"));
        btnLlogar.setStyle("-fx-background-color:#0e0edb; ");
        
        Button btnTancar = new Button ("Tancar");
        btnTancar.relocate(390, 810);
        btnTancar.setTextFill(Color.web("#ffffff"));
        btnTancar.setStyle("-fx-background-color:#0e0edb;");
        btnTancar.setOnAction(e -> stage.close());
        
        ImageView logo3 = new ImageView ("Imatges/esqui.png");
        logo3.setFitHeight(180);
        logo3.setFitWidth(180);
        logo3.setTranslateX(520);
        logo3.setTranslateY(380);
        
        
        /*Label lblCursos = new Label("Cursos");
        lblCursos.setTranslateX(860);
        lblCursos.setTranslateY(60);
        lblCursos.setFont(new Font(30));
        lblCursos.setTextFill(Color.web("#0e0edb"));
        
        
        TableView<Cursos> tblClients = new TableView<>();
        TableColumn<Cursos, String> colID = new TableColumn<>("ID");
        TableColumn<Cursos, String> colNom = new TableColumn<>("Nom");
        TableColumn<Cursos, String> colCategoria = new TableColumn<>("Categoria");
        TableColumn<Cursos, String> colPreu = new TableColumn<>("Preu hora");
        tblClients.setTranslateX(735);
        tblClients.setTranslateY(120);
        tblClients.getColumns().addAll(colID,colNom,colCategoria,colPreu);
        
        colID.setCellValueFactory(new PropertyValueFactory<>("dni"));
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colPreu.setCellValueFactory(new PropertyValueFactory<>("preu_hora"));*/
        bp.setRight(Dreta());
        Pane pane = new Pane();
        
        pane.getChildren().addAll(hb,logo,lblDades,lblDni,txtDni,lblNom,txtNom,lblCognoms,txtCognoms,logo2,lblCurs,lblId,
                txtId,lblnomCurs,txtnomCurs,lblCategoria,cbCol,cbInd,cbComp,lblPreuH,txtPreuH,lblNHores,cb1,cb2,cb3,cbTot,lblPreu,txtPreu,btnElimina,btnLlogar,btnTancar,logo3,bp);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        
        stage.setTitle("ESKYDAM");
        stage.show();  
    }
    
    
    
    private Pane Dreta(){
        VBox vLateral = new VBox();
        vLateral.setAlignment(Pos.CENTER);
        Label lblCursos = new Label("Cursos");
        lblCursos.setTranslateX(750);
        lblCursos.setTranslateY(90);
        lblCursos.setFont(new Font(30));
        lblCursos.setTextFill(Color.web("#0e0edb"));
        
        
        TableView<Cursos> tblClients = new TableView<>();
        TableColumn<Cursos, String> colID = new TableColumn<>("ID");
        TableColumn<Cursos, String> colNom = new TableColumn<>("Nom");
        TableColumn<Cursos, String> colCategoria = new TableColumn<>("Categoria");
        TableColumn<Cursos, String> colPreu = new TableColumn<>("Preu hora");
        tblClients.setTranslateX(735);
        tblClients.setTranslateY(120);
        tblClients.getColumns().addAll(colID,colNom,colCategoria,colPreu);
        
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colPreu.setCellValueFactory(new PropertyValueFactory<>("preu_hora"));
        
        vLateral.getChildren().addAll(lblCursos,tblClients);
        return vLateral;
    }
    
   } 