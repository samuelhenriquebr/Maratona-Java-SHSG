package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
//            boolean newFile = file.createNewFile();
            System.out.println(file.createNewFile());
//            System.out.println(file.exists());
            boolean exists = file.exists();
            System.out.println("Permissao de leitura? "+file.canRead());
            System.out.println("Path "+file.getPath());
            System.out.println("Path "+file.getAbsolutePath());
            System.out.println("Diretório "+file.isDirectory());
            System.out.println("hidden? "+file.isHidden());
            System.out.println("last modified? "+new Date(file.lastModified()));
            if(exists){
                System.out.println("Deletado? "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
