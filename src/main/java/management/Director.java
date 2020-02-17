package management;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINum, int salary, String deptName, double  budget){
        super(name, nINum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }


    @Override
    public void payBonus(double bonus) {
        salary *= bonus;
    }
}
