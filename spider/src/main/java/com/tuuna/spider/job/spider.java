package com.tuuna.spider.job;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class spider {
    private static String url = "https://toutiao.io";
    public static void main(String[]args) throws IOException {
        List<String> url_list = new ArrayList<String>();

        Connection connect = Jsoup.connect(url+"/posts/hot/7");

        Document document = connect.get();
        Elements links = document.getElementsByClass("content");

        for (Element link : links) {
//            Elements real_links = link.getElementsByTag("data-url");
            String linkHref = link.attr("data-url");
            url_list.add(linkHref);
        }

        System.out.println(url_list);

    }
}

