package com.example.lococoder.md5;

public class Common {
  public static String convertMilliSecToHMS(int MilliSecond) {
    int m = 0;
    int h = 0;
    int x = (int) Math.ceil(MilliSecond / 1000f);
    m = (int) Math.ceil(x / 60);
    h = (int) Math.ceil(m / 60);
    m = m % 60;
    x = x % 60;
    String second = "" + x;
    String minute = "" + m;
    String hour = "" + h;
    String separator = ":";
    if (x < 10) {
      second = "0" + x;
    }
    if (m < 10) {
      minute = "0" + m;
    }

    if (h == 0) {
      return (minute + separator + second);
    } else {
      return (hour + separator + minute + separator + second);
    }
  }
}
