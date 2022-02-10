import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestidorTest {

    @Test
    void deveCalcularRetornoInvestimentoComFormula() {
        Investidor investidor = new Investidor();
        investidor.setValorAtivo1(500.0);
        investidor.setValorAtivo2(1200.0);

        assertEquals(124.5, investidor.calcularRetornoInvestimento());
    }
}