class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    boolean getisPowerOn() {
        return isPowerOn;
    }

    void setisPowerON() {
        isPowerOn = !isPowerOn;
    }

    int getChannel() {
        return channel;
    }

    void setChannel(int newChannel) {
        prevChannel = channel;
        channel = newChannel;
    }

    int getVolume() {
        return volume;
    }

    void setVolume(int newVolume) {
        volume = newVolume;
    }

    void gotoPrevChannel() {
        channel = prevChannel;
    }

}

public class Exercise7_10 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}