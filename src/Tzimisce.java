import clan.Clan;

public class Tzimisce extends Clan {

    String nome = "Tzimisce";

    @Override
    public void perdicao() {
        System.out.println("Perdição: Enraizados – todo Tzimisce deve escolher uma posse específica – um domínio físico, um grupo de pessoas, uma organização ou até mesmo algo mais esotérico – claramente definida e limitada. Os integrantes do clã devem passar seu dia de sono cercados pela posse escolhida.");

    }

    @Override
    public void compulsao(){
        System.out.println("Cobiça – o Tzimisce fica obcecado em possuir algo da cena, passando a desejar adicioná-lo à sua proverbial pilha de tesouro. O alvo do desejo pode ser qualquer coisa, de um objeto a uma pessoa.");
    }

    @Override
    public void descreverClan() {
        System.out.println("Dragões, O Velho Clã, Voivodes, Stokers");
        System.out.println("Para os Tzimisce, possuir é tudo. Eles buscam dominar e possuir o objeto de sua possessividade, vigiando-o com ciúmes comparável àquele com que os dragões que os apelidam guardam seus tesouros. Tudo, desde terras, pessoas, cultos, empresas ou gangues, pode cair nas garras cobiçosas de um Dragão. Sua incansável possessividade se estende aos seus próprios corpos, e eles costumeiramente se remoldam em formas perfeitas, horrendas ou alienígenas, tudo para melhor demonstrar seu absoluto controle sobre todas as coisas que possuem.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Animalismo, Dominação, Proteanismo");

    }
}
