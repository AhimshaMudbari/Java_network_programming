package URL_connection;

import java.net.HttpCookie;

public class Http_Cookie {
	public static void main(String[] args) {
		HttpCookie cookie = new HttpCookie("Ahim", "11");
		cookie.setDiscard(true);
		System.out.println("Cookie discarede: " + cookie.getDiscard());
		cookie.setVersion(1);
		System.out.println("Cookie version: " + cookie.getVersion());
		cookie.setValue("Cookie is working");
		System.out.println("Cookie value: " + cookie.getValue());
		System.out.println("Cookie Expired?: " + cookie.hasExpired());
		cookie.setDomain("ahimsha.click");
		System.out.println("Required domain of cookie: " + cookie.getDomain());
		cookie.setMaxAge(5000);
		System.out.println("Maxageof cookie is: " + cookie.getMaxAge());
		System.out.println("cokie hash code: " + cookie.hashCode());
	}
}
