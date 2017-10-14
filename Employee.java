
/*
* Employee POJO class
* @Copyright to balaji_inf@yahoo.com
*/
import javax.persistence.*;

@Entity
@Table(name = "EMP")
public class Employee
{
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private int salary;


    public int getId()
    {
       return this.id;
    }

    public void setId(int id)
    {
       this.id = id;
    }

    public String getName()
    {
       return this.name;
    }
    public void setName(String name)
    {
       this.name = name;
    }

    public int getSalary()
    {  
       return this.salary;
    }
    
    public void setSalary(int salary)
    {  
       this.salary = salary;
    }

}
