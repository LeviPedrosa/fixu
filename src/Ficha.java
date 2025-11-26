public class Ficha {


    String nome;
    int geracao;
    String cronica;
    String senhor;
    String conceito;
    String ambicao;
    String desejo;
    Clan clan;
    // Predador predador;

        // Fisico
    int forca;
    int destreza;
    int vigor;

        // Sociais
    int carisma;
    int manipulacao;
    int autoControle;

        // Mentais
    int inteligencia;
    int racionio;
    int determinacao;

    int fome;


    public Ficha(String nome, int  geracao, String cronica, String senhor, String conceito, String ambicao, String desejo, Clan clan) {
        this.clan =  clan;
        this.nome = nome;
        this.geracao = geracao;
        this.cronica = cronica;
        this.senhor = senhor;
        this.conceito = conceito;
        this.ambicao = ambicao;
        this.desejo = desejo;
    }

public void displinaIncicial(){

}

    public void aumentarFome() {
        fome++;
    }
    public void diminuirFome() {
        fome--;
    }
public void setFome(int FomeAtual){
        fome = FomeAtual;
}

    public int getFome(){
        return fome;
}

}
