
# Keycloak Conditional Check Browser Update Authenticator

This authenticator can be included to check the browser used via the 
[browser-update](http://browser-update.org "Browser-Update.org") code.

Currently it always returns success, but if the browser is too old, the resp.
info page is shown on the first login screen.

By enabling test mode on the authenticator, the info screen can be configured
to be always visible.

## Build

Use with Maven (>3) and JDK (>= 21).

```
mvn clean verify
```

Copy deployments/check-browser-update-authenticator-jar-with-dependencies.jar to /providers/ directory in Keycloak.

### Usage

Add this authenticator to an authentication flow (I.E for the security admin console).

# KUDOS

https://github.com/acomdigital/ for the first version!

# VERSION

0.3 - Updated for Keycloak 26.1.5 and updatebrowser 2025.07
0.2 - Updated for Keycloak 24.0.5