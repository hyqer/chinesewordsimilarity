/*
 * Copyright (C) 2008 SKLSDE(State Key Laboratory of Software Development and Environment, Beihang University)., All Rights Reserved.
 */
package edu.buaa.edu.wordsimilarity;

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
        String word1 = "牛脾气";
        String word2 = "老脾气";
        double sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
         word1 = "别号";
         word2 = "老脾气";
         sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
    }
}
