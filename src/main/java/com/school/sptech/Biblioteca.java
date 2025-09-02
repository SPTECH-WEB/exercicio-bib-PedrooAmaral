package com.school.sptech;

public class Biblioteca {

    private String nome;
    private Double multaDiaria;
    private Integer qtdLivros = 0;
    private Boolean ativa = true;

    // construtor

    public Biblioteca(String nome, Double multaDiaria){
        this.nome = nome;
        this.multaDiaria = multaDiaria;
    }

    public void registrarLivro(Integer quantidade){
      if (ativa == true) {
          if (quantidade != null) {
            if (quantidade > 0) {
                qtdLivros = qtdLivros + quantidade;
            }
        } else {
            System.out.println("Nulo");
        }
      }
    }
    public Integer emprestar(Integer quantidade){
      if (ativa == true){
          if (quantidade != null){
              if (quantidade>0){
                  if (qtdLivros >= quantidade){
                      qtdLivros = qtdLivros - quantidade;
                  }
                  else{
                      return null;
                  }
              }
              else{
                  return null;
              }
          }
          else{
              return null;
          }
          return quantidade;
      }
      return null;
    }
    public Integer devolver(Integer quantidade){
        if (ativa == true){
            if (quantidade != null){
                if (quantidade <= 0){
                    return null;
                }else{
                        qtdLivros = qtdLivros + quantidade;
                        return quantidade;
                }
            }
                else{
                    return null;
                }
            }
            else{
                return null;
                }
    }
    public Integer desativar(){
        if(ativa == false){
            return null;
        }
        else {
            ativa = false;
            int qtd = qtdLivros;
            qtdLivros = 0;
            return qtd;
        }
    }
    public void transferir(Biblioteca destino, Integer quantidade){
        if(destino.getAtiva() == true){
            if(quantidade != null){
                if(quantidade <= qtdLivros){
                    this.qtdLivros = this.qtdLivros - quantidade;
                    destino.qtdLivros = destino.qtdLivros + quantidade;
                }
            }
        }
    }
    public Boolean reajustarMulta(Double percentual){
        if(percentual != null){
            if(percentual > 0){
                multaDiaria = multaDiaria * 1.10;
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }


    public String getNome(){
     return nome;
    }
    public Double getMultaDiaria(){
        return multaDiaria;
    }
    public Integer getQtdLivros(){
        return qtdLivros;
    }
    public Boolean getAtiva(){
        return ativa;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}


