package p.adapterp;

public class Mp4player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
