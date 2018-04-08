package sample;

/**
 * Created by wdphu on 2018/4/5.
 */
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Administrator
 */
public class TestTableView {
    //这点要注意，在初始化的时候一定要写上new，否则会出错的，因为他不像int那样活着是String那样有默认的构造函数。
    private StringProperty firstName=new SimpleStringProperty();
    private StringProperty lastName=new SimpleStringProperty();
    private  StringProperty age=new SimpleStringProperty();

    //testing
    private StringProperty test = new SimpleStringProperty();
    public TestTableView(String firstName,String lastName,String age, String test){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setTest(test);
    }
    public String getTest(){
        return this.test.get();
    }
    public void setTest(String test){
        this.test.set(test);
    }
    public StringProperty getTestProperty(){
        return this.test;
    }

    //下面就是中规中矩的写法，但是要注意和构造普通bean方法的区别
//    public TestTableView(String firstName,String lastName,String age){
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
//    }
//    public TestTableView(){
//
//    }
    public String getFirstName(){
        return this.firstName.get();
    }
    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }
    public String getLastName(){
        return this.lastName.get();
    }
    public void setLastName(String lastName){
        this.lastName.set(lastName);
    }
    public String getAge(){
        return this.age.get();
    }
    public void setAge(String age){
        this.age.set(age);
    }

    public StringProperty getAgeProperty(){
        return this.age;
    }
    public StringProperty getFirstProperty(){
        return this.firstName;
    }
    public StringProperty getLastProperty(){
        return this.lastName;
    }

}
