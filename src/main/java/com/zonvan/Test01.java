package com.zonvan;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
/**
 * Created by tommy on 2017/5/3.
 */
public class Test01 {


	@Test
	public void fetchURl() throws IOException {
		String url = "http://192.168.0.21/myPay/admin/login.jsp"; // no trailing / to force redir
		Document html = Jsoup.parse(new URL(url), 10*1000);
		//System.out.println(html);
		Elements ele = html.select("body").select(".logo");

		System.out.println("------------------------------");
		System.out.println(ele.toString());

	}
}
