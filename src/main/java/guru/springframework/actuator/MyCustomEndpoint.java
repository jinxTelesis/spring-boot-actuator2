package guru.springframework.actuator;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;

import java.util.ArrayList;
import java.util.List;

public class MyCustomEndpoint extends AbstractEndpoint<List<String>> {

    public MyCustomEndpoint(){
        super("mycustomerendpoint");
    }


    @Override
    public List<String> invoke() {

        List<String> jamBands = new ArrayList<>(5);
        jamBands.add("Umphrey's McGee");
        jamBands.add("String Cheese Incident");
        jamBands.add("moe.");
        jamBands.add("Tauk");
        jamBands.add("Widespread Panic");

        return null;
    }
}
