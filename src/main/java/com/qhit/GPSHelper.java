package com.qhit;

public class GPSHelper {
    // 圆周率
    public static final double PI = 3.14159265358979324;
    // 赤道半径(单位m)
    private static final double EARTH_RADIUS = 6378137;

    /**
     * 转化为弧度(rad)
     */
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

//    基于googleMap中的算法得到两经纬度之间的距离,
//    计算精度与谷歌地图的距离精度差不多，相差范围在0.2米以下
//    @param
//    lon1 第一点的经度
//    @param
//    lat1 第一点的纬度
//    @param
//    lon2 第二点的经度
//    @param
//    lat3 第二点的纬度
//    @return 返回的距离，单位km

    public static double GetDistance(double lon1, double lat1, double lon2, double lat2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lon1) - rad(lon2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        //s = Math.round(s * 10000) / 10000;
        return s;
    }
    public static void main(String[] args){
//        System.out.println("city:"+getCity(31.22,121.48));
//        System.out.println("太原－上海：" + getDistance(37.87, 112.53, 31.22, 121.48));
//        System.out.println("宁波－上海：" + getDistance(29.86, 121.56, 31.22, 121.48));

//        double v = GPSHelper.GetDistance(37.87, 112.53, 31.22, 121.48);
//        v*=1000;
//        System.out.println(v);
        int  count=0;
        for(int a=1;a<5 ;a++){

            for(int b=1;b<5 ;b++){
                for(int c=1;c<5 ;c++){
                    for(int d=1;d<5 ;d++){
                        System.out.println(count++);
                        String ss=""+a+b+c+d;
                        System.out.println(ss);
                    }
                }
            }
        }
    }

}