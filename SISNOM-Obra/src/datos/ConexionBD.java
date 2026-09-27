package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// PILAR EVIDENCIADO: Abstracción (Oculta la complejidad de la conexión a los controladores)
public class ConexionBD {
    
    // Ruta local donde se creará el archivo físico de la base de datos SQLite
    private static final String URL = "jdbc:sqlite:sisnom_obra.db";
    private Connection conexion;

    /**
     * Establece la conexión con la base de datos local.
     * Si el archivo 'sisnom_obra.db' no existe, SQLite lo crea automáticamente.
     */
    public Connection conectar() {
        try {
            // Carga el driver JDBC de SQLite exigido en los requerimientos de interfaz
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión a SQLite establecida con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    /**
     * Cierra la conexión para liberar recursos y proteger la integridad de los datos (RNF-04).
     */
    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión a SQLite cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}