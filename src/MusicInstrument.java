/**
 * Created by kolesnik_s on 27.12.15.
 */
public abstract class MusicInstrument {
    private String name;

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

class Guitar extends MusicInstrument {
    public Guitar() {
        super("Guitar");
    }
}

class Trumpet extends MusicInstrument {
    public Trumpet() {
        super("Trumpet");
    }
}

class Piano extends MusicInstrument {
    public Piano() {
        super("Piano");
    }
}

class MusicStore {
    private MusicInstrument instrument[];

    public MusicStore() {
    }

    public MusicInstrument[] getInstrument() {
        return instrument;
    }

    public void setInstrument(MusicInstrument[] instrument) {
        this.instrument = instrument;
    }
}