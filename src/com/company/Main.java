package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int[] a = {10, 15, 20, 25};
        int[] b = new int[10];

        for(int i = 0; i<b.length; i++){
            b[i] = i;
            //System.out.print(b[i] + "\t");
        }

        for(int val:b){
            System.out.print(val + "\t");
        }

        System.out.println();

        int i = 0;
        while(i < b.length){
            System.out.print(b[i] + "\t");
            i++;
        }

        System.out.println();

        i = 0;
        do {
            System.out.print(b[i] + "\t");
            i++;
        }while (i < b.length);

        for(i = 1; i <= 10; i++){
            System.out.print(1/i + "\t");
        }*/

        Shape shape = new Shape( 100, new Point[]{new Point(), new Point(), new Point()});
        /*shape.color = 100;
        shape.trial = new Point[3];*/
        shape.setColor(100);
        System.out.println(shape);

        BoundaryBox boundary = new BoundaryBox(shape);
        System.out.println(boundary);

    }
}
