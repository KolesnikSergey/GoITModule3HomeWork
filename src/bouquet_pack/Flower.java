package bouquet_pack;

/**
 * Created by kolesnik_s on 27.12.15.
 */
public class Flower {

    String name;

    public Flower() {
    }

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Aster extends Flower{
    public Aster() {
        super("Aster");
    }
}

public class Tulip extends Flower {
    public Tulip() {
        super("Tulip");
    }
}

public class Сhamomile extends Flower{
    public Сhamomile() {
        super("Сhamomile");
    }
}

public class Rose extends Flower {
    public Rose() {
        super("Rose");
    }
}

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
