import clan.Clan;

public class Malkavianos extends Clan {

    String nome = "Malkavianos";

    @Override
    public void perdicao() {
        System.out.println("Perspectiva Fraturada – todos os Malkavianos são amaldiçoados com pelo menos um tipo de transtorno mental. Dependendo da sua história e do estado da sua mente ao morrer, eles podem experimentar delírios, visões de clareza terrível ou algo totalmente diferente.");

    }

    @Override
    public void compulsao(){
        System.out.println("Delírio – Com seus dons extrassensoriais enlouquecidos, o vampiro experimenta o que podem ser verdades ou presságios, mas que os outros chamam de delírios trazidos à tona pela Fome.");
    }

    @Override
    public void descreverClan() {
        System.out.println("O Clã da Lua, Lunáticos, Malucos, Bufões, Oráculos, Dervixes, Visionários, Filhos de Malkav");
        System.out.println("Ridicularizados como Lunáticos pelos outros vampiros, o Sangue dos Malkavianos permite que eles percebam e prevejam verdades escondidas dos outros. Como os “sábios loucos” da poesia, suas perspectivas fraturadas vêm de enxergarem muito do mundo ao mesmo tempo, de entender profundamente demais e de sentir emoções que são simplesmente muito fortes para aguentar.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Auspícios, Dominação, Ofuscação");

    }

}
