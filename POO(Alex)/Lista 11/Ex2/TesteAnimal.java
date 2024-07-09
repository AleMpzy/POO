public class TesteAnimal{
    public static void main(String[] args){
        Animal animal1;
        Animal animal2;
        Animal animal3;

        animal1 = new Cachorro();
        animal1.emitirSom();

        animal2 = new Gato();
        animal2.emitirSom();
        
        animal3 = new Preguica();
        animal3.emitirSom();
    }
}