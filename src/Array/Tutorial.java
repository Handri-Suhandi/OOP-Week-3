package Array;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        String[] matkulIF = {
                "Matematika Diskrit",
                "Dasar-Dasar Pemrograman",
                "Pemrograman Berorientasi Objek"
        };

        String[] matkulCE = {
                "Riset Operasi",
                "Jaringan Komputer",
                "Aljabar Linear"
        };

        String[] matkulIS = {
                "Sistem Database",
                "Administrasi Database"
        };

        System.out.println("Pilih Kategori Mata Kuliah : ");
        System.out.println("1. Informatics\n2. Computer Engineering\n3. Information System");
        System.out.println("Pilih : ");
        input = scanner.nextInt();

        switch(input) {
            case 1: System.out.println("Daftar Mata Kuliah IF :"); show(matkulIF); break;
            case 2: System.out.println("Daftar Mata Kuliah CE :"); show(matkulCE); break;
            case 3: System.out.println("Daftar Mata Kuliah SI :"); show(matkulIS); break;
            default: System.out.println("Pilihan tidak valid");
        }

    }

    public static void show(String[] matkul) {
        for(String eachmatkul : matkul) {
            System.out.println("- " + eachmatkul);
        }
    }

}