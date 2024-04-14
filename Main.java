public class Main {
public static void main(String[] args) {
User guest1 = new User("lsobota@gmail.com");
User guest2 = new User("miki@gmail.com");
User user1 = new User("Adam","Dzewiecki","drzewo@gmail.com","drzewo11");
guest2.guestToUser("Miki","Galecki","24513");

Product p1 = new Product("Milk", 10, "100090392", 2);
Product p2 = new Product("Water", 2, "2347586");
Product p3 = new Product("Bar", 3, "347654738", 10);
p2.changePrice(3);
p3.changeNumOfPieces(15);

}
}
