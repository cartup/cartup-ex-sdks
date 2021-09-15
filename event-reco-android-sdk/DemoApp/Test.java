import com.example.cartupevent.Cartup;
import com.example.cartupevent.CartupEvent;
import android.content.Context;

import com.example.cartupevent.CartupRecommendation;
import org.json.JSONObject;
import android.app.Application;
import android.content.Context;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        CartupEvent event = new Cartup(null, "orgName", "orgId", "domain").GetCartupEvent();

        event = event.SetEventName("viewCart");
        event.GetAllField();
        event.AddParam("sku_ss", new String[] {"sku1", "sku2", "sku3"});
        event.AddParam("productname_ss", new String[] {"Ani", "Sam", "Joe"});
        event.AddParam("price_ds", new Double[] {20.0, 30.0, 40.0});
        event.AddParam("totalamount_d", 20.0);
        event.SendEvent();


        CartupRecommendation recommendation = new CartupRecommendation(null,"orgName", "orgId", "domain");

        // Mandatory fields
        recommendation.SetWidgetId("widgetId");

        // optional fields
        recommendation.SetLimit("10");
        recommendation.SetCategoryName("CategoryName");
        recommendation.SetProductName("ProductName");
        recommendation.SetUserId("userId");
        recommendation.SetSku("sku");

        // To get the url, if needed
        String url = recommendation.GetUrl();

        // To get the data from the server
        String data = recommendation.GetData();


    }
}

