import clan.Clan;

public class Ventrue extends Clan {

    String nome = "Ventrue";

    @Override
    public void perdicao() {
        System.out.println("Paladar Refinado – quando um Ventrue bebe sangue de qualquer mortal que não seja da sua preferência, ele precisa fazer um grande esforço de vontade para que o sangue não volte na forma de vômito escarlate.");

    }

    @Override
    public void compulsao(){
        System.out.println("A necessidade que o vampiro tem de governar aflora. Nada pode impedi-lo de assumir o controle de uma situação.");
    }

    @Override
    public void descreverClan() {
        System.out.println("O Clã dos Reis, Sangues-Azuis, Tiranos, Senhores da Guerra, Patrícios, Bórgias, o Culto de Mithras");
        System.out.println("Os Ventrue não são chamados de Clã dos Reis por nada. Cuidadosamente escolhendo sua progênie de que tenham familiaridade com o poder, a riqueza e a influência, os Ventrue se apresentam como aristocratas do mundo vampírico. É esperado que seus membros assumam o comando sempre que possível, e eles estão dispostos a enfrentar tempestades pela oportunidade de liderar a partir do front.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Dominação, Fortitude, Presença");

    }
}
