package com.testing.trycatchtable;

import java.util.Scanner;

/**
 * Created by Pinq on 2017-05-15.
 */
public class Table {

    public int i = 0;
    public int table[] = new int[6];

    public int[] makeTable()
    {
        for (i = 0; i < table.length; i++)
        {
            table[i] = i +1;
        }
        return table;
    }

    public void testTable()
    {
        Scanner odczyt = new Scanner(System.in);

        //System.out.println(table[i]);

        try
        {
            System.out.println("Podaj numer indeksu:");
            i = odczyt.nextInt();
            System.out.println(table[i]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: " + table.length);
        }
    }

}

