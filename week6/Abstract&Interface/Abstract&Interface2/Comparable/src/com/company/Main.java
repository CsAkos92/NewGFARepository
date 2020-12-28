package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		ArrayList<Domino> dominos = new ArrayList<>();
		dominos.add(new Domino(2, 3));
		dominos.add(new Domino(5, 2));
		dominos.add(new Domino(4, 3));
		dominos.add(new Domino(2, 6));
		dominos.add(new Domino(6, 1));
		dominos.add(new Domino(5, 1));

		System.out.println(dominos);

		Collections.sort(dominos);

		System.out.println(dominos);


    }
}
