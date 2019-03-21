package guru.springframework.actuator;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyCustomMncEndpoint extends EndpointMvcAdapter {

    public MyCustomMncEndpoint(Endpoint<?> delegate) {
        super(delegate);
    }
}
