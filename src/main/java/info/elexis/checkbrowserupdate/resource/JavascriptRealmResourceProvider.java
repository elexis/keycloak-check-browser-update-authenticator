package info.elexis.checkbrowserupdate.resource;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;

import info.elexis.checkbrowserupdate.authentication.BrowserUpdateScriptTemplate;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

public class JavascriptRealmResourceProvider implements RealmResourceProvider {

	private KeycloakSession session;

	public JavascriptRealmResourceProvider(KeycloakSession session) {
		this.session = session;
	}

	@GET
	@Path("embedd.js")
	@Produces("application/javascript")
	public Response getEmbeddJs() {
		return Response.ok(BrowserUpdateScriptTemplate.SCRIPT).build();
	}

	@GET
	@Path("embedd-test.js")
	@Produces("application/javascript")
	public Response getEmbeddJsTest() {
		return Response.ok(BrowserUpdateScriptTemplate.SCRIPT_TEST).build();
	}

	@Override
	public void close() {
	}

	@Override
	public Object getResource() {
		return this;
	}

}
