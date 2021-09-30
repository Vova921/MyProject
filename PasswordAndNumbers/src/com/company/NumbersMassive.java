package com.company;

import java.util.Scanner;

public class NumbersMassive {
    public static void main(String []args){
Numbers num_1 = new Numbers();
num_1.num1();
    }
}
class Numbers{
    void num1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Виберіть кількість цілих чисел для введення: ");
        int n = in.nextInt();
        System.out.println("0 не враховується!!!");

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Введіть ціле число: ");
            int num = in.nextInt();
            nums[i] = num;
        }

        System.out.print("Цілі числа: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        System.out.println();

        int nums1[] = new int[n];
        int nums2[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums1[i] = nums[i];
            } else if (nums[i] % 2 != 0) {
                nums2[i] = nums[i];
            }
        }
        System.out.println("Парні числа: ");
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0)
                System.out.print(nums1[i] + " ");
        }
        System.out.println("\nНепарні числа: ");
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != 0)
                System.out.print(nums2[i] + " ");
        }
        System.out.println();
        System.out.println();

        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < temp) {
                temp = nums[i];
            }
        }
        System.out.println("Мінімальне значення: " + temp);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
            }
        }
        System.out.println("Максимальне значення: " + temp);
        System.out.println();

        int nums3[] = new int[n];
        int nums4[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                nums3[i] = nums[i];
            } else if (nums[i] % 3 != 0) {
                nums4[i] = nums[i];
            }
        }
        System.out.println("Числа кратні 3: ");
        for (int i = 0; i < nums3.length; i++) {
            if (nums3[i] != 0)
                System.out.print(nums3[i] + " ");
        }
        System.out.println("\nЧисла некратні 3: ");
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] != 0)
                System.out.print(nums4[i] + " ");
        }
        System.out.println();
        System.out.println();

        int nums5[] = new int[n];
        int nums6[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 0 && nums[i] % 7 == 0) {
                nums5[i] = nums[i];
            } else if (nums[i] % 5 != 0 && nums[i] % 7 != 0) {
                nums6[i] = nums[i];
            }
        }
        System.out.println("Числа кратні 5 і 7: ");
        for (int i = 0; i < nums5.length; i++) {
            if (nums5[i] != 0)
                System.out.print(nums5[i] + " ");
        }
        System.out.println("\nЧисла некратні 5 і 7: ");
        for (int i = 0; i < nums6.length; i++) {
            if (nums6[i] != 0)
                System.out.print(nums6[i] + " ");
        }
        System.out.println();
        System.out.println();

        int nums7[] = new int[n];
        int num, num1, num2, num3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 100 > 0 && nums[i] / 100 < 10) {
                num1 = nums[i] / 100;
                num = nums[i] % 100;
                num2 = num / 10;
                num3 = num % 10;
                if (num1 != num2 && num1 != num3 && num2 != num3) {
                    nums7[i] = nums[i];
                }
            }
        }
        System.out.println("Трьохзначні числа без однакових цифр: ");
        for (int i = 0; i < nums7.length; i++) {
            if (nums7[i] != 0)
                System.out.print(nums7[i] + " ");
        }
        System.out.println();
        System.out.println();

        int nums8[] = new int[n];
        int nums9[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1) {
                for (int j = 2; j < nums[i]; j++) {
                    if (nums[i] % j == 0) {
                        nums9[i] = nums[i];
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1 && nums9[i] != nums[i]) {
                nums8[i] = nums[i];
            }
        }
        System.out.println("Прості числа: ");
        for (int i = 0; i < nums8.length; i++) {
            if (nums8[i] != 0)
                System.out.print(nums8[i] + " ");
        }
    }
}
