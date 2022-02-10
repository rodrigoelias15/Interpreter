public class Investidor {
    private double valorAtivo1;
    private double valorAtivo2;

    public double getValorAtivo1() {
        return valorAtivo1;
    }

    public void setValorAtivo1(double valorAtivo1) {
        this.valorAtivo1 = valorAtivo1;
    }

    public double getValorAtivo2() {
        return valorAtivo2;
    }

    public void setValorAtivo2(double valorAtivo2) {
        this.valorAtivo2 = valorAtivo2;
    }

    public double calcularRetornoInvestimento() {
        return CorretoraFinanceira.calcularRetornoInvestimento(this.valorAtivo1, this.valorAtivo2);
    }


}
