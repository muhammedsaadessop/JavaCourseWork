
public class Main {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();

        Message msg1 = new Message("Alice", "Hello!");
        Message msg2 = new Message("Bob",
                "This is a longer message that should still be added because it is less than 280 characters.");
        Message msg3 = new Message("Charlie",
                "This is a really long message that should not be added because it exceeds the 280 characters limit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum efficitur, nulla ut bibendum suscipit, libero lectus auctor est, ac facilisis eros odio in justo. Nullam vel venenatis justo, a posuere odio. Fusce sit amet nibh at tortor.");

        service.add(msg1);
        service.add(msg2);
        service.add(msg3);

        for (Message message : service.getMessages()) {
            System.out.println(message.getSender() + ": " + message.getContent());
        }
    }
}
