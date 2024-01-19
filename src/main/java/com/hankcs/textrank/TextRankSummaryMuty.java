package com.hankcs.textrank;

import java.util.ArrayList;
import java.util.List;

public class TextRankSummaryMuty {

    private static final int orignalSize = 3;//初始抽出句子数

    private static final String chi_sim = "chi_sim";//简体中文
    private static final String eng = "eng";//英文

    public static List<String> getTopSentenceListMulty(String document, int senSize, String lang){
        if(null==lang||"".equals(lang.trim())){
            lang = chi_sim;
        }else {
            lang = lang.trim().toLowerCase();
        }
        if(0==senSize){
            senSize = orignalSize;
        }
        List<String> result = new ArrayList<>();
        if(lang.equals(chi_sim)){
            result = TextRankSummary.getTopSentenceList(document,senSize);
        }else if(lang.equals(eng)){
            result = TextRankSummary.getTopSentenceListEng(document,senSize);
        }
        return result;
    }

    public static void main(String[] args)
    {
        String document = "算法可大致分为基本算法、数据结构的算法、数论算法、计算几何的算法、图的算法、动态规划以及数值分析、加密算法、排序算法、检索算法、随机化算法、并行算法、厄米变形模型、随机森林算法。\n" +
                "算法可以宽泛的分为三类，\n" +
                "一，有限的确定性算法，这类算法在有限的一段时间内终止。他们可能要花很长时间来执行指定的任务，但仍将在一定的时间内终止。这类算法得出的结果常取决于输入值。\n" +
                "二，有限的非确定算法，这类算法在有限的时间内终止。然而，对于一个（或一些）给定的数值，算法的结果并不是唯一的或确定的。\n" +
                "三，无限的算法，是那些由于没有定义终止定义条件，或定义的条件无法由输入的数据满足而不终止运行的算法。通常，无限算法的产生是由于未能确定的定义终止条件。";

        String document2 = "算法可大致分为基本算法、数据结构的算法、数论算法、计算几何的算法、图的算法、动态规划以及数值分析、加密算法、排序算法、检索算法、随机化算法、并行算法、厄米变形模型、随机森林算法。\n" +
                "算法可以宽泛的分为三类，\n" +
                "一，有限的确定性算法，这类算法在有限的一段时间内终止。他们可能要花很长时间来执行指定的任务，但仍将在一定的时间内终止。这类算法得出的结果常取决于输入值。\n" +
                "二，有限的非确定算法，这类算法在有限的时间内终止。然而，对于一个（或一些）给定的数值，算法的结果并不是唯一的或确定的。\n" +
                "三，无限的算法，是那些由于没有定义终止定义条件，或定义的条件无法由输入的数据满足而不终止运行的算法。通常，无限算法的产生是由于未能确定的定义终止条件。";
        //String fileName = "src/test/doc/03.txt";
        //String rf = ReadFromFile.file2String(fileName,"utf8");
        //System.out.println(TextRankSummary.getTopSentenceList(rf, 3));
        //System.out.println(TextRankSummary.getTopSentenceListEng(rf, 3));

        String doc =document;
        int size = 3;
        String lang = "";
        if(args.length>=3){
            doc = args[0];
            size = args[1]!=null&&!"".equals(args[1])? Integer.parseInt(args[1]):3;
            lang = args[2];
        }
        System.out.println(TextRankSummaryMuty.getTopSentenceListMulty(doc,size,lang));
        //System.out.println("--------------------------------------");
        //System.out.println(new TextRankKeyword().getKeyword("", rf));
    }
}
