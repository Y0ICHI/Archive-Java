public class Autostrada {
    private static double PrezzoClasseA = 0.07231, PrezzoClasseB = 0.07401, PrezzoClasse3 = 0.09862, PrezzoClasse4 = 0.14864, PrezzoClasse5 = 0.17530;
    private static double PrezzoClasseAF = 0.08500, PrezzoClasseBF = 0.08700, PrezzoClasse3F = 0.11500, PrezzoClasse4F = 0.17500, PrezzoClasse5F = 0.21000;

    public Autostrada() {
    }

    public double Pedaggio(int veicolo, boolean festivo, int km) {
        double costoPedaggio = 0;

        switch (veicolo) {
            case 1:
                if(festivo){
                    costoPedaggio = km * PrezzoClasseAF;
                } else {
                    costoPedaggio = km * PrezzoClasseA;
                };
                break;
            case 2:
                if(festivo){
                    costoPedaggio = km * PrezzoClasseBF;
                } else {
                    costoPedaggio = km * PrezzoClasseB;
                };
            case 3:
                if(festivo){
                    costoPedaggio = km * PrezzoClasse3F;
                } else {
                    costoPedaggio = km * PrezzoClasse3;
                };
            case 4:
                if(festivo){
                    costoPedaggio = km * PrezzoClasse4F;
                } else {
                    costoPedaggio = km * PrezzoClasse4;
                };
            case 5:
                if(festivo){
                    costoPedaggio = km * PrezzoClasse5F;
                } else {
                    costoPedaggio = km * PrezzoClasse5;
                };
            default:
                System.out.println("Categoria veicolo non valida.");
                return 0;
        }

        return costoPedaggio;
    }
}
