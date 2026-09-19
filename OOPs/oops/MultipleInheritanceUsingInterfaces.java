interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

public class MultipleInheritanceUsingInterfaces
        implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    public static void main(String[] args) {

        MultipleInheritanceUsingInterfaces phone =
                new MultipleInheritanceUsingInterfaces();

        phone.takePhoto();
        phone.playMusic();
    }
}
