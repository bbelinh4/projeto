package domain;

import java.util.List;

public class Animal {
    
    private String nomeAnimal;
    private String sexo;
    private String idade;

    private Especie especie;
    private Cliente cliente;

    List<Tratamento> tratamentos;

    public Animal(String nomeAnimal, String sexo, String idade, Especie especie, Cliente cliente) {
        this.nomeAnimal = nomeAnimal;
        this.sexo = sexo;
        this.idade = idade;
        this.especie = especie;
        this.cliente = cliente;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nomeAnimal + ", sexo=" + sexo + ", idade=" + idade + ", especie=" + especie + ", cliente="
                + cliente + ", tratamentos=" + tratamentos + "]";
    }

    

}
