public class Rolagem {

    Ficha ficha;

    public Rolagem(Ficha ficha) {
        this.ficha = ficha;
    }

    public void rolar(int atributo,int habilidade,int extras) {
        int dadosTotais = atributo + habilidade + extras;
        int dadosDeFome = ficha.getFome();
        int dadosNormal;
        int criticosNomal = 0;
        int criticosFome = 0;
        int falhasFome = 0;
        int sucessos = 0;


        if (dadosTotais > dadosDeFome && dadosDeFome > 0) {
            dadosNormal = dadosTotais - dadosDeFome;
            int[] resultadosNomal = new int[dadosNormal];
            int[] resultadosFome = new int[dadosDeFome];
            for (int i = 0; i < dadosNormal; i++) {
                int random = (int)(Math.random() * 10 + 1);
                resultadosNomal[i] = random;
                if (random == 10) {
                    criticosNomal++;
                }
                if (random > 5) {
                    sucessos++;
                }
            }
            for (int i = 0; i < dadosDeFome; i++) {
                int random = (int)(Math.random()* 10 + 1);
                resultadosFome[i] = random;

                if( random == 1){
                    falhasFome++;
                } else if( random == 10){
                    criticosFome++;
                }
                if (random > 5) {
                    sucessos++;
                }
            }
            int criticosTotais = criticosNomal + criticosFome;
            int sucessosCriticos = (int)Math.floor(criticosTotais / 2);
            sucessos = sucessos + (sucessosCriticos * 2);

            System.out.println("Resultados Dos Dados Normais: ");
            for (int i = 0; i < resultadosNomal.length; i++) {
                System.out.println(resultadosNomal[i]);
            }

            System.out.println("Resultados Dos Dados De Fome: ");
            for (int i = 0; i < resultadosFome.length; i++) {
                System.out.println(resultadosFome[i]);
            }

            System.out.println("Sucessos Totais: " + sucessos);
            System.out.println("Criticos De Normais: " + criticosNomal);
            System.out.println("Criticos De Fome: " + criticosFome);
            System.out.println("Falhas Criticos De Fome: " + falhasFome);


        } else if (dadosDeFome > 0){
            dadosDeFome = dadosTotais;
            int[] resultadosFome = new int[dadosDeFome];
            for (int i = 0; i < dadosDeFome; i++) {
                int random = (int)(Math.random()* 10 + 1);
                resultadosFome[i] = random;

                if( random == 1){
                    falhasFome++;
                } else if( random == 10){
                    criticosFome++;
                }
                if (random > 5) {
                    sucessos++;
                }
            }
            int criticosTotais = criticosNomal + criticosFome;
            int sucessosCriticos = (int)Math.floor(criticosTotais / 2);
            sucessos = sucessos + (sucessosCriticos * 2);

            System.out.println("Resultados Dos Dados De Fome: ");
            for (int i = 0; i < resultadosFome.length; i++) {
                System.out.println(resultadosFome[i]);
            }

            System.out.println("Sucessos Totais: " + sucessos);
            System.out.println("Criticos De Fome: " + criticosFome);
            System.out.println("Falhas Criticos De Fome: " + falhasFome);
        } else{
            dadosNormal = dadosTotais;
            int[] resultadosNormais = new int[dadosNormal];
            for (int i = 0; i < dadosNormal; i++) {
                int random = (int)(Math.random()* 10 + 1);
                resultadosNormais[i] = random;

                if( random == 10){
                    criticosNomal++;
                }
                if (random > 5) {
                    sucessos++;
                }
            }
            int criticosTotais = criticosNomal;
            int sucessosCriticos = (int)Math.floor(criticosTotais / 2);
            sucessos = sucessos + (sucessosCriticos * 2);

            System.out.println("Resultados Dos Dados: ");
            for (int i = 0; i < resultadosNormais.length; i++) {
                System.out.println(resultadosNormais[i]);
            }

            System.out.println("Sucessos Totais: " + sucessos);
            System.out.println("Criticos De Normais: " + criticosNomal);

        }
        }
    }

