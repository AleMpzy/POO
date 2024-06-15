public class Shapes{
    public static void main(String[] args){
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.estilo = "cheio";

        t2.setLargura(8.0);
        t2.setAltura (12.0);
        t2.estilo = "contorno";

        r1.setLargura(4.0);
        r1.setAltura(4.0);

        r2.setLargura(8.0);
        r2.setAltura(12.0);

        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());

        System.out.println();
        
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());

        System.out.println();

        System.out.println("Info para r1: ");
        r1.mostraDim();
        System.out.println("Area = " + r1.area());
        System.out.println("E quadrado: " + r1.verificarQuadrado());

        System.out.println();

        System.out.println("Info para r2: ");
        r2.mostraDim();
        System.out.println("Area = " + r2.area());
        System.out.println("E quadrado: " + r2.verificarQuadrado());
    }
}

/* a) Ao executar o codigo aparece -> error: estilo has private access in Triangulo
    A mudança foi feita na classe -> public class Triangulo extends TwoDShape
    E alterei private String estilo; 
    para -> protected String estilo;
    com isso as outras classes conseguem acessar o atributo estilo, e assim o codigo roda
*/

/* c) Ao trocar para private a altura e largura e executar o codigo aparece -> error: altura/largura has private access in TwoDShape
    Isso ocorre pois quando tornamos esses atributos privados so a propia classe consegue acessa-los
*/