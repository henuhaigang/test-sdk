package com.ai.opt.sdk.test;

import java.sql.Timestamp;

import com.ai.opt.sdk.util.DateUtil;

public class TestDate {
public static void main(String[] args) {
	System.out.println(DateUtil.getTimeDifference(Timestamp.valueOf("2016-02-27 00:00:00"), Timestamp.valueOf("2016s-03-27 23:59:59")));;
}
}
