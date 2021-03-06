package com.melpo.test;

import melpo.StatisticUtilsArrayListStream;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StatisticUtilsArrayListStreamTest {

    private static ArrayList<Double> values1 = new ArrayList<Double>();
    private static ArrayList<Double> values2= new ArrayList<Double>();
    private static ArrayList<Double> values3 = new ArrayList<Double>();

    @BeforeClass
    public static void SetUp() {

        double[] array1 = {3,5,6,7};
       // double[] array2 = null;
        double[] array3 = {};
        //Convert the primitive array into a Class array
        Double[] dArray1= ArrayUtils.toObject(array1);
        Double[] dArray2= null;
        Double[] dArray3=ArrayUtils.toObject(array3);
        values1.addAll(Arrays.asList(dArray1));
        //values2.addAll(Arrays.asList(dArray2));
        values3.addAll(Arrays.asList(dArray3));
    }

    @Test
    public void testList(){
        StatisticUtilsArrayListStream demo = new StatisticUtilsArrayListStream();

        assertEquals(8,demo.getMaxValue(values1),3);
        assertEquals(1,demo.getMinValue(values1),3);
        assertEquals(4.33,demo.getMeanValue(values1),3);
        assertEquals(4.5,demo.getMedianValue(values1),3);
        assertEquals(1,demo.getStdDevValue(values1),3);


        //assertEquals(8,demo.getMaxValue(values2),3);
        assertEquals(1,demo.getMinValue(values3),3);
    }


}
