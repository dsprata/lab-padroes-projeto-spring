package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.Despesa;
import one.digitalinnovation.gof.model.NivelAprovacao;

public class GerenteHandler extends AbstractHandler {
    private static final double LIMITE_APROVACAO = 1000.0;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getNivelAprovacao() == NivelAprovacao.GERENTE && despesa.getValor() <= LIMITE_APROVACAO) {
            System.out.println("Despesa aprovada pelo Gerente: " + despesa.getDescricao());
        } else if (proximo != null) {
            proximo.aprovar(despesa);
        } else {
            System.out.println("Nenhum nível de aprovação disponível para " + despesa.getDescricao());
        }
    }
}
