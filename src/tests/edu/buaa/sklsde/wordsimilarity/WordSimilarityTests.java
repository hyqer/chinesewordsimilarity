/*
 * Copyright (C) 2008 SKLSDE(State Key Laboratory of Software Development and Environment, Beihang University)., All Rights Reserved.
 */
package edu.buaa.sklsde.wordsimilarity;

import edu.buaa.sklsde.wordsimilarity.WordSimilarity;
import junit.framework.TestCase;


/**
 * DOCUMENT ME!
 *
 * @author Yingqiang Wu
 * @version 1.0
 */
public class WordSimilarityTests extends TestCase {
    /**
     * test the method {@link WordSimilarity#disPrimitive(String, String)}.
     */
    public void test_disPrimitive() {
        int dis = WordSimilarity.disPrimitive("雇用", "争斗");
        System.out.println("雇用 and 争斗 dis : " + dis);
    }

    /**
     * DOCUMENT ME!
     */
    public void test_simPrimitive() {
        double simP = WordSimilarity.simPrimitive("雇用", "争斗");
        System.out.println("雇用 and 争斗 sim : " + simP);
    }

    /**
     * DOCUMENT ME!
     */
    public void test_simWord() {
        String word1 = "脾气";
        String word2 = "脾气";
        double sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
         word1 = "别号";
         word2 = "老脾气";
         sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
        word1 = "安生";
        word2 = "安适";
        sim = WordSimilarity.simWord(word2, word1);
       System.out.println(word1 + " " + word2 + " sim = " + sim);
    }
    public void test_simWordCilin(){
        String word1 = "打胎";
        String word2 = "人流";
        double sim1 = WordSimilarity.simWordCiLin(word1, word2);
        double sim2 = WordSimilarity.simWordHowNet(word1, word2);
        System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
        System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
        //==================
         word1 = "访谈";
         word2 = "访问";
         sim1 = WordSimilarity.simWordCiLin(word1, word2);
         sim2 = WordSimilarity.simWordHowNet(word1, word2);
        System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
        System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
        word1 = "翻新";
        word2 = "翻修";
        sim1 = WordSimilarity.simWordCiLin(word1, word2);
        sim2 = WordSimilarity.simWordHowNet(word1, word2);
       System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
       System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
       word1 = "失信";
       word2 = "失约";
       sim1 = WordSimilarity.simWordCiLin(word1, word2);
       sim2 = WordSimilarity.simWordHowNet(word1, word2);
      System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
      System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
      word1 = "胡乱";
      word2 = "莽撞";
      sim1 = WordSimilarity.simWordCiLin(word1, word2);
      sim2 = WordSimilarity.simWordHowNet(word1, word2);
     System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
     System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
    }
    /**
     * DOCUMENT ME!
     */
    public void test_simWord_1() {
        String word1 = "我";
        String word2 = "他";
        double sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
         word1 = "爱";
         word2 = "喜欢";
         sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
        word1 = "吃";
        word2 = "喝";
        sim = WordSimilarity.simWord(word2, word1);
       System.out.println(word1 + " " + word2 + " sim = " + sim);
    }
}
