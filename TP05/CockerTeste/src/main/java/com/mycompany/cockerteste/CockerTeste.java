package com.mycompany.cockerteste;


import javax.swing.JOptionPane;

class Animal {
    private String tipo;
    private String cor;

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Cor: " + cor;
    }
}

class Cachorro extends Animal {
    private String nome;
    private String raca;

    public Cachorro(String tipo, String cor, String nome, String raca) {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nome: " + nome + ", Raça: " + raca;
    }
}

class Cocker extends Cachorro {
    private boolean tosa;

    public Cocker(String tipo, String cor, String nome, String raca, boolean tosa) {
        super(tipo, cor, nome, raca);
        this.tosa = tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public String precisaTosa() {
        return tosa ? "Precisa de tosa" : "Não precisa de tosa";
    }

    @Override
    public String toString() {
        return super.toString() + ", " + precisaTosa();
    }
}

public class CockerTeste {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Digite o tipo do animal:");
        String cor = JOptionPane.showInputDialog("Digite a cor do animal:");
        String nome = JOptionPane.showInputDialog("Digite o nome do cachorro:");
        String raca = JOptionPane.showInputDialog("Digite a raça do cachorro:");
        boolean tosa = JOptionPane.showConfirmDialog(null, "O cachorro precisa de tosa?") == JOptionPane.YES_OPTION;

        Cocker cocker = new Cocker(tipo, cor, nome, raca, tosa);

        JOptionPane.showMessageDialog(null, cocker.toString());
    }
}
