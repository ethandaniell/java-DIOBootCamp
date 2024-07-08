package dio.ethan.desafio03.DesafioDeCodigo;

import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;
  
    public Cofre(String tipo, String metodoAbertura) {
      this.tipo = tipo;
      this.metodoAbertura = metodoAbertura;
    }
  
    public void imprimirInformacoes() {
      System.out.println("Tipo: " + this.tipo);
      System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}
  
class CofreDigital extends Cofre {
  
    private int senha;
  
    public CofreDigital(int senha) {
      super("Cofre Digital", "Senha");
      this.senha = senha;
    }
  
    public boolean validarSenha(int confirmacaoSenha) {
      return confirmacaoSenha == this.senha;
    }
}
  
class CofreFisico extends Cofre {
  
    public CofreFisico() {
      super("Cofre Fisico", "Chave");
    }
  
}
  
class Desafio {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o tipo de cofre a ser criado: ");
      String tipoCofre = scanner.nextLine();
      
      // Implemente a condição necessário para a verificação dos cofres seguros:
      if (tipoCofre.equalsIgnoreCase("digital")) {
        System.out.println("Digite a senha: ");
        int senha01 = scanner.nextInt();

        System.out.println("Confirme a senha: ");
        int senha02 = scanner.nextInt();

        CofreDigital cofreDigital = new CofreDigital(senha01);

        cofreDigital.imprimirInformacoes();

        if(cofreDigital.validarSenha(senha02) == true) {
            System.out.println("Cofre aberto!");
        } else {
            System.out.println("Senha incorreta!");
        }
      } else if (tipoCofre.equalsIgnoreCase("fisico")) {
        CofreFisico cofreFisico = new CofreFisico();
        cofreFisico.imprimirInformacoes();
      }

      scanner.close();
    }
}

