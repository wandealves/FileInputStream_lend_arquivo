package com.wordpress.javaes;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author https://javaes.wordpress.com
 */
public class LerArquivo {

    public void ler(String nomedoarquivo) {
        int i;
        // o código a seguir usa try-with-resources para abrir um arquivo
        // e depois fechá-lo automaticamente quando o bloco try é deixado.
        try (FileInputStream fin = new FileInputStream(nomedoarquivo)) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
