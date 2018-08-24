package idpeasy.app.metadata;

import com.onelogin.saml2.Auth;
import com.onelogin.saml2.settings.Saml2Settings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetaDataController {
	
	@GetMapping("metadata")
	public String metadata() {
		return getMetaDataXml();
	}
	
	
	private static String getMetaDataXml() {
		try {
			
			Auth auth = new Auth();
			
			Saml2Settings settings = auth.getSettings();
			
			return settings.getSPMetadata();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

//		List<String> errors = Saml2Settings.validateMetadata(metadata);
//		if (errors.isEmpty()) {
//			out.println(metadata);
//		} else {
//			response.setContentType("text/html; charset=UTF-8");
//			for (String error : errors) {
//				out.println("<p>"+error+"</p>");
//			}
//		}
	}
	
}
