package model;

import model.intefaces.Remuneravel;

public class Professor extends Pessoa implements Remuneravel {

    @Override
    public void quemSouEu() {
        System.out.println("Sou um model.Professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ministrar aulas");
    }

    @Override
    public String toString() {
        return "model.Professor: " + nome + " | Idade: " + idade;
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void aplicarBonus() {

    }
}
