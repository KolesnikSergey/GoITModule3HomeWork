package files_pack;

/**
 * Created by kolesnik_s on 27.12.15.
 */
public class File {
    String name;
    byte data[];

    public File() {
    }

    public File(String name) {
        this.name = name;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
