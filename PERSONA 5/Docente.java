public class Docente extends Persona {
    private String Materia;
    private float Salario;

    public Docente()
    {
        super();
        Materia = "...";
        Salario = -1;
    }


    public void InserisciMateria(String materia) {
        this.Materia = materia;
        return;
    }
    
    public void InserisciSalario(float salario) {
        this.Salario = salario;
        return;
    }
    
    public String OttieniMateria() {
        return Materia;
    }
    
    public float OttieniSalario() {
        return Salario;
    }
}
