public class Application {
    public static void main(String[] args) {

        Product book = new Product(1, "Book", 10);
        Product ruler = new Product(2, "Ruler", 10.5);
        Product pen = new Product(3, "Pen", 1.00);

        Category category1 = new Category("Education");
        category1.addCategory(book);
        category1.addCategory(ruler);
        category1.addCategory(pen);

        Category category2 = new Category("Salon");
        Product vaseline = new Product(4, "Vaseline", 40);
        Product pinkLip = new Product(5,"PinkLip",30);
        category2.addCategory(vaseline);
        category2.addCategory(pinkLip);
        category2.addCategory(category1);


        category2.output();
    }

}
