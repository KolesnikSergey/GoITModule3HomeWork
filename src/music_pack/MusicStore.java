package music_pack;

/**
 * Created by kolesnik_s on 27.12.15.
 */
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
