package entidades;

public class PagamentoPix extends Pagamento {
    //Atributo específico do pix
    private String chavePix;

    public PagamentoPix(String nomeCliente, Double valorPagamento, String dataPagamento, String chavePix) {
        super(nomeCliente, valorPagamento, dataPagamento);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String toString() {
        return  "| NomeCliente: " + getNomeCliente() +
                "| Valor do Pagamento: " + getValorPagamento() +
                "| Data Pagamento: " + getDataPagamento() +
                "| Chave Pix: " + chavePix;
    }
}
