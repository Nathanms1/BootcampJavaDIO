package BootcampJavaDIO.frameworkCollections.metodosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class separarTimesFutebol {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>(){{
        add(new Jogador("Nathan", "Goleiro", "Regular"));
        add(new Jogador("Leo", "Ponta", "Regular"));
        add(new Jogador("Bruno", "Zagueiro", "Regular"));
        add(new Jogador("Dudu", "Ala", "Regular"));
        add(new Jogador("Neymar", "Meia", "Ótimo"));
        add(new Jogador("Neuer", "Goleiro", "Ótimo"));
        add(new Jogador("Carlinhos", "Atacante", "Regular"));
        add(new Jogador("Marco", "Meia", "Regular"));


        }};
        
        //System.out.println(jogadores);
        
        
        Collections.shuffle(jogadores);
        for (Jogador jogadore : jogadores) System.out.println(jogadore);

        for (double x = 0; x < jogadores.); x++) {
            
        }
    }
}

class Jogador implements Comparable<Jogador>{
    private String nome;
    private String posicao;
    private String qualidade;

    public Jogador(String nome, String posicao, String qualidade) {
        this.nome = nome;
        this.posicao = posicao;
        this.qualidade = qualidade;
    }

    public String getNome() {
        return nome;
        }

    public String getPosicao() {
        return posicao;
        }
        
    public String getQualidade() {
        return qualidade;
        }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Posição: " + posicao + " | Nível: " + qualidade;
    }

    @Override
    public int compareTo(Jogador player) {
        
        return this.getNome().compareToIgnoreCase(player.getNome());
    }
}
