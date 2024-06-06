package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest{
    public static void main(String[] args){
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 199);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 143);
        anOrder.addMedia(dvd2);

        Book book1 = new Book("Java for Beginners", "Education", 123, 1244);
        anOrder.addMedia(book1);

        CompactDisc cd1 = new CompactDisc("New Year", "Music", "Various Artists","No", 1223, 153);
        anOrder.addMedia(cd1);

        anOrder.orderedItems();
        anOrder.searchByTitle("The Lion King");
    }
}
