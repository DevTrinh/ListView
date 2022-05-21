package trinhmanhdiv.LV_Advanced.listviewadvanced;

public class Fruit {
    private String name;
    private String describe;
    private int    iv_image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getIv_image() {
        return iv_image;
    }

    public void setIv_image(int iv_image) {
        this.iv_image = iv_image;
    }

    public Fruit(){

    }

    public Fruit(String name, String describe, int iv_image){
        this.name     = name;
        this.describe = describe;
        this.iv_image = iv_image;
    }
}
