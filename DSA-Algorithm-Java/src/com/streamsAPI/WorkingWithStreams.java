package com.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkingWithStreams {
    public static void main(String[] args) {
//        //ways1
//        List<String> names = List.of("Hrithik","Alex","Zara");
//        Stream<String> stream = names.stream();
//
//        //way2
//        Stream<String> namesString = Stream.of("Hrithik","Alex","Zara");
//
//        //way 3
//        //normal array  here we cannot directly invoke stream on []
//        String[] namesArray = {};
//        //this why we use Arrays.stream()
//        Arrays.stream(namesArray);
//
//        //intermediate,terminal
//        long count = namesString
//                .map(null).sorted(null).dropWhile(null)
//                .count();
//        System.out.println(count);



        //1. Find people aged less or equal 18
        //2. Then change implementation to find first 10 people
        /*
        List<Person> people = Data.getPeople();
        List<Person> youngs = people.stream()
                .filter(p -> p.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

         youngs.forEach(System.out::println);
         */

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );


            threeHighCaloricNames(menu);


    }

    public static void threeHighCaloricNames(List<Dish> menu) {
        List<String> threeHighCaloricDishName =
                menu.stream().filter(dish -> dish.getCalories() > 230)
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(getCalolicNames(menu));
    }

    public static List<String> getCalolicNames(List<Dish> menu){
        List<String> dishesName = menu.stream().filter(dish -> {
                    System.out.println("filtering calroic " + dish.getName());
                    return dish.getCalories() > 230;
                }).map(d -> {
                    System.out.println("filtering" + d.getName());
                    return d.getName();
                }).limit(3)
                .collect(Collectors.toList());
        return dishesName;

    }



    /*
    menu.stream().filter(d -> d.getType == Dish.Type.Meat).limit(2).collect(toList())

Stream<Integer> wordLengths= words.stream().map(String::length).collect(toList())

Stream<Integer> dishNameLengths = menu.stream().map(Dish::getName).map(String::length).collect(toList())

words.stream().map(word -> word.split("")).distinct().collect(toList());
//{hello,world}
words.stream().map(w -> w.split("")).flatmap(Arrays::Stream).distinct().collectors(toList());

5.2
List<Integer> = num.stream().map(n -> n * n).collect(toList());

num1 =[1,2,3]
num2 =[3,4]

num1.stream().flat(n1-> num2.stream().map(n2 -> new int[]{n1,n2})).collect(toList())

num1.stream().flatmap(n1-> num2.stream().filter(n2 -> (n1 + n2) % 3 == 0).map(n2 -> new int[]{n1,n2})).collect(toList())


     */

}
