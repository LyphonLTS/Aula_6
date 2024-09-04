import java.util.Scanner;

import Controller.Violao;
import Controller.ViolaoPrototype;

class Main {
  public static void main(String[] args) {
    int continuar = -1;
    Violao violao = new Violao();

    // Violão clássico
    ViolaoPrototype violaoClassico = violao.clone();

    // Violão folk
    ViolaoPrototype violaoFolk = violao.clone();
    violaoFolk.setAcustica("Encorpado");
    violaoFolk.setCusto(1440);
    violaoFolk.setEstrutura("Acinturado");
    violaoFolk.setModelo("Elétrico");
    violaoFolk.setTipoCorda("Aço");

    // Violão flat
    ViolaoPrototype violaoFlat = violao.clone();
    violaoFlat.setAcustica("Suave");
    violaoFlat.setCusto(1550);
    violaoFlat.setEstrutura("Plano");
    violaoFlat.setModelo("Elétrico");
    violaoFlat.setNivel("Profissional");

    // Violão jumbo
    ViolaoPrototype violaoJumbo = violao.clone();
    violaoJumbo.setEstrutura("Largo");
    violaoJumbo.setModelo("Eletroacústico");
    violaoJumbo.setNivel("Profissional");
    violaoJumbo.setTipoCorda("Aço");

    // Violão sete cordas
    ViolaoPrototype violaoSeteCordas = violao.clone();
    violaoSeteCordas.setCordas(7);
    violaoSeteCordas.setNivel("Intermediário");

    // Violão doze cordas
    ViolaoPrototype violaoDozeCordas = violao.clone();
    violaoDozeCordas.setAcustica("Pleno");
    violaoDozeCordas.setCordas(12);
    violaoDozeCordas.setCusto(1800);
    violaoDozeCordas.setNivel("Profissional");

    // Violão zero
    ViolaoPrototype violaoZero = violao.clone();
    violaoZero.setCusto(900);
    violaoZero.setEstrutura("Pequena");
    violaoZero.setNivel("Casual");

    // Violão duplo zero
    ViolaoPrototype violaoDuploZero = violao.clone();
    violaoZero.setCusto(900);
    violaoDuploZero.setEstrutura("Reduzida");
    violaoDuploZero.setNivel("Casual");

    // Violão triplo zero
    ViolaoPrototype violaoTriploZero = violao.clone();
    violaoZero.setCusto(900);
    violaoTriploZero.setEstrutura("Intermediário");
    violaoTriploZero.setNivel("Casual");

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("-- Menu para seleção de violões --");
      System.out.println("1 - Violão Clássico");
      System.out.println("2 - Violão Folk");
      System.out.println("3 - Violão Flat");
      System.out.println("4 - Violão Jumbo");
      System.out.println("5 - Violão 7 Cordas");
      System.out.println("6 - Violão 12 Cordas");
      System.out.println("7 - Violão Zero");
      System.out.println("8 - Violão Duplo Zero");
      System.out.println("9 - Violão Triplo Zero");
      System.out.println("0 - Sair");

      int option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 1:
          System.out.println("-- Violão Clássico --");
          System.out.println(violaoClassico.toString());
          break;
        case 2:
          System.out.println("-- Violão Folk --");
          System.out.println(violaoFolk.toString());
          break;
        case 3:
          System.out.println("-- Violão Flet --");
          System.out.println(violaoFlat.toString());
          break;
        case 4:
          System.out.println("-- Violão Jumbo --");
          System.out.println(violaoJumbo.toString());
          break;
        case 5:
          System.out.println("-- Violão Sete Cordas --");
          System.out.println(violaoSeteCordas.toString());
          break;
        case 6:
          System.out.println("-- Violão Doze Cordas --");
          System.out.println(violaoDozeCordas.toString());
          break;
        case 7:
          System.out.println("-- Violão Zero --");
          System.out.println(violaoZero.toString());
          break;
        case 8:
          System.out.println("-- Violão Duplo Zero --");
          System.out.println(violaoDuploZero.toString());
          break;
        case 9:
          System.out.println("-- Violão Triplo Zero --");
          System.out.println(violaoTriploZero.toString());
          break;
        default:
          break;
      }

      System.out.println();

      continuar = option;
    } while (continuar != 0);

    scanner.close();
  }
}