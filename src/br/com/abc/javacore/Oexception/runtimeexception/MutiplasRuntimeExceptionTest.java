package br.com.abc.javacore.Oexception.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MutiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
        System.out.println("final do programa");
        try {
            talvezLanceException();
        }catch(SQLException e){

        }catch (IOException e){

        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
