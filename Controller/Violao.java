package Controller;

public class Violao extends ViolaoPrototype {
  private String acustica;
  private int corda;
  private double custo;
  private String estrutura;
  private String modelo;
  private String nivel;
  private String tipoCorda;

  private Violao(Violao violao) {
    this.acustica = violao.acustica;
    this.corda = violao.corda;
    this.custo = violao.custo;
    this.estrutura = violao.estrutura;
    this.modelo = violao.modelo;
    this.nivel = violao.nivel;
    this.tipoCorda = violao.tipoCorda;
  }

  public Violao() {
    this.acustica = "Normal";
    this.corda = 6;
    this.custo = 1300;
    this.estrutura = "Clássica";
    this.modelo = "Acústico";
    this.nivel = "Iniciante";
    this.tipoCorda = "Nylon";
  }

  @Override
  public String getAcustica() {
    return this.acustica;
  }

  @Override
  public void setAcustica(String acustica) {
    this.acustica = acustica;
  }

  @Override
  public int getCorda() {
    return corda;
  }

  @Override
  public void setCorda(int corda) {
    this.corda = corda;
  }

  @Override
  public double getCusto() {
    return custo;
  }

  @Override
  public void setCusto(double custo) {
    this.custo = custo;
  }

  @Override
  public String getEstrutura() {
    return estrutura;
  }

  @Override
  public void setEstrutura(String estrutura) {
    this.estrutura = estrutura;
  }

  @Override
  public String getModelo() {
    return modelo;
  }

  @Override
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  @Override
  public String getNivel() {
    return nivel;
  }

  @Override
  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  @Override
  public String getTipoCorda() {
    return tipoCorda;
  }

  @Override
  public void setTipoCorda(String tipoCorda) {
    this.tipoCorda = tipoCorda;
  }

  public ViolaoPrototype clone() {
    return new Violao(this);
  }

  @Override
  public String toString() {
    return "\nModelo: " + this.modelo + "\nNº de cordas: " + this.corda + "\nTipo de corda: " + this.tipoCorda
        + "\nAcustica: " + this.acustica + "\nEstrutura: " + this.estrutura + "\nNível: " + this.nivel
        + "\nPreço: R$" + this.custo + "\n";
  }
}
