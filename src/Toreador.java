import clan.Clan;

public class Toreador extends Clan {

    String nome = "Toreador";

    @Override
    public void perdicao() {
        System.out.println("Fixação Estética – Os Toreador exemplificam o velho ditado segundo o qual a arte no sangue assume formas estranhas. Eles desejam tão intensamente a beleza que acabam sofrendo em sua ausência.");

    }

    @Override
    public void compulsao(){
        System.out.println("Obsessão – extasiado pela beleza, o vampiro torna-se temporariamente obcecado com algo singularmente belo, ficando incapaz de pensar em qualquer outra coisa.");
    }

    @Override
    public void descreverClan() {
        System.out.println("Divas, O Clã da Rosa, Degenerados, Artistas, Rameiras, Arikelitas, Hedonistas, Sensíveis, Pervertidos");
        System.out.println("Conhecidos por sua natureza sedutora, comportamento envolvente e graça eloquente ao ponto da obsessão, vampiros Toreador Abraçam artistas e amantes para suas fileiras, eternamente tentando mexer com seus próprios corações mortos. Sobrenaturalmente ágeis e charmosas, as Divas estão sempre à procura da próxima emoção, deixando um rastro de amantes e vítimas descartadas em seu caminho.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Auspícios, Celeridade, Presença");

    }
}
