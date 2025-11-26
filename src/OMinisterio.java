import clan.Clan;

public class OMinisterio extends Clan {

    String nome = "O Ministério";

    @Override
    public void perdicao() {
        System.out.println("Abomina a Luz – quando expostos à iluminação direta – seja natural ou artificial – os membros do clã recuam.");

    }

    @Override
    public void compulsao(){
        System.out.println("Transgressão – Set ensina que a mente e o espírito de todos estão ligados por correntes invisíveis feitas por eles mesmos. Conforme o Sangue deles agita tais amarras, o Ministério sofre com uma necessidade irresistível de rompê-las.");
    }

    @Override
    public void descreverClan() {
        System.out.println("O Clã da Fé, Setitas, Seguidores de Set, O Clã das Mentiras, Tifonistas, Serpentes, Liberadores, Judasianos");
        System.out.println("O Ministério sempre tem algo a oferecer. Este clã, semelhante a um culto, recruta aqueles capazes de empregar a tentação como arma. Eles Abraçam aqueles com a vontade e os meios de convencer, envolver e, finalmente, libertar seus alvos do que quer que eles procurem: as posses da vítima, suas alianças ou até mesmo sua fé. Para as Serpentes, tudo tem um preço.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Ofuscação, Presença, Proteanismo");

    }
}
