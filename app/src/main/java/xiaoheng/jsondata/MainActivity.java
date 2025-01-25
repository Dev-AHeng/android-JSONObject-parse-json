package xiaoheng.jsondata;

import android.app.*;
import android.os.*;
import android.util.*;
import org.json.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		try
		{
			JSONObject jsonObject = new JSONObject("{\"first_name\":\"Taylor\",\"last_name\":\"swifter\"}");
			
			String firstName = jsonObject.getString("first_name");
			String lastName = jsonObject.getString("last_name");
			System.out.println("swifter"+ firstName + " " + lastName);   //输出 Taylor swifter

			jsonObject.put("first_name", "Avril");
			System.out.println("swifter"+ jsonObject.toString());
			
		}
		catch (JSONException e)
		{}
		
		
    }
}
