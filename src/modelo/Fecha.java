package modelo;

public class Fecha {
    private int Dia;
    private int Mes;
    private int Aniio;

    
    public Fecha() {
        this.Dia = 1;
        this.Mes = 1;
        this.Aniio = 2000;
    }
    public Fecha(int d, int m, int a) {
        if (d > 0 && d < 31) {
            this.Dia = d;
        } else {
            this.Dia = 1;
        }

        if (m > 0 || m < 12) {
            this.Mes = m;
        } else {
            this.Mes = 1;
        }

        if (a > 0) {
            this.Aniio = a;
        } else {
            this.Aniio= 2000;
        }

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) {
                Dia = 1;
            }

        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) {
                Dia = 1;
            }

        }
        if (m == 2) {
            if (this.Aniio % 4 == 0) {
                if (d > 28) {
                    Dia = 1;
                }
            } else {
                if (d > 27) {
                    Dia = 1;
                }
            }
        }
    }

    public int getDia() {
        return this.Dia;
    }

    public void setDia(int d) {
        if (d > 0 || d < limit()) {
            this.Dia = d;
        }
    }

    public int getMes() {
        return this.Mes;
    }

    public void setMes(int m) {
        if (m > 0 || m < 13) {
            this.Mes = m;
        }
    }

    public int getAnio() {
        return this.Aniio;
    }

    public void setAnio(int a) {
        if (a < -1) {
            this.Aniio = a;
        }
    }

    public boolean bisiesto() {
        boolean x;
        if (this.Aniio % 4 == 0) {
            x = true;
        } else {
            x = false;
        }
        return x;
    }

    public void restarSumarDias(int d) {
        this.Dia = this.Dia + d;

        while (this.Dia > limit()) {
            this.Dia = this.Dia - limit();
            this.Mes++;
            if (this.Mes > 12) {
                this.Mes = this.Mes - 12;
                this.Aniio++;
            }
        }

        while (this.Dia < 1) {
            this.Dia = this.Dia + nextLimit();
            this.Mes--;
            if (this.Mes < 1) {
                this.Mes = this.Mes + 12;
                this.Aniio--;
            }
        }

    }

    public void restarSumarMeses(int m) {
        if (this.Aniio - (m / 12) > 0) {
            this.Mes = this.Mes + m;
            while (this.Mes > 12) {
                this.Mes = this.Mes - 12;
                this.Aniio++;
            }
            while (this.Mes < 0) {
                this.Mes = this.Mes + 12;
                this.Aniio--;
            }
        }
    }

    public void restarSumarAnio(int a) {
        if (this.Aniio + a > 0) {
            this.Aniio = this.Aniio + a;
        }
    }

    private int limit() {
        int limit = 31;
        if (this.Mes == 4 || this.Mes == 6 || this.Mes == 9 || this.Mes == 11) {
            limit = 30;
        }
        if (this.Mes == 2) {
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
        if (this.Mes == 5 || this.Mes == 7 || this.Mes == 10 || this.Mes == 12) {
            limit = 30;
        }
        if (this.Mes == 3) {
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
        return (Dia + " " + Mes + " " + Aniio);
    }
}

