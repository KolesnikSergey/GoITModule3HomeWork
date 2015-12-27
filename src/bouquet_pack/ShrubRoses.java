package bouquet_pack;

/**
 * Created by kolesnik_s on 27.12.15.
 */
public class ShrubRoses {
    Rose shrub[];

    public ShrubRoses() {
    }

    public ShrubRoses(Rose[] shrub) {
        this.shrub = shrub;
    }

    public Rose[] getShrub() {
        return shrub;
    }

    public void setShrub(Rose[] shrub) {
        this.shrub = shrub;
    }
}
