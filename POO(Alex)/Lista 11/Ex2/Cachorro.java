public class Cachorro extends Animal{
    public Cachorro(){
        System.out.println("E um cachorro");
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au Au");
    }
}