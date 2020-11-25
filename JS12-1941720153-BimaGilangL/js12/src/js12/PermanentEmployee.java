
package js12;
/**
 * BimaGilangL
 */
public class PermanentEmployee extends Employee implements Payable {
    private int salary;
    public PermanentEmployee (String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getPaymentAmount(){
        return (int) (salary+0.05*salary);
    }
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered sas permanent employee with salary "+salary+"\n";
        return info;
     }
}
