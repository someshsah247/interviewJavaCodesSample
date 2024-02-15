package com.learn.basics.interview;


    public class ABC {
        public static void main(String[] args) {
            int[] array = new int[]{1, 2, 3, 4,6};
            int[] evens = getOdds(array);
            System.out.println(evens[0] + " " + evens[1]);
        }

        // NOTE -- if koi bhi if or else block execute ho jaye ga to fir next itration se code chale ga

        public static int[] getOdds(int[] array) {
            int evenOne = 0;
            int evenSecond = 0;

            for (int i = 0; i < array.length; ++i) {

                if (evenOne == 0 && array[i] % 2 == 0) {
                    evenOne = array[i];
                }
                else if (evenSecond == 0 && array[i] % 2 == 0) {
                    evenSecond = array[i];
                }
                else if (evenOne != 0 && evenSecond != 0) {
                    return new int[]{evenSecond, evenOne};
                }
            }
            return new int[]{evenOne, evenSecond};

        }

    }

