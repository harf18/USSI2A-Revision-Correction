package net.lecnam.ussi2a.revisions.exo2;

public class Ingenieur extends Employe {


    private int grade;

    public Ingenieur(String nom, String dateNaissance, double salaire, int grade) {
        super(nom, dateNaissance, salaire);
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void voirSalaire(){
        System.out.println(this.salaire + (grade * 100));
    }
}
