package fitbiTosto.tostoStats;

import org.apache.oltu.oauth2.client.*;
import org.apache.oltu.oauth2.client.request.*;
import org.apache.oltu.oauth2.common.*;

public class provaClient {
	
	public static void prova() throws Exception{
		OAuthClientRequest request = OAuthClientRequest
				   .authorizationLocation("https://www.fitbit.com/oauth2/authorize")
				   .setClientId("227TNC")
				   .setRedirectURI("http://www.google.it")
				   .buildQueryMessage();
		
		System.err.println(request.getLocationUri());
	}
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World! prova" );
        try {
			prova();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
