public class SoproMadeira extends Sopro{
    @Override
    public void tocar(){
        System.out.println("Tocando instrumento sopro de madeira...");
    }

    @Override
    public void nome(){
        System.out.println("Sopro de madeira");
    }

    @Override
    public void afinar(){
        System.out.println("Afinando instrumento sopro de madeira...");
    }
}