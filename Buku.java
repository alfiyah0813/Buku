class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor
    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method to display book details
    public void displayDetails() {
        
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }

    public static void main(String[] args) { 
        // Creating 5 Buku objects
        Buku buku1 = new Buku(1, "Laskar Pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku(2, "Bumi Manusia", "Pramoedya Ananta Toer", 1980);
        Buku buku3 = new Buku(3, "Perahu Kertas", "Dee Lestari", 2009);
        Buku buku4 = new Buku(4, "Negeri 5 Menara", "Ahmad Fuadi", 2009);
        Buku buku5 = new Buku(5, "Ayat-Ayat Cinta", "Habiburrahman El Shirazy", 2004);

        // Displaying details of each book
        buku1.displayDetails();
        buku2.displayDetails();
        buku3.displayDetails();
        buku4.displayDetails();
        buku5.displayDetails();
    }
}
