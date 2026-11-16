package delivery.system.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "server.port=0",
        "SERVER_PORT=0",

        "eureka.client.enabled=false",
        "eureka.client.register-with-eureka=false",
        "eureka.client.fetch-registry=false",
        "spring.cloud.discovery.enabled=false",
        "spring.cloud.gateway.server.webflux.discovery.locator.enabled=false",
        "spring.cloud.config.enabled=false",

        "ISSUER_URI=http://localhost:9999",
        "JWKS_URI=http://localhost:9999/oauth2/jwks",

        "REDIS_HOST=localhost",
        "REDIS_PORT=6379",
        "REDIS_DB_USERNAME=test",
        "REDIS_DB_PASSWORD=test",

        "SSL_ENABLED=false",
        "SSL_KEYSTORE=classpath:dummy.p12",
        "SSL_KEYSTORE_PASSWORD=changeit",
        "SSL_KEYSTORE_TYPE=PKCS12",
        "SSL_KEY_ALIAS=test",
        "SSL_KEY_PASSWORD=changeit",
        "SSL_TRUSTSTORE=classpath:dummy.p12",
        "SSL_TRUSTSTORE_PASSWORD=changeit",

        "REGISTRY_USERNAME=test",
        "REGISTRY_PASSWORD=test",
        "REGISTRY_HOSTNAME=localhost",
        "REGISTRY_PORT=8761",
        "GATEWAY_SERVICE_NAME=gateway",
        "POD_NAME=gateway-test"
})
class GatewayApplicationTests {

    @Test
    void contextLoads() {
    }
}
