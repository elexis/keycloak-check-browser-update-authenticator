package info.elexis.checkbrowserupdate.authentication;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import info.elexis.checkbrowserupdate.resource.JavascriptRealmResourceProviderFactory;

public class CheckBrowserUpdateAuthenticator implements Authenticator {

	private KeycloakSession session;

	public CheckBrowserUpdateAuthenticator(KeycloakSession session) {
		this.session = session;
	}

	@Override
	public void action(AuthenticationFlowContext context) {
		context.success();
	}

	@Override
	public boolean requiresUser() {
		return false;
	}

	@Override
	public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
	}

	@Override
	public void close() {
	}

	@Override
	public void authenticate(AuthenticationFlowContext context) {
		String authServerBaseUrl = session.getContext().getUri().getBaseUri().toString();
		String realmBaseUrl = authServerBaseUrl + "realms/" + context.getRealm().getName() + "/";
		context.form().addScript(realmBaseUrl + JavascriptRealmResourceProviderFactory.RESOURCE_ID + "/embedd.js");
		context.success();
	}

	@Override
	public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
		return true;
	}

}
