package page;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Алексей on 06.03.2018.
 */
public class JsonUser {
    private String browserType;
    private String url;
    private ArrayList<String> userNames = new ArrayList<>();
    private ArrayList<String> passwords = new ArrayList<>();
    private ArrayList<String> services = new ArrayList<>();

    public String createJson() {
        JSONObject jRoot = new JSONObject()
                .put("BrowserType", browserType)
                .put("url", url);

        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < userNames.size(); i++) {
            jsonArray.put(new JSONObject()
                    .put("username", userNames.get(i))
                    .put("password", passwords.get(i))
                    .put("service", services.get(i)));
        }

        jRoot.put("accounts", jsonArray);

        return jRoot.toString();
    }

    public void readJson() throws IOException {
        clearArray();
        JSONObject jsonObjectRoot = new JSONObject(readFromFile("./src/test/resources/data/Credential.json"));
        JSONArray jsonArray = jsonObjectRoot.getJSONArray("accounts");
        JSONObject jsonObject = null;

        url = jsonObjectRoot.getString("url");
        browserType = jsonObjectRoot.getString("BrowserType");

        for (int i = 0; i < jsonArray.length(); i++) {
            jsonObject = jsonArray.getJSONObject(i);
            userNames.add(jsonObject.getString("username"));
            passwords.add(jsonObject.getString("password"));
            services.add(jsonObject.getString("service"));
        }
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void addUserName(String userName) {
        userNames.add(userName);
    }

    public void addPassword(String password) {
        passwords.add(password);
    }

    public void addService(String service) {
        services.add(service);
    }

    public String getNameAt(int i) {
        return userNames.get(i);
    }

    public String getPasswordAt(int i) {
        return passwords.get(i);
    }

    public String getServiceAt(int i) {
        return services.get(i);
    }

    public int getCountOfAccount() {
        return userNames.size();
    }

    public String getBrowserType() {
        return browserType;
    }

    public String getUrl() {
        return url;
    }

    public int searchService(String service) {
        return services.contains(service) ? services.indexOf(service) : -1;
    }

    private String readFromFile(String s) throws IOException {
        FileInputStream fin = new FileInputStream(new File(s));
        int i = -1;
        String text = "";
        while((i = fin.read())!=-1) {
            text += (char) i;
        }

        return text;
    }

    private void clearArray() {
        userNames.clear();
        passwords.clear();
        services.clear();
    }
}
