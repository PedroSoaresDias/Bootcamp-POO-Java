package Models;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double CalcularXp() {
        return XP_PADRAO + 20;
    }
    
    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [ titulo= " + getTitulo() + ", descrição = " + getDescricao() + ", data = " + data + "]";
    }
}