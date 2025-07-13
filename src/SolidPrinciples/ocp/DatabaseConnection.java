package SolidPrinciples.ocp;

public class DatabaseConnection {
    void connect() {
        System.out.println("Connected to database");
    }
    void disconnect() {
        System.out.println("Disconnected from database");
    }
}
