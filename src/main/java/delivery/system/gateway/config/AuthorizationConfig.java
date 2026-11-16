package delivery.system.gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorizationConfig {
    @Value("${keySetURI}")
    private String keySetURI;
    @Value("${introspectionUri}")
    private String introspectionUri;
}
