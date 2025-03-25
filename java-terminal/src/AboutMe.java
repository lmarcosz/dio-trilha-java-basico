public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobremone = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.print("Olá, me chamo " + nome + " " + sobremone);
        System.out.print(", tenho " + idade + " anos de idade ");
        System.out.println("e minha altura é " + altura + "m.");
    }
}
