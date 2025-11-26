import clan.Clan;

public class Ravnos extends Clan {

    String nome = "Ravnos";

    @Override
    public void perdicao() {
        System.out.println("O fogo solar que incinerou seu fundador arde no Sangue do clã, irrompendo da sua carne caso se estabeleçam por muito tempo.");

    }

    @Override
    public void compulsao(){
        System.out.println("Destino Tentador – o vampiro é levado por seu Sangue a cortejar o perigo. Colocando a si mesmos e aos outros em risco, eles flertarão com a destruição em prol da audácia e do estilo.");
    }

    @Override
    public void descreverClan() {
        System.out.println("Trapaceiros, Corvos, Audazes, Os Assombrados");
        System.out.println("Mestres do subterfúgio, os Ravnos preferem não lutar ou sangrar por algo que podem obter por meios mais sutis. Eles podem encantar e desaparecer com o mesmo suspiro mortal, e aqueles uma vez enganados rapidamente aprendem a duvidar dos próprios sentidos quando em companhia dos Corvos. Sempre em movimento, os Ravnos nunca descansam no mesmo lugar, pois sua maldição os inflama durante o sono, caso o façam.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Animalismo, Ofuscação, Presença");

    }
}
