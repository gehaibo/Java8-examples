package com.ghb.test.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ghb on 2016/12/26.
 */
public class Question3 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, element) -> acc + element);
    }

    public static List<String> getNameAndCountry(List<Artist> artists) {

        return artists.stream()
                .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                .collect(Collectors.toList());
    }

    public static List<Album> getAlbumLists(List<Album> input) {

        return input.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(Collectors.toList());
    }

    public static int getLowerCase(String number){

        return (int) number.chars()
                .filter(Character::isLowerCase)
                .count();

    }
}
