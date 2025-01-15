package JAVA101;

public class Employee {
    String name;
    double salary;
    int workhours;
    int hireyear;
    int currentYear = 2021;


    Employee(String name, int Salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = Salary;
        this.workhours = workHours;
        this.hireyear = hireYear;
    }

    double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        }
        return 0;
    }

     int bonus() {
        if (workhours > 40) {
            return (workhours - 40) * 30;
        }
        return 0;
    }


    double raiseSalary() {
        int year = currentYear-hireyear;
        if (year<10){
            return salary*0.05;
        } else if (year>=10 && year<20) {
            return salary*0.10;
        } else if (year>=20) {
            return salary*0.15;
        }
        return 0;
    }

    public String toString() {
        System.out.println("name: "+this.name);
        System.out.println("maaş: "+this.salary);
        System.out.println("haftalık çalışma süresi: "+workhours);
        System.out.println("işe başlama yılı: "+hireyear);
        System.out.println("vergi: "+tax());
        System.out.println("bonus: "+bonus());
        System.out.println("ekstra maaş: "+raiseSalary());
        System.out.println("vergiler ve bonuslarla toplam maaş:"+(salary+tax()+bonus()));
        System.out.println("toplam maaş: "+(salary+tax()+bonus()+raiseSalary()));
        return super.toString();
    }

}
