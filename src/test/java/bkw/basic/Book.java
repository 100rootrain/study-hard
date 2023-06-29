package bkw.basic;

public class Book {
    String title;
    int price;

    public Book() {
        this("미입력", -1);
    }

    public Book(String title) {
        this(title, 0);

    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void showPrice(){
        System.out.println(title+"의 가격은" + price + "원 입니다.");
    }

//    public class HelloWorld{
        public static void main(String[] args){
            Book b1 = new Book();
            Book b2 = new Book("비매품");
            Book b3 = new Book("국어책",3000);

            b1.showPrice();
            b2.showPrice();
            b3.showPrice();
        }

//    }

}
