package com.ghb.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by ghb on 2016/12/26.
 */
public class Java8Test {
    @Test
    public void streamApi(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("lala");
        strings.add("hhaha");
        strings.add("meme");
        long count = strings.stream().filter(name -> name.equals("lala")).count();

        List<String> collected = Stream.of("a","b","c").collect(Collectors.toList());
        List<String> toUpperCase = Stream.of("a","b","c").map(lowercase->lowercase.toUpperCase()).collect(Collectors.toList());

        assertEquals(asList("A","B","C"),toUpperCase);
        //System.out.println(count);
    }


}
