public class SistemaIGBE {
    public static void main(String[] args) throws Exception {
        
        //Listando todos os estados
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNome() + " - " + e.getSigla());
        }
        System.out.println();

        //Exibindo um estado específico
        EstadoBrasileiro eb = EstadoBrasileiro.MINAS_GERAIS;
        System.out.println(eb.getSigla());
        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println();
    }
}
