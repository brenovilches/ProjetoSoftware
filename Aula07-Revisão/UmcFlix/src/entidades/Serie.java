package entidades;

public class Serie extends Catalogo {

    private String Temporadas;
    private String Episodios;

    // Construtor da classe Serie
    public Serie(String nomeFilme, String protagonista, Genero genero, String diretor, int classificacao, String temporadas, String episodios) {
        super(nomeFilme, protagonista, genero, diretor, classificacao);
        this.Temporadas = temporadas;
        this.Episodios = episodios;
    }

    // Getters e setters
    public String getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.Temporadas = temporadas;
    }

    public String getEpisodios() {
        return Episodios;
    }

    public void setEpisodios(String episodios) {
        this.Episodios = episodios;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemporadas: " + Temporadas + "\nEpisódios: " + Episodios;
    }
}
