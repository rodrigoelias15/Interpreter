public class CorretoraFinanceira {
    public static String formula = "valorAtivo1 * 0.09 + valorAtivo2 * 0.1";

    public static double calcularRetornoInvestimento(double valorAtivo1, double valorAtivo2) {
        String expressao;
        expressao = formula.replace("valorAtivo1", Double.toString(valorAtivo1));
        expressao = expressao.replace("valorAtivo2", Double.toString(valorAtivo2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
