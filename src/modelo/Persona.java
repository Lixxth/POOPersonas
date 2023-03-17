package modelo;

public class Persona {

    private String curp;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String celular;
    private char sexo;
    private int d;
    private int m;
    private int a;
    private Fecha fechaNacimiento;

    public Persona(String curp, String nombre, String apellidoPaterno, String apellidoMaterno, String celular, char sexo, int d, int m, int a) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.celular = celular;
        this.sexo = sexo;
        this.fechaNacimiento = new Fecha(d, m, a);
    }

    public Persona(String curp, String nombre, String apellidoPaterno, String apellidoMaterno, String celular, char sexo, Fecha fechaNacimiento) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.celular = celular;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getCelular() {
        return celular;
    }

    public char getSexo() {
        return sexo;
    }

    public Fecha getFecha() {
        return fechaNacimiento;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setD(int d) {
        fechaNacimiento.setDia(d);
    }
    
    public void setM (int m) {
        fechaNacimiento.setMes(m);
    }
    
    public void setA (int a) {
        fechaNacimiento.setAnio(a);
    }

    public boolean equals(Persona persona) {
        if (persona.getCurp().equals(this.curp)) {
            return true;
        } else {
            return false;
        }
    }
}
