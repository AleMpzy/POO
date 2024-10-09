public class TestaInstrumento{
    public static void main(String[] args){
        Instrumento[] instrumento = new Instrumento[5];

        instrumento[0] = new Sopro();
        instrumento[1] = new Percussao();
        instrumento[2] = new Corda();
        instrumento[3] = new SoproMetal();
        instrumento[4] = new SoproMadeira();

        sinfonia(instrumento);
    }

    public static void sinfonia(Instrumento[] instrumento){
        for(Instrumento i : instrumento){
            i.nome();
            i.afinar();
            i.tocar();
        }
    }
}