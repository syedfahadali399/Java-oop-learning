package labsession8;

interface Book {

    public void borrow();

    public void returnBook();
}

class FictionBook implements Book {

    @Override
    public void borrow() {
        System.out.println("Fiction Book has been borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("Fiction Book has been returned");
        
    }

}

class NonFictionBook implements Book {

    @Override
    public void borrow() {
        System.out.println("NonFiction Book has been borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("NonFiction Book has been returned");
        
    }

}

public class task1 {
    public static void main(String[] args) {
        
        FictionBook book1 = new FictionBook();
        NonFictionBook book2 = new NonFictionBook();

        book1.borrow();
        book1.returnBook();

        book2.borrow();
        book2.returnBook();
        
    }
}
