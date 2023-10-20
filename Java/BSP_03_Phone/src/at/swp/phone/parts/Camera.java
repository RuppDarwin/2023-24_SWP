package at.swp.phone.parts;

public class Camera {
    private String resolution;
    public String getResolution() {
        return resolution;
    }
    public String takePicture() {
        return "Bild wurde mit einer Auflösung von " + resolution + " aufgenommen.";
    }
}
