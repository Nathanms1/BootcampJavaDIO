package BootcampJavaDIO.frameworkCollections.metodosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {
    public static void main(String[] args) {
        //criar lista com as seguintes notas de um aluno [7, 8.5, 9.3, 5, 6, 0, 3.6]

        List <Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(6d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);

        //exibir a posição da nota 9.3
        System.out.println("Posição da nota 9.3: " + notas.indexOf(9.3));
      
        //adicionar a nota 8.7 na posição 4
        notas.add(4, 8.7d);

        System.out.println(notas);

        //substituir a nota 5 pela nota 7
        notas.set(notas.indexOf(5d), 7d);
        System.out.println(notas);

        //conferir se a nota 5 está na lista
        System.out.println("Existe alguma nota 5 na lista? " + notas.contains(5d));

        //exibir a terceira nota
        System.out.println(notas.get(2));

        //exibir a menor nota
        System.out.println(Collections.min(notas));

        //exiba a maior nota
        System.out.println(Collections.max(notas));

        //exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //exiba a media das notas
        System.out.println(soma/notas.size());

        //remover a nota 0
        notas.remove(0d);
        System.out.println(notas);

        //remover as notas menores que 7
        Iterator<Double> iteratorRemove = notas.iterator();
        while(iteratorRemove.hasNext()){
            Double next = iteratorRemove.next();
            if (next < 7) iteratorRemove.remove();
        }
        System.out.println(notas);

        //apagar toda a lista
        notas.clear();
        System.out.println(notas);

        //validar se a lista esta vazia
        System.out.println(notas.isEmpty());


        //nova lista de notas para exercitar
        List <Double> notas2 = new ArrayList<>();
        notas2.add(5d);
        notas2.add(8.3d);
        notas2.add(2.6d);
        notas2.add(7.3d);
        notas2.add(6.7d);
        notas2.add(9.2d);

        System.out.println(notas2);

        //exibir primeira nota
        System.out.println(notas2.get(0));
        //exibir primeira nota e excluir
        System.out.println(notas2.remove(0));
        //validar exclusão da primeira nota
        System.out.println(notas2);
    }
    
}
