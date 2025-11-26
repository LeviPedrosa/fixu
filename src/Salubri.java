import clan.Clan;

public class Salubri extends Clan {
    String nome = "Salubri";

    @Override
    public void perdicao() {
        System.out.println("Caçados – Membros de outros clãs são particularmente... apaixonados pelo Vitae Salubri. Quando um vampiro não pertencente ao Clã Salubri consome o sangue de um Ciclope, geralmente acha difícil parar de sugar.");

    }

    @Override
    public void compulsao(){
        System.out.println("Empatia Afetiva – o Membro é tomado de empatia por um problema pessoal que aflige alguém na cena e procura ajudar na sua resolução.");
    }

    @Override
    public void descreverClan() {
        System.out.println("Ciclopes, Ladrões de Almas, Dajjals, Progênie de Saulot");
        System.out.println("Com a maior parte dos seus perdida para usurpadores não vivos, o Sangue altamente desejado dos caçados Salubri é um prêmio para outros vampiros. Isso, e sua relutância em Abraçar, os torna raros nas noites modernas. Eles frequentemente recrutam aqueles à beira da morte, acreditando que sua maldição pode dar aos merecedores uma segunda chance, e contam com alguns dos vampiros mais “humanos” em suas fileiras.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Auspícios, Dominação, Fortitude");

    }
}
