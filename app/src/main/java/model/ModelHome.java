package model;

public class ModelHome {
    private static Integer image;
    private String text;
    private String data;


    public ModelHome(String text, String data, Integer image) {
        this.text = text;
        this.data = data;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
