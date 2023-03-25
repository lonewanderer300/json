import blue.archive;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class niatconnect {
    public static int Sholat;
    public static void main(String[] args)throws IOException {
        nggakniat koneksi = new nggakniat();
        URL myAddress = koneksi.buildURL
                ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");
        String response =koneksi.getResponseFromHttpUrl(myAddress);
        System.out.println(response);
assert response != null;
JSONArray responseJSON = new JSONArray(response);
        ArrayList<archive> responseModel = new ArrayList<>();
        for (int i = 0; i <responseJSON.length();i++){
            archive resModel = new archive();
            JSONObject myJSONObject = responseJSON.getJSONObject(i);
            resModel.setMessage(myJSONObject.getString("Barcode"));
            resModel.setStatus(myJSONObject.getString("Name"));
            resModel.setComment(myJSONObject.getString("Sell"));
            responseModel.add(resModel);
        }
        System.out.println("Response are:");
        for (int a=0;a<responseModel.size();a++){
            int Obat =Integer.parseInt(responseModel.get(a).getComment());
            if (Obat <= 2000) {
            System.out.println("\nBarcode :"+responseModel.get(a) .getMessage());
            System.out.println("Name :"+responseModel.get(a) .getStatus());
            System.out.println("Sell :"+responseModel.get(a) .getComment());
        }
    }
        System.out.println("\njumlah data : " + Sholat);
    }
}
