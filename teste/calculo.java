package teste;

import java.util.Scanner;

public class calculo {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o Saldo Inicial: ");
    double saldo = sc.nextDouble();
    System.out.println("Digite a Quantidade de Meses: ");
    int meses = sc.nextInt();
    System.out.println("Digite o Juros por Mês: ");
    double juros = sc.nextDouble();
    System.out.println("Digite o Valor de Aporte Mensal: ");
    double aporte = sc.nextDouble();


    Juros renda = new Juros(juros, meses, saldo, aporte);

    renda.rendimento(renda);
  }
  
  
}
class Juros{

  private Double porcentagemMes;
  private Integer meses;
  private Double aporteMensal;
  private Double saldoInicial;

  public Juros(Double porcentagemMes, Integer meses, Double saldoInicial,Double aporteMensal){
    this.meses = meses;
    this.porcentagemMes = porcentagemMes;
    this.saldoInicial = saldoInicial;
    this.aporteMensal = aporteMensal;
  }

  public Juros(){
  }

  public Double getPorcentagemMes() {
    return porcentagemMes;
  }

  public void setPorcentagemMes(Double porcentagemMes) {
    this.porcentagemMes = porcentagemMes;
  }

  public Integer getMeses() {
    return meses;
  }

  public void setMeses(Integer meses) {
    this.meses = meses;
  }

  public Double getSaldoInicial() {
    return saldoInicial;
  }

  public void setSaldoInicial(Double saldoInicial) {
    this.saldoInicial = saldoInicial;
  }

  public void rendimento(Juros juros){

    Double jurosMes = juros.getPorcentagemMes();
    Integer qtdMeses = juros.getMeses();
    Double saldo = juros.getSaldoInicial();
    Double aporteMensal = juros.aporteMensal;
    var x = 100;

    if(qtdMeses > 0){
      for(int i=0; i<qtdMeses; i++){
        Double resultado = (saldo * jurosMes)/x;
        saldo += resultado;
        if(i>0){
          saldo += aporteMensal;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf(" Mês: %d \n Taxa de Juros: %.2f \n Rendimento: %.2f \n Saldo Atual: %.2f \n", i+1, jurosMes, resultado, saldo);

      }
      
    }
  }



}