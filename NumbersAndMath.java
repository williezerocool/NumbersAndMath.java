/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersandmath;

/**
 *
 * @author kendrabooker
 */
public class NumbersAndMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //outputs a string
        System.out.println( "I will now count my chickens:" );
        //does the math then adds it to string
        System.out.println( "Hens " + (25.0 + 30.0 / 6.0) );
        //does the math then adds it to string
        System.out.println( "Roosters " + (100.0 - 25.0 * 3.0 % 4.0) );
        //outputs string 
        System.out.println( "Now I will count the eggs:" );
        //does the math
        System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
        //outputs string
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        //does the math
        System.out.println( 3 + 2 < 5 - 7 );
        //does math and adds it to string
        System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
        System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
        //outputs string
        System.out.println( "oh, that's why it's false." );
        //outputs string
        System.out.println( "How about some more." );
        //determines if the expression is true or false then adds the boolean to the string
        System.out.println( "Is it greater? " + ( 5.0 > -2.0) );
        System.out.println( "Is it greater or equal? " + (5.0 >= -2.0) );
        System.out.println( "Is it less or equal? " + (5.0 <= -2.0) );
    }
    
}
