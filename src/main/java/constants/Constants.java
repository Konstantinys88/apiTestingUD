package constants;


public class Constants {

    public static class RunVeriable{

        public static String server = Servers.JSON_PLACEHOLDER_URL;
        public static String path = "";

    }

    public static class Servers{
        public static String SWAPI_URL = "https://swapi.dev/";
        public static String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com/";
        public static String GOOGLE_PLACES_URL;

    }

    public static class Path{
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PLACES_PATH;

    }

    public static class Actions{
        public static String SWAPI_GET_PEOPLE = "people/";
        public static String GOOGLE_PLACES_URL;
        public static String JSON_PLACEHOLDER_GET = "comments/";
        public static String JSON_PLACEHOLDER_PUT = "posts/1";
        public static String JSON_PLACEHOLDER_DELETE = "posts/1";

    }



}
