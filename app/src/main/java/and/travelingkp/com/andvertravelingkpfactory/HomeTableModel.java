package and.travelingkp.com.andvertravelingkpfactory;

public class HomeTableModel {
    private String title;
    private String desc;
    private String date;
    private String imgUrl;

    public HomeTableModel(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public HomeTableModel(String title, String desc, String date) {
        this.title = title;
        this.desc = desc;
        this.date = date;
    }

    public HomeTableModel(String title, String desc, String date, String imgUrl) {
        this.title = title;
        this.desc = desc;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getDate() {
        return date;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
