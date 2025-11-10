package com.example.demo.proxy;

public class ProxyCarInfo implements ICarInfo {
   private RealCarInfo realCarInfo;

    public ProxyCarInfo(RealCarInfo realCarInfo) {
        this.realCarInfo = realCarInfo;
    }

   @Override
    public void showNonDetailedInfo() {
        if(realCarInfo.isAvailable()) {
            realCarInfo.showNonDetailedInfo();
        }
        else{
            System.out.println("=== Car is not Available ===");
        }
    }
}
