package concepts.object_reference;

import java.util.PrimitiveIterator;

public class Manager {
    private int managerId;
    private String managerName;

   public Manager(Employee e){
       managerId = e.getEmployeeId();
       managerName = e.getEmployeeName();

   }

   public void managerData(){
       System.out.println("Manager Id: "+ managerId);
       System.out.println("Manager name:"+ managerName);

   }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
