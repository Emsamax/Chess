import java.util.ArrayList;

public class dataBase {
    public String path;
    public ArrayList<String> Base;

    public dataBase(String path, ArrayList<String> Base) {
        this.path = path;
        this.Base = Base;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<String> getBase() {
        return this.Base;
    }

    public void setBase(ArrayList<String> Base) {
        this.Base = Base;
    }

    public dataBase(String path) {
        this.path = path;
        this.Base = createDataBase();

    }

    public dataBase() {
        this.Base = createDataBase();
    }

    public ArrayList<String> createDataBase() {
        Base = new ArrayList<String>();
        for (int i = 1; i < 9; i++) {
            String str = Integer.toString(i);
            for (int j = 97; j < 105; j++)
                Base.add((char) j + str);
        }
        return Base;
    }

    public void printArray(ArrayList<String> Base) {
        for (int i = 0; i < Base.size(); i++) {
            System.out.print(Base.get(i) + "  ");
            if (i % 8 == 7 && i != 0) {
                System.out.println("");
            }
        }
    }
    // test
}