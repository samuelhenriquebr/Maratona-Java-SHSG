package br.com.abc.javacore.Oexception.runtimeexception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MutiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");
        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }

    private static void talvezLanceException() throws SQLException, AWTException, IOException {

    }
}
