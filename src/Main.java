/*
Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":

"Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        String message =  "Conteúdo a ser gravado no arquivo.";

        File file = new File("arquivo.txt");

        try (FileWriter fw = new FileWriter(file)){
            fw.write(message);
            System.out.println("Mensagem gravada com sucesso em arquivo.txt");
        }catch (IOException e){
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}