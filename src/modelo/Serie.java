package modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episiodiosPorTemporada;
    private int duraionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duraionEnMinutosPorEpisodio * episiodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisiodiosPorTemporada() {
        return episiodiosPorTemporada;
    }

    public void setEpisiodiosPorTemporada(int episiodiosPorTemporada) {
        this.episiodiosPorTemporada = episiodiosPorTemporada;
    }

    public int getDuraionEnMinutosPorEpisodio() {
        return duraionEnMinutosPorEpisodio;
    }

    public void setDuraionEnMinutosPorEpisodio(int duraionEnMinutosPorEpisodio) {
        this.duraionEnMinutosPorEpisodio = duraionEnMinutosPorEpisodio;
    }
}
