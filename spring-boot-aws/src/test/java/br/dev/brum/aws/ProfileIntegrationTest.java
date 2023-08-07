package br.dev.brum.aws;

import com.amazonaws.serverless.proxy.internal.testutils.MockLambdaContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileIntegrationTest {

    MockLambdaContext mockLambdaContext = new MockLambdaContext();

//    @Test
//    public void whenTheUsersPathIsInvokedViaLambda_thenShouldReturnAList() throws IOException {
//        LambdaHandler lambdaHandler = new LambdaHandler();
//        AwsProxyRequest request = new AwsProxyRequestBuilder("/api/v1/users", "GET").build();
//        AwsProxyResponse response = lambdaHandler.handleRequest(request, mockLambdaContext);
//        Assertions.assertNotNull(response.getBody());
//        Assertions.assertEquals(200, response.getStatusCode());
//    }
//
//    @Test
//    public void whenWrongPathIsInvokedViaLambda_thenShouldNotFound() throws IOException {
//        LambdaHandler lambdaHandler = new LambdaHandler();
//        AwsProxyRequest request = new AwsProxyRequestBuilder("/api/v1/users/plus", "GET").build();
//        AwsProxyResponse response = lambdaHandler.handleRequest(request, mockLambdaContext);
//        Assertions.assertEquals(200, response.getStatusCode());
//    }
}