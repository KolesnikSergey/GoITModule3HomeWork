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

public class AudioFile extends File {
    public AudioFile(String name) {
        super(name);
    }
}

public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }
}

public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }
}

public class Directory {
    File files[];

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }
}