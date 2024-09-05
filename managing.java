//Driver Class
public class managing {
    public static void main(String[] args) {
        //name, salary
        Employee e1 = new Employee("Jane", 3500000.00);
        Employee e2 = new Employee("Brandon", 200000.00);
        Employee e3 = new Employee("Anna", 2500000.00);

        if(e1.getSalary() < e2.getSalary()) {
            System.out.println("Gaji Jane lebih tinggi");
        }else{
            System.out.println("Gaji Brandon lebih rendah");
        }
        if(e1.getSalary() < e3.getSalary()) {
            System.out.println("Gaji Jane lebih tinggi");
        }else{
            System.out.println("Gaji Anna lebih rendah");
        }
        if(e2.getSalary() > e3.getSalary()) {
            System.out.println("Gaji Brandon lebih rendah");
        }else{
            System.out.println("Gaji Anna lebih tinggi");
        }
        if(e2.getSalary() > e1.getSalary()) {
            System.out.println("Gaji Brandon lebih rendah");
        }else{
            System.out.println("Gaji Jane lebih tinggi");
        }
        if(e3.getSalary() < e2.getSalary()) {
            System.out.println("Gaji Anna lebih tinggi");
        }else{
            System.out.println("Gaji Brandon lebih rendah");    
        }
        if(e3.getSalary() > e1.getSalary()) {
            System.out.println("Gaji Anna lebih rendah");
        }else{
            System.out.println("Gaji Jane lebih tinggi");    
        }
        e1.print();
        e2.print();
        e3.print();

        }
    }    

