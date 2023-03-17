package modelo;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }
    public Fecha(int d, int m, int a) {
        if (d > 0 && d < 31) {
            this.dia = d;
        } else {
            this.dia = 1;
        }

        if (m > 0 || m < 12) {
            this.mes = m;
        } else {
            this.mes = 1;
        }

        if (a > 0) {
            this.anio = a;
        } else {
            this.anio = 2000;
        }

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) {
                dia = 1;
            }

        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) {
                dia = 1;
            }

        }
        if (m == 2) {
            if (this.anio % 4 == 0) {
                if (d > 28) {
                    dia = 1;
                }
            } else {
                if (d > 27) {
                    dia = 1;
                }
            }
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int d) {
        if (d > 0 || d < limit()) {
            this.dia = d;
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int m) {
        if (m > 0 || m < 13) {
            this.mes = m;
        }
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int a) {
        if (a < -1) {
            this.anio = a;
        }
    }

    public boolean bisiesto() {
        boolean x;
        if (this.anio % 4 == 0) {
            x = true;
        } else {
            x = false;
        }
        return x;
    }

    public void restarSumarDias(int d) {
        this.dia = this.dia + d;

        while (this.dia > limit()) {
            this.dia = this.dia - limit();
            this.mes++;
            if (this.mes > 12) {
                this.mes = this.mes - 12;
                this.anio++;
            }
        }

        while (this.dia < 1) {
            this.dia = this.dia + nextLimit();
            this.mes--;
            if (this.mes < 1) {
                this.mes = this.mes + 12;
                this.anio--;
            }
        }

    }

    public void restarSumarMeses(int m) {
        if (this.anio - (m / 12) > 0) {
            this.mes = this.mes + m;
            while (this.mes > 12) {
                this.mes = this.mes - 12;
                this.anio++;
            }
            while (this.mes < 0) {
                this.mes = this.mes + 12;
                this.anio--;
            }
        }
    }

    public void restarSumarAnio(int a) {
        if (this.anio + a > 0) {
            this.anio = this.anio + a;
        }
    }

    private int limit() {
        int limit = 31;
        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            limit = 30;
        }
        if (this.mes == 2) {
            if (bisiesto() == true) {
                limit = 29;
            } else {
                limit = 28;
            }
        }

        return limit;
    }

    private int nextLimit() {
        int limit = 31;
        if (this.mes == 5 || this.mes == 7 || this.mes == 10 || this.mes == 12) {
            limit = 30;
        }
        if (this.mes == 3) {
            if (bisiesto() == true) {
                limit = 29;
            } else {
                limit = 28;
            }
        }
        return limit;
    }
    
    @Override
    public String toString(){
        return (dia + " " + mes + " " + anio);
    }
}

