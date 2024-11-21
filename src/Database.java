import java.sql.*;

public class Database {
    private Connection connection;

    public Database() {
        try {
            // Conectar a la base de datos SQLite
            connection = DriverManager.getConnection("jdbc:sqlite:universidad.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión
    public Connection getConnection() {
        return connection;
    }

    // Método para cerrar la conexión
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}