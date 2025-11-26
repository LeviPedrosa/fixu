import clan.Clan;

public class Nosferatu extends Clan {

    String nome = "Nosferatu";

    @Override
    public void perdicao() {
        System.out.println("Repulsivos – hediondos e vis, todos os Nosferatu são fisicamente deformados de alguma forma pelo Abraço. Alguns ainda conseguem se passar por mortais, enquanto outros são quebras da Máscara ambulantes.");

    }

    @Override
    public void compulsao(){
        System.out.println("Criptofilia - A necessidade de saber invade o vampiro. Ele é consumido por uma fome de segredos – de saber o que poucos ou ninguém mais sabe – quase tão forte quanto sua sede de sangue. Ele também se recusa a dividir segredos, exceto em estrita troca por segredos ainda maiores.");
    }

    @Override
    public void descreverClan() {
        System.out.println("Horrores, O Clã dos Ocultos, Ratos de Esgoto, Leprosos, Purulentos, Histriões, Crostas, Kapos, Mendigos, Orloks");
        System.out.println("Os Nosferatu carregam sua maldição em seu exterior. Com seus corpos horrivelmente distorcidos e deformados pelo Abraço, eles espreitam pelos cantos da maioria das cidades, agindo como espiões e negociantes de informação. Usando animais e sua própria capacidade sobrenatural de se ocultarem, nada escapa aos olhos dos assim chamados “Ratos de Esgoto”.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Animalismo, Ofuscação, Potência");

    }
}
