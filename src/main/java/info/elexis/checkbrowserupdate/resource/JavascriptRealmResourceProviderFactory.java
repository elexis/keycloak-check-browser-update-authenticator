package info.elexis.checkbrowserupdate.resource;

import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class JavascriptRealmResourceProviderFactory implements RealmResourceProviderFactory {

	public static String RESOURCE_ID = "update-browser";

	@Override
	public String getId() {
		return RESOURCE_ID;
	}

	@Override
	public RealmResourceProvider create(KeycloakSession session) {
		return new JavascriptRealmResourceProvider(session);
	}

	@Override
	public void init(Scope config) {
	}

	@Override
	public void postInit(KeycloakSessionFactory factory) {
	}

	@Override
	public void close() {
	}



}
