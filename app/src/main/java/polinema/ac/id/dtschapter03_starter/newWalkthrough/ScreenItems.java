package polinema.ac.id.dtschapter03_starter.newWalkthrough;

public class ScreenItems {

    String Tittle, Description;
    int ScreenImg, Foreground;

    public ScreenItems(String tittle, String description, int screenImg, int foreground){
        Tittle = tittle;
        Description = description;
        ScreenImg = screenImg;
        Foreground = foreground;
    }

    public int getForeground() {
        return Foreground;
    }

    public void setForeground(int foreground) {
        this.Foreground = foreground;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
