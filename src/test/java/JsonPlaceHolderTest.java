import config.TestConfig;
import org.testng.annotations.Test;

import static constants.Constants.Actions.*;
import static io.restassured.RestAssured.given;

public class JsonPlaceHolderTest extends TestConfig {

    @Test
    public void Get(){
        given().queryParam("postID",2).log().uri().
                when().get(JSON_PLACEHOLDER_GET).
                then().log().body().statusCode(200);
    }

    @Test
    public void Put(){

        String putBodyJson = "{\n" +
                "\"id\":1,\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1,\n" +
                "}";

        given().body(putBodyJson).log().uri().
                when().put(JSON_PLACEHOLDER_PUT).
                then().log().body().statusCode(200);
    }

    @Test
    public void Delete(){

        given().log().uri().
                when().delete(JSON_PLACEHOLDER_DELETE).
                then().log().body().statusCode(200);

    }

    @Test
    public void PostWithJson(){

        String postJsonBody = "{\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1\n" +
                "}";

        given().body(postJsonBody).log().uri().
                when().post(JSON_PLACEHOLDER_POST).
                then().log().body().statusCode(201);

    }

    @Test
    public void PostWithXml(){
        String postXmlBody = "<?xml version=\"1.0\"?>\n" +
                "<Company>\n" +
                "  <Employee>\n" +
                "      <FirstName>Tanmay</FirstName>\n" +
                "      <LastName>Patil</LastName>\n" +
                "      <ContactNo>1234567890</ContactNo>\n" +
                "      <Email>tanmaypatil@xyz.com</Email>\n" +
                "      <Address>\n" +
                "           <City>Bangalore</City>\n" +
                "           <State>Karnataka</State>\n" +
                "           <Zip>560212</Zip>\n" +
                "      </Address>\n" +
                "  </Employee>\n" +
                "</Company>";

        given().body(postXmlBody).log().uri().
                when().post("").
                then().log().body().statusCode(200);

    }

}
