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

}
