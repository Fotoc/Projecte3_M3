package Projecte3;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;
import java.util.List ;
import java.util.ArrayList ;
public class Connexio {

    private Connection connection ;
    
   

    public Connexio(String driverClassName, String dbURL, String user, String password) throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        connection = DriverManager.getConnection(dbURL, user, password);
    }

    public void shutdown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public List<Client> getPersonList() throws SQLException {
        try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Usuaris");
        ){
            List<Client> personList = new ArrayList<>();
            while (rs.next()) {
                String dni = rs.getString("DNI");
                String nom = rs.getString("Nom");
                String cognoms = rs.getString("Cognoms");
                Client person = new Client(dni, nom, cognoms);
                personList.add(person);
            }
            return personList ;
        } 
    }
    
    public List<CursColectiu> getCursColList() throws SQLException {
        try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Cursos C, Colectius CC WHERE C.ID_Curs=CC.ID_Curs");
        ){
            List<CursColectiu> curscolList = new ArrayList<>();
            while (rs.next()) {
                int idcurs = rs.getInt("ID_curs");
                String nom = rs.getString("Nom");
                int preuhora = rs.getInt("Preu_hora");
                CursColectiu curscol = new CursColectiu(idcurs, nom, preuhora);
                curscolList.add(curscol);
            }
            return curscolList ;
        } 
    }
    
    public List<CursCompeticio> getCursComList() throws SQLException {
        try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Cursos C, Competicio CCo WHERE C.ID_Curs=CCo.ID_Curs");
        ){
            List<CursCompeticio> curscomList = new ArrayList<>();
            while (rs.next()) {
                int idcurs = rs.getInt("ID_curs");
                String nom = rs.getString("Nom");
                int preuhora = rs.getInt("Preu_hora");
                String nivellcurs = rs.getString("nivell");
                CursCompeticio curscom = new CursCompeticio(idcurs, nom, preuhora, nivellcurs);
                curscomList.add(curscom);
            }
            return curscomList ;
        } 
    }
    
    public List<CursIndividual> getCursIndList() throws SQLException {
        try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Cursos C, Individuals CI WHERE C.ID_Curs=CI.ID_Curs");
        ){
            List<CursIndividual> curscomList = new ArrayList<>();
            while (rs.next()) {
                int idcurs = rs.getInt("ID_curs");
                String nom = rs.getString("Nom");
                int preuhora = rs.getInt("Preu_hora");
                CursIndividual cursind = new CursIndividual(idcurs, nom, preuhora);
                curscomList.add(cursind);
            }
            return curscomList ;
        } 
    }


    
   
    
}