package com.tuuna.spider.utils;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class ConnectSite {
    private static String url = "https://toutiao.io";

    public List<String> getAllUrls(String uri) throws Exception{
        List<String> url_list = new ArrayList<String>();

        Connection connect = Jsoup.connect(url+ uri);

        Document document = connect.get();
        Elements links = document.getElementsByClass("title");

        for (Element link : links) {
            Elements a = link.getElementsByTag("a");
            String linkHref = a.attr("href");
            url_list.add(linkHref);
        }

        return url_list;
    }
}
