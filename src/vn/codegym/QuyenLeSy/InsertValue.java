package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class InsertValue {

    Scanner scanner = new Scanner(System.in);
    int value, index, n;
    int[] array = new int[100];

    public static void main(String[] args) {
        InsertValue insertValue = new InsertValue();
        Input(insertValue);
        Output(insertValue);
    }

    public static void Input(InsertValue insertValue) {
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        insertValue.n = insertValue.scanner.nextInt();
        insertValue.array = new int[insertValue.n + 1];
        insertValue.array[insertValue.n] = 0;

        System.out.println("Nhập các giá các phẩn tử của mảng: ");
        for (int i = 0; i < insertValue.n; i++) {
            System.out.print("array[" + i + "]= ");
            insertValue.array[i] = insertValue.scanner.nextInt();
        }

        System.out.print("Nhập vào phần tử cần chèn: ");
        insertValue.value = insertValue.scanner.nextInt();

        System.out.print("Nhập vào vị trí chèn: ");
        insertValue.index = insertValue.scanner.nextInt();

        System.out.println("Các phẩn tử mảng trước khi chèn là:");
        for (int i = 0; i < insertValue.array.length - 1; i++) {
            System.out.printf("%5d", insertValue.array[i]);
        }
    }

    public static void Output(InsertValue insertValue) {
        if (insertValue.index > (insertValue.array.length) || insertValue.index < 0) {
            System.out.print("Vị trí chèn vướt giới hạn!");
        } else {
            for (int i = insertValue.array.length - 1; i >= insertValue.index - 1; i--) {
                if (i == insertValue.index - 1) {
                    insertValue.array[i] = insertValue.value;
                } else {
                    insertValue.array[i] = insertValue.array[i - 1];
                }
            }
            System.out.println("\nDanh sách phẩn tử sau khi chèn vào là: ");

            for (int i = 0; i < insertValue.array.length; i++) {
                System.out.printf("%5d", insertValue.array[i]);
            }
        }
    }
}