package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.Despesa;

public abstract class AbstractHandler implements Handler {
    protected Handler proximo;

    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }
}
