import java.util.ArrayList;
import java.util.List;

public class Kantor {
    public List<String> getWaluty(int index){

        List<String> brands= new ArrayList<>();

        //amber
        if (index==1) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }

        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;

    }
}
