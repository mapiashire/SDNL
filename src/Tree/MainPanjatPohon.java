package Tree;

import java.util.Scanner;

public class MainPanjatPohon {
    public static void main(String[] args) {
        Tree pohon = new Tree();
        pohon.add(42);
        pohon.add(21);
        pohon.add(38);
        pohon.add(27);
        pohon.add(71);
        pohon.add(82);
        pohon.add(55);
        pohon.add(63);
        pohon.add(6);
        pohon.add(2);
        pohon.add(40);
        pohon.add(12);
        TreeNode cari;

        Scanner aria = new Scanner(System.in);


        System.out.print("Preorder: ");
        pohon.preOrderTraversal();
        System.out.println();
        System.out.print("Inorder: ");
        pohon.inOrderTraversal();
        System.out.println();
        System.out.print("Postorder: ");
        pohon.postOrderTraversal();


//        do{
//            System.out.print("Masukkan data yang akan anda cari: ");
//            int data = aria.nextInt();
//            cari = pohon.getNode(data);
//            if (cari != null) {
//                System.out.println("Data ditemukan: " + cari.getData());
//            } else {
//                System.out.println("Data tidak ditemukan");
//            }
//            System.out.print("Apakah anda ingin mencari data lagi? (y/n): ");
//            String lagi = aria.next();
//            if (lagi.equalsIgnoreCase("n")) {
//                break;
//            }
//        } while (true);
    }
}
