package info.elexis.checkbrowserupdate.authentication;

public class BrowserUpdateScriptTemplate {

	/**
	 * @see http://browser-update.org/ installation & configuration
	 */
	public static String SCRIPT = """
			var $buoop = {required:{e:-4,f:-3,o:-3,s:-1,c:-3},insecure:true,api:2025.07};

			function $buo_f(){
			 	var e = document.createElement("script");
			 	e.src = "//browser-update.org/update.min.js";
			 	document.body.appendChild(e);
			};

			try {document.addEventListener("DOMContentLoaded", $buo_f,false)}
			catch(e){window.attachEvent("onload", $buo_f)}
			""";

	/**
	 * @see http://browser-update.org/ installation & configuration
	 */
	public static String SCRIPT_TEST = """
			var $buoop = {required:{e:-4,f:-3,o:-3,s:-1,c:-3},insecure:true,api:2025.07,test:true};

			function $buo_f(){
			 	var e = document.createElement("script");
			 	e.src = "//browser-update.org/update.min.js";
			 	document.body.appendChild(e);
			};

			try {document.addEventListener("DOMContentLoaded", $buo_f,false)}
			catch(e){window.attachEvent("onload", $buo_f)}
			""";

}
