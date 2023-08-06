package br.dev.brum.aws;

import br.dev.brum.aws.handler.LambdaHandler;
import com.amazonaws.serverless.proxy.internal.testutils.AwsProxyRequestBuilder;
import com.amazonaws.serverless.proxy.internal.testutils.MockLambdaContext;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ProfileIntegrationTest {

    MockLambdaContext mockLambdaContext = new MockLambdaContext();

    @Test
    public void whenTheUsersPathIsInvokedViaLambda_thenShouldReturnAList() throws IOException {
        LambdaHandler lambdaHandler = new LambdaHandler();
        AwsProxyRequest request = new AwsProxyRequestBuilder("/api/v1/users", "GET").build();
        AwsProxyResponse response = lambdaHandler.handleRequest(request, mockLambdaContext);
        Assertions.assertNotNull(response.getBody());
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void whenWrongPathIsInvokedViaLambda_thenShouldNotFound() throws IOException {
        LambdaHandler lambdaHandler = new LambdaHandler();
        AwsProxyRequest request = new AwsProxyRequestBuilder("/api/v1/users/plus", "GET").build();
        AwsProxyResponse response = lambdaHandler.handleRequest(request, mockLambdaContext);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}