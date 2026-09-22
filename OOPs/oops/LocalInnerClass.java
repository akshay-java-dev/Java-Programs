public class LocalInnerClass {

    void display() {

        class Message {

            void show() {
                System.out.println(
                    "Hello from Local Inner Class"
                );
            }
        }

        Message message = new Message();

        message.show();
    }

    public static void main(String[] args) {

        LocalInnerClass obj =
                new LocalInnerClass();

        obj.display();
    }
}
