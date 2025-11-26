import clan.Clan;

public class Tremere extends Clan {

    String nome = "Tremere";

    @Override
    public void perdicao() {
        System.out.println("Sangue Deficiente – O Vitae Tremere não tem mais a capacidade de criar Laços de Sangue com outros Membros, embora os próprios Tremere possam ser Enlaçados por Membros de outros clãs.");

    }

    @Override
    public void compulsao(){
        System.out.println("Perfeccionismo – Nada a não ser o melhor satisfaz o vampiro. Qualquer outra coisa, exceto uma performance excepcional, provoca uma profunda sensação de falha, por isso ele repete tarefas obsessivamente até que estejam “na medida”.");
    }

    @Override
    public void descreverClan() {
        System.out.println("Usurpadores, Bruxos, Herméticos, Taumaturgos, Transgressores, O Clã Quebrado, Feiticeiros de Sangue");
        System.out.println("O arcano Clã Tremere foi uma casa de magos mortais que buscava a imortalidade, mas que encontrou apenas a não vida. Como vampiros, eles aperfeiçoaram as formas de dobrar o Sangue à suas vontades, empregando sua mágica para dominar e enfeitiçar tanto o mundo mortal quanto o vampírico. Seus poderes os tornam valiosos, mas poucos vampiros confiam em seus modos manipuladores.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Auspícios, Feitiçaria de Sangue, Dominação");

    }
}
