package guru.springframework.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
import org.springframework.stereotype.Component;


@Component
public class CustomGuruMvcEndpoint extends EndpointMvcAdapter {

    @Autowired
    public CustomGuruMvcEndpoint(CustomGuruEndpoint customEndpoint) {
        super(customEndpoint);
    }


}
