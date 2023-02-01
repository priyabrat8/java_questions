public class Patterns {
    public static void main(String args[]) {
        int m = 5 , n = 4, number = 1 ;
//        1.Solid Rectangle
//        *****
//        *****
//        *****
//        *****

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        2.Hollow Rectangle
//        *****
//        *   *
//        *   *
//        *****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j==1 || i == n || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        3. Half Pyramid
//        *
//        **
//        ***
//        ****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        4. Inverted Half Pyramid
//        ****
//        ***
//        **
//        *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        5. Inverted and Rotated Half Pyramid
//            *
//           **
//          ***
//         ****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        6. Half Pyramid With Number
//        1
//        12
//        123
//        1234
//        12345

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

//        7. Inverted Half Pyramid With Numbers
//        12345
//        1234
//        123
//        12
//        1

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

//        8. Floyd's Triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

//        9.  0-1 Triangle
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

//        10. Butterfly Pattern (n=4)
//        *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (n-i) * 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (n-i) * 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

//        11. Solid Rhombus
//            *****
//           *****
//          *****
//         *****
//        *****

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= m-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

//        12. Number Pyramid
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

//        13. Palindromic Pyramid
//         1
//        212
//       32123
//      4321234
//     543212345
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

//        14. Diamond Pattern

//               *
//              ***
//             *****
//            *******
//            *******
//             *****
//              ***
//               *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        15. Hollow Rhombus
//            *****
//           *   *
//          *   *
//         *   *
//        *****

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= m-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1  || j== m || i == m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

//        16.


    }
}
