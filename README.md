
# Keycloak Conditional Check Browser Update Authenticator

This conditional authenticator can be activate to check the browser used via the 
[browser-update](http://browser-update.org "Browser-Update.org") code.


Currently it always returns success, but if the browser is to old, the resp.
info page is shown on the first login screen.


## Build

Use with Maven (>3) and JDK (>= 17).

```
mvn clean install
```

Copy deployments/check-browser-update-authenticator-jar-with-dependencies.jar to /providers/ directory in Keycloak.

### Usage

Add this authenticator to an authentication flow (I.E for the security admin console).