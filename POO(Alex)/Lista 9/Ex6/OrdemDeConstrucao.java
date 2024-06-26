public class OrdemDeConstrucao{
    public static void main(String[] args){
        C c = new C();
    }
}

/* 
Construçao de A.
Construçao de B.
Construçao de C.

No main so é declarado o C. Porem ele é uma subclasse de B, que é uma subclasse de A.
Entao ele puxa todos os metodos de A e B que sejam publicos. Por isso ele imprime Construçao de A, B e C.

*/