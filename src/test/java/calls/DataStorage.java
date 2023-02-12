package calls;

import org.testng.annotations.DataProvider;

public class DataStorage {
    @DataProvider(name = "PostAnOrderPositive")
    public  Object[][] dataOrder(){
    return new Object[][]{
            {5,"John Doe"},
            {1,"Patel"},
            {3,"Elizabeth Clark"},
            {4,"Alina"}
    };




    }

}
