package fr.btssio.ksav_admin.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static final String HOST = "172.28.36.4";
    private static final int PORT = 3306;
    private static final String DB = "ksav";
    private static final String USER = "iblandin";
    private static final String PASSWORD = "Dmnstrtr124-";

    private static Connection connection = null;

    /**
     * Permet de retourner la connexion à la BDD et la créer si elle n'est pas
     * initialiser.
     *
     * @return Connection Connexion à la BDD.
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB;
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                Logger.getLogger(Database.class.getName()).log(Level.WARNING, e.getMessage());
            }
        }
        return connection;
    }

}
