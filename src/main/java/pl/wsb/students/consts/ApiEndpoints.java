package pl.wsb.students.consts;

public class ApiEndpoints {
    private static final String QUERY_PARAM_ID = "/{id}";
    public static final String AUTHENTICATE = "/authenticate";
    public static final String LIBRARY = "/library";
    public static final String MOVIE = "/movie";
    public static final String ACTOR = "/actor";
    public static final String USER = "/user";
    public static final String MOVIE_RATE = "/rate";
    public static final String LOGOUT = "/logout";
    public static final String MOVIE_ID_ACCEPT = ApiEndpoints.QUERY_PARAM_ID + "/accept";
    public static final String MOVIE_ID_REJECT = ApiEndpoints.QUERY_PARAM_ID + "/reject";
    public static final String ACTOR_ADD = ApiEndpoints.QUERY_PARAM_ID  + "/add";
    public static final String ACTOR_DEL = ApiEndpoints.QUERY_PARAM_ID + "/delete";
    public static final String PARAM_LIMIT = "limit";
    public static final String PARAM_OFFSET = "offset";
    public static final String PARAM_SEARCH = "search";

}
