package Array;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = sc.nextLine();

        System.out.println("--------------------------------");
        System.out.println("String anda : " + nama);

        System.out.printf("%-20s%s%n", "1.  charAt", "2.  length");
        System.out.printf("%-20s%s%n", "3.  substring(n)", "4.  substring(m,n)");
        System.out.printf("%-20s%s%n", "5.  contains", "6.  concat");
        System.out.printf("%-20s%s%n", "7.  replace", "8.  split");
        System.out.printf("%-20s%s%n", "9.  lowerCase", "10. upperCase");

        System.out.print("Pilih menu : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Masukkan indeks: ");
                int idx = sc.nextInt();
                if (idx >= 0 && idx < nama.length()) {
                    System.out.println("charAt(" + idx + ") = " + nama.charAt(idx));
                } else {
                    System.out.println("Indeks tidak valid!");
                }
                break;
            case 2:
                System.out.println("Panjang string = " + nama.length());
                break;
            case 3:
                System.out.print("Masukkan indeks n: ");
                int n = sc.nextInt();
                if (n >= 0 && n < nama.length()) {
                    System.out.println("substring(" + n + ") = " + nama.substring(n));
                } else {
                    System.out.println("Indeks tidak valid!");
                }
                break;
            case 4:
                System.out.print("Masukkan indeks m: ");
                int m = sc.nextInt();
                System.out.print("Masukkan indeks n: ");
                int nn = sc.nextInt();
                if (m >= 0 && nn <= nama.length() && m < nn) {
                    System.out.println("substring(" + m + "," + nn + ") = " + nama.substring(m, nn));
                } else {
                    System.out.println("Indeks tidak valid!");
                }
                break;
            case 5:
                System.out.print("Masukkan kata yang ingin dicek: ");
                String kata = sc.nextLine();
                System.out.println("Mengandung \"" + kata + "\"? " + nama.contains(kata));
                break;
            case 6:
                System.out.print("Masukkan string tambahan: ");
                String tambahan = sc.nextLine();
                System.out.println("Hasil concat = " + nama.concat(tambahan));
                break;
            case 7:
                System.out.print("Masukkan karakter/substring lama: ");
                String lama = sc.nextLine();
                System.out.print("Masukkan karakter/substring baru: ");
                String baru = sc.nextLine();
                System.out.println("Hasil replace = " + nama.replace(lama, baru));
                break;
            case 8:
                System.out.print("Masukkan delimiter pemisah: ");
                String delim = sc.nextLine();
                String[] parts = nama.split(delim);
                System.out.println("Hasil split:");
                for (String part : parts) {
                    System.out.println(part);
                }
                break;
            case 9:
                System.out.println("lowerCase = " + nama.toLowerCase());
                break;
            case 10:
                System.out.println("upperCase = " + nama.toUpperCase());
                break;
            default:
                System.out.println("Menu tidak valid!");
        }
    }
}
