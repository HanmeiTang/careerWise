package external;

import java.util.List;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.monkeylearn.ExtraParam;
import com.monkeylearn.MonkeyLearn;
import com.monkeylearn.MonkeyLearnException;
import com.monkeylearn.MonkeyLearnResponse;


public class MonkeyLearnClient {
    private static final String API_KEY = "d8af8696f21b4ff5b1422becebe06bd19be93e81";
    private static final String MODEL_ID = "ex_YCya9nrn";

    public MonkeyLearnClient() {
        //API_KEY = YamlUtil.getContent().get("MONKEY_LEARN_API_KEY");
        //MODEL_ID = YamlUtil.getContent().get("MONKEY_LEARN_MODEL_ID");
    }

    public static void main(String[] args) {

        String[] textList = {
                "Elon Musk has shared a photo of the spacesuit designed by SpaceX. "
                        + "This is the second image shared of the new design "
                        + "and the first to feature the spacesuit’s full-body look.",};
        List<List<String>> words = MonkeyLearnClient.extractKeywords(textList);
        for (List<String> ws : words) {
            for (String w : ws) {
                System.out.println(w);
            }
            System.out.println();
        }
    }

    public static List<List<String>> extractKeywords(String[] text) {
        if (text == null || text.length == 0) {
            return new ArrayList<>();
        }

        // Use the API key from your account
        MonkeyLearn ml = new MonkeyLearn(API_KEY);

        // Use the keyword extractor
        ExtraParam[] extraParams = {new ExtraParam("max_keywords", "3")};
        MonkeyLearnResponse response;
        try {
            response = ml.extractors.extract(MODEL_ID, text, extraParams);// change to your model id
            JSONArray resultArray = response.arrayResult;
            return getKeywords(resultArray);
        } catch (MonkeyLearnException e) {// it’s likely to have an exception
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private static List<List<String>> getKeywords(JSONArray mlResultArray) {
        List<List<String>> topKeywords = new ArrayList<>();
        // Iterate the result array and convert it to our format.
        for (int i = 0; i < mlResultArray.size(); ++i) {
            List<String> keywords = new ArrayList<>();
            JSONArray keywordsArray = (JSONArray) mlResultArray.get(i);
            for (int j = 0; j < keywordsArray.size(); ++j) {
                JSONObject keywordObject = (JSONObject) keywordsArray.get(j);
                // We just need the keyword, excluding other fields.
                String keyword = (String) keywordObject.get("keyword");
                keywords.add(keyword);

            }
            topKeywords.add(keywords);
        }
        return topKeywords;
    }

}
