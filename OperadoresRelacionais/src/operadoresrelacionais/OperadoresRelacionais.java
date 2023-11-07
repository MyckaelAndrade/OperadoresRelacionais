package operadoresrelacionais;
public class OperadoresRelacionais {
    public static void main(String[] args) 
    {
        //Operadores Relacionais
        //Utilizando números inteiros:
        int n1 = 3, n2 = 4;
        int rMenor = n1 < n2?n1:n2;
        int rMaior = n1 > n2?n1:n2;
        int rMenorIgual = n1 <= n2?n1:n2;
        int rMaiorIgual = n1 >= n2?n1:n2;
        int rDif = n1 != n2?n1:n2;
        int rIgual = n1 == n2?n1:n2;
        System.out.println("Operadores Relacionais usando Int: ");
        System.out.println("(3 e 4): \n");
        System.out.println("Menor(<): " + rMenor);
        System.out.println("Maior(>): " + rMaior);
        System.out.println("Menor ou igual(<=): " + rMenorIgual);
        System.out.println("Maior ou igual(>=): " + rMaiorIgual);
        System.out.println("Diferente(!=): " + rDif);
        System.out.println("Conteudo igual(=): " + rIgual);  // Utiliza-se o equals
        System.out.println("\n=========================\n");
        
        //Utilizando String:
        System.out.println("Operadores Relacionais usando String: \n");
        String p1 = "Myckael";
        String p2 = new String("Myckael");
        String pIgual;
        pIgual = p1.equals(p2)?"Iguais":"Diferentes";
        System.out.println("As palavras são: " + pIgual);
        System.out.println("\n==========================\n");
    }
    
}
