package entidades;
public class Pagamento {
    private String nomeCliente;
    private double valorPagamento;
    private String dataPagamento;

    //Construtores

    public Pagamento(String nomeCliente, double valor, String dataPagamento) {
        this.nomeCliente = nomeCliente;
        this.valorPagamento = valor;
        this.dataPagamento = dataPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setValor(double valor) {
        this.valorPagamento = valor;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    @Override
    public String toString() {
        return "Pagamento{" +
                "| NomeCliente: '" + nomeCliente +
                "| Valor do Pagamento: " + valorPagamento +
                "| Data Pagamento: " + dataPagamento;
    }
}