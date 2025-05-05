class Conto {
    private float deposito;
    private float tasso;

    // Costruttore
    public Conto() {
        deposito = 0;
        tasso = 0;
    }

    // Imposta un valore al deposito
    public void setDeposito(float d) {
        deposito = d;
    }

    // Assegna un valore al tasso
    public void setTasso(float t) {
        tasso = t;
    }

    // Valore del deposito
    public float getDeposito() {
        return deposito;
    }

    // Restituisce valore del tasso
    public float getTasso() {
        return tasso;
    }

    // Versamento
    public void versamento(float importo) {
        deposito += importo;
    }

    // Prelievo
    public boolean prelievo(float importo) {
        if (importo <= deposito) {
            deposito -= importo;
            return true;
        } else {
            return false;
        }
    }

    // Aggiorna deposito
    public void aggiorna() {
        deposito += deposito * (tasso / 100);
    }
}
