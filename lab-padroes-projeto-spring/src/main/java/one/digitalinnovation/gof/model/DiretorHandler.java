package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.Despesa;
import one.digitalinnovation.gof.model.NivelAprovacao;

public class DiretorHandler extends AbstractHandler {
    private static final double LIMITE_APROVACAO = 5000.0;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getNivelAprovacao() == NivelAprovacao.DIRETOR && despesa.getValor() <= LIMITE_APROVACAO) {
            System.out.println("Despesa aprovada pelo Diretor: " + despesa.getDescricao());
        } else if (proximo != null) {
            proximo.aprovar(despesa);
        } else {
            System.out.println("Nenhum nível de aprovação disponível para " + despesa.getDescricao());
        }
    }
}
