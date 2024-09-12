package Tree;

public class MainPanjatPohon {
    public static void main(String[] args) {
        Tree pohon = new Tree();
        pohon.add(50);
        pohon.add(25);
        pohon.add(75);
        TreeNode nemu = pohon.getNode(25);
        if (nemu != null) {
            System.out.println("Data ditemukan: " + nemu.getData());
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
