package domain;

import java.util.List;

public class Veterinario {

    private String nomeVet;
    private String especialidade;

    private List<Consulta> consultas;

    public Veterinario(String nomeVet, String especialidade) {
        this.nomeVet = nomeVet;
        this.especialidade = especialidade;
    }

    public String getNomeVet() {
        return nomeVet;
    }

    public void setNomeVet(String nomeVet) {
        this.nomeVet = nomeVet;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Veterinario [nome=" + nomeVet + ", especialidade=" + especialidade + ", consultas=" + consultas + "]";
    }

    

}
