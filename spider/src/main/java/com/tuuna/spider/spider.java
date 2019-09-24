package com.tuuna.spider;

import com.tuuna.spider.utils.ConnectSite;



class spider {
    public static void main(String[]args) throws Exception {

        ConnectSite getSevenDays = new ConnectSite();

        System.out.println(getSevenDays.getAllUrls("/posts/hot/7"));

    }
}

