//package idpeasy.app.metadata;
//
//import java.net.URL;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Java6Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class HelloControllerIT {
//
//    @LocalServerPort
//    private int port;
//
//    private URL base;
//
//    @Autowired
//    private TestRestTemplate template;
//
//    @Before
//    public void setUp() throws Exception {
//        this.base = new URL("http://localhost:" + port + "/greeting");
//    }
//
//    @Test
//    public void getHello() throws Exception {
//        ResponseEntity<String> response = template.getForEntity(base.toString(),
//                String.class);
//        assertThat(response.getBody()).isEqualTo("{\"id\":1,\"content\":\"Hello, World!\"}");
//    }
//}