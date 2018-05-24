package com.cxl.tool;

//package com.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import jxl.*;

public class Time {
    public static void main(String[] args) {
        System.out.println("执行");
        int i;
        Sheet sheet;
        Workbook book;
        List list = new ArrayList();
        Cell cell1, cell2, cell3, cell4, cell5, cell6, cell7;
        try {
            //hello.xls为要读取的excel文件名
            System.out.println("获取");
            book = Workbook.getWorkbook(new File("C://Users//chenxinglong//Desktop//2222.xls"));

            //获得第一个工作表对象(ecxel中sheet的编号从0开始,0,1,2,3,....)
            sheet = book.getSheet(0);
            //获取左上角的单元格
            cell1 = sheet.getCell(0, 0);
            System.out.println("标题：" + cell1.getContents());
//            cell2 = sheet.getCell(0,1);
//            System.out.println(cell2.getContents());
            i = 1;
            System.out.println("开始循环");
            String timeStr, timeStr2;
            SimpleDateFormat timeStred = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
            SimpleDateFormat timeStred2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
            while (true) {
//                System.out.println("异常"+sheet.getCell(0,3002));
                cell2 = sheet.getCell(2, i);
                cell3 = sheet.getCell(3, i);

                if ("s".equals(cell2.getContents()) == true)
                    break;
                timeStr = cell2.getContents();
                timeStred.parse(timeStr);
                timeStr2 = cell3.getContents();
                timeStred2.parse(timeStr2);

                System.out.println(timeStred.getCalendar().getTimeInMillis());
                System.out.println(timeStred2.getCalendar().getTimeInMillis());
                System.out.println(timeStred2.getCalendar().getTimeInMillis() - timeStred.getCalendar().getTimeInMillis());
                Long long1 = Long.valueOf(timeStred2.getCalendar().getTimeInMillis() - timeStred.getCalendar().getTimeInMillis());
                list.add(long1);
                System.out.println(list);
                System.out.println("cell2:第 " + (i + 1) + "行" + cell2.getContents());
                System.out.println("cell3:第 " + (i + 1) + "行" + cell3.getContents());

                i++;


            }
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        avetage(list);

    }

    static void avetage(List list) {
        long sum = -1;
        long ave=-1;
        for (Object i : list
                ) {
            System.out.println(i);
            sum += (long)i;

        }

        System.out.println("总和: "+sum);
        System.out.println("平均： "+sum/list.size());
    }
}