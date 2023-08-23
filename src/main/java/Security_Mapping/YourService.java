package Security_Mapping;

import javax.xml.ws.ServiceMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@ServiceMode
public class YourService {

    private static final Logger logger = LoggerFactory.getLogger(YourService.class);

    public void someServiceMethod() {
        logger.info("Service method is executed");
    }
}

