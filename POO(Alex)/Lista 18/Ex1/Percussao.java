public class Percussao implements Instrumento{
    @Override
    public void tocar(){
        System.out.println("Tocando instrumento de percussao...");
    }

    @Override
    public void nome(){
        System.out.println("Percussao");
    }

    @Override
    public void afinar(){
        System.out.println("Afinando instrumento de percussao...");
    }
}