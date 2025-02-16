package api.endpoints;

/*
 * https://petstore.swagger.io/#/
 * create user(post)  :https://petstore.swagger.io/v2/user
 * Get user(get)  :https://petstore.swagger.io/v2/user/{username}
 * update user(put)  :https://petstore.swagger.io/v2/user/{username}
 * Delete user(Delete)  :https://petstore.swagger.io/v2/user/{username}
 */
public class Routes {//Routes contains only urls

	public static String base_url = "https://petstore.swagger.io/v2";

	// user module
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";
}
