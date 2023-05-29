package com.xworkz.mobileShop;

public class MobileShopTester {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        MobileShop mobileShop = new MobileShop(mobile);
        mobileShop.mobile.toDownload();
    }
}
