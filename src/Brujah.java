public class Brujah extends Clan {

    public String nome = "Brujah";

    public Brujah() {

    }

    @Override
    public void perdicao() {
        System.out.println("Temperamento Violento – o Sangue dos Brujah ferve com fúria malcontida, que explode sob a menor provocação.");
    }

    @Override
    public void compulsao() {
        System.out.println("Rebelião – O vampiro se posiciona contra qualquer um ou qualquer coisa que lhe pareça representar o status quo na situação, o que pode ser seu próprio líder, um ponto de vista expresso por uma bolsa em potencial ou somente a tarefa que ele supostamente deveria executar no momento.");
    }

    @Override
    public void descreverClan() {
        System.out.println("O Clã Erudito, Ralé, Punks, Hipsters, Prometeicos, Rebeldes, Reis Filósofos, Helenos");
        System.out.println("Os Brujah são um clã de radicais e encrenqueiros, Abraçando aqueles dispostos a colocar os outros nos lugares deles se isso for necessário. A maioria se vê como guerreiros por uma causa, e esses Rebeldes são guiados por suas paixões, força e dedicação aos seus ideais – sejam lá quais forem.");

    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Celeridade, Potência, Presença");
    }
}
