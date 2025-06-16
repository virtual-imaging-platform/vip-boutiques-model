package fr.insalyon.creatis.boutiques;

public class BoutiquesException extends Exception {
    public BoutiquesException(String message) {
        super(message);
    }

    public BoutiquesException(String message, Throwable cause) {
        super(message, cause);
    }
}
