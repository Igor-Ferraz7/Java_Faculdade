package lista_ex7.ex2;

public class MainBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setTitle("Bk1");
        b2.setTitle("Bk2");

        b1.setAuthor("BA1");
        b2.setAuthor("BA2");

        b1.setNumber(1);
        b2.setNumber(2);

        b1.setPagNums(345);
        b2.setPagNums(455);

        b1.showDataBook(b1.getTitle(), b1.getAuthor(), b1.getNumber(), b1.getPagNums());
        System.out.println();
        b2.showDataBook(b2.getTitle(), b2.getAuthor(), b2.getNumber(), b2.getPagNums());
    }

}
