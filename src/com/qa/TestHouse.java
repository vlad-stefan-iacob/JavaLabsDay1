package com.qa;

public class TestHouse {
    public static void main(String[] args) {
        String[] arr ={"Bedroom", "Living room", "Bathroom"};
        House h1 = new House(arr, 100000, "Martin", 1, "Romania");
        House h2 = new House(arr, 150000, "Dave", 2, "UK");
        House h3 = new House(arr, 200000, "Luke", 3, "USA");

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        House[] houseArray = new House[3];

        houseArray[0] = h1;
        houseArray[1] = h2;
        houseArray[2] = h3;

        for (int x = 0; x < houseArray.length; x++)
            System.out.println(houseArray[x]);
    }


}
