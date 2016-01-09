/**
 * Created by kolesnik_s on 27.12.15.
 */
public abstract class File {
    private String name;
    private byte data[];

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

class AudioFile extends File {
    public AudioFile(String name) {
        super(name);
    }
}

class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }
}

class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }
}

class Directory {
    private File files[];

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }
}