package labsession8;

interface EventListener {
    void onClick(String eventSource);
}

class Button {
    private EventListener listener;

    public Button(EventListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println("Button clicked!");
        if (listener != null) {
            listener.onClick("Button");
        }
    }
}

class UserAction implements EventListener {
    @Override
    public void onClick(String eventSource) {
        System.out.println("Handling click event from: " + eventSource);
    }
}

public class task6 {
    public static void main(String[] args) {

        UserAction userAction = new UserAction();

        Button button = new Button(userAction);

        button.click();
    }
}
