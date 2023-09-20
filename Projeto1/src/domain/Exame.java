package domain;

import java.util.List;

public class Exame {

    private String nomeExa;
    private String resultado;

    private List<Consulta> consultas;

    public Exame(String nomeExa, String resultado) {
        this.nomeExa = nomeExa;
        this.resultado = resultado;
    }

    public String getNomeExa() {
        return nomeExa;
    }

    public void setNomeExa(String nomeExa) {
        this.nomeExa = nomeExa;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Exame [nome=" + nomeExa + ", resultado=" + resultado + ", consultas=" + consultas + "]";
    }

    


}
