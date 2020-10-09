package rpc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import external.GitHubClient;
import entity.Item;
import db.MySQLConnection;

/**
 * Servlet implementation class SearchItem
 */
public class SearchItem extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchItem() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	Double lat;
    	Double lon;

        // Get user name from HTTP query
        String userId = request.getParameter("user_id");
        String location = request.getParameter("location");
        try {
        	lat = Double.parseDouble(request.getParameter("lat"));
        	lon = Double.parseDouble(request.getParameter("lon"));
        } catch (NullPointerException e) {
        	lat = null;
        	lon = null;
        }

        GitHubClient client = new GitHubClient();
        List<Item> items = client.search(lat, lon, null, location);

        MySQLConnection connection = new MySQLConnection();
        Set<String> favoritedItemIds = connection.getFavoriteItemIds(userId);
        connection.close();

        JSONArray array = new JSONArray();
        for (Item item : items) {
            JSONObject obj = item.toJSONObject();
            obj.put("favorite", favoritedItemIds.contains(item.getItemId()));
            array.put(obj);
        }

        RpcHelper.writeJsonArray(response, array);

        // if (request.getParameter("username") != null) {
        // JSONObject obj = new JSONObject();
        // String username = request.getParameter("username");
        // obj.put("username", username);
        // writer.print(obj);
        // }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
