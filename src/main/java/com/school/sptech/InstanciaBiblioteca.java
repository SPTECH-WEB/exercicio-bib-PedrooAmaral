package com.school.sptech;

public class InstanciaBiblioteca {

    public static void main (String[] args){
        Biblioteca objBiblioteca = new Biblioteca("otomanos", 15.0);
        System.out.println("Nome: " + objBiblioteca.getNome());
        System.out.println("Quantidade de livros: " + objBiblioteca.getQtdLivros());
        System.out.println("Multa diaria: "+ objBiblioteca.getMultaDiaria());
        System.out.println("Ativa: " + objBiblioteca.getAtiva());



    }
}
