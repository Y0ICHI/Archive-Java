class Gestore {
    private final double COSTO_AUTO = 2.0;
    private final double COSTO_MOTO = 1.5;
    private final double COSTO_COPERTO = 0.2; // 20%
    private double cassa = 0;

    public double calcolaCosto(boolean coperto, String tipoVeicolo, float ore) {
        double costoBase = tipoVeicolo.equals("Automobile") ? COSTO_AUTO * ore : COSTO_MOTO * ore;
        return coperto ? costoBase * (1 + COSTO_COPERTO) : costoBase;
    }

    public void aggiornaCassa(double importo) {
        cassa += importo;
    }

    public boolean controlloTuttiOccupati(SlotParcheggio[] parcheggio) {
        for (SlotParcheggio posto : parcheggio) {
            if (!posto.getOccupato()) return false;
        }
        return true;
    }

    public boolean controlloTuttiLiberi(SlotParcheggio[] parcheggio) {
        for (SlotParcheggio posto : parcheggio) {
            if (posto.getOccupato()) return false;
        }
        return true;
    }

    public double getCassa() {
        return cassa;
    }
}