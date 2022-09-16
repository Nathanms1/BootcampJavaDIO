package BootcampJavaDIO.fluxoExcecoes;

import java.nio.charset.CodingErrorAction;

public class formatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (cepException e) {
            System.out.println("CEP não contém 8 dígitos");
        }            
    }

    static String formatarCep(String cep) throws cepException{
        if(cep.length() != 8)
          throw new cepException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
