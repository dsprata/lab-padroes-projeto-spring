package one.digitalinnovation.gof.model;
import one.digitalinnovation.gof.model.Despesa;
import one.digitalinnovation.gof.model.NivelAprovacao;


public class Main {
    public static void main(String[] args) {
        // Criando os handlers
        Handler gerente = new GerenteHandler();
        Handler diretor = new DiretorHandler();        
        

        // Exemplo de despesas
        Despesa despesa1 = new Despesa(800.0, "Compra de material de escritório", NivelAprovacao.GERENTE);
        Despesa despesa2 = new Despesa(3500.0, "Compra de novo equipamento", NivelAprovacao.DIRETOR);

        // Processar as despesas
        gerente.aprovar(despesa1);
        gerente.aprovar(despesa2);
    }
}