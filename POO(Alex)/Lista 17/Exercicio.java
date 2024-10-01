public class Exercicio{
    public static void main(String[] args){
        MaisDois a = new MaisDois();
        MaisTres b = new MaisTres();
        Resultado(a);
        Resultado(b);
    }

    public static void Resultado(Series s){
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());

        System.out.println();

        s.reset();

        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());

        System.out.println();

        s.setStart(100);
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());

        System.out.println();

        System.out.println(s);

        System.out.println();
    }
}