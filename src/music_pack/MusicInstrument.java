package music_pack;

/**
 * Created by kolesnik_s on 27.12.15.
 */
public class MusicInstrument {
    String name;

    public MusicInstrument() {
    }

    public MusicInstrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Guitar extends MusicInstrument {
    public Guitar() {
        super("Guitar");
    }
}

public class Trumpet extends MusicInstrument {
    public Trumpet() {
        super("Trumpet");
    }
}

public class Piano extends MusicInstrument {
    public Piano() {
        super("Piano");
    }
}

public class MusicStore {
    MusicInstrument instrument[];

    public MusicStore() {
    }

    public MusicInstrument[] getInstrument() {
        return instrument;
    }

    public void setInstrument(MusicInstrument[] instrument) {
        this.instrument = instrument;
    }
}