/**
 * Created by kolesnik_s on 27.12.15.
 */
public abstract class Flower {

    private String name;

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

class Aster extends Flower{
    public Aster() {
        super("Aster");
    }
}

class Tulip extends Flower {
    public Tulip() {
        super("Tulip");
    }
}

class Сhamomile extends Flower{
    public Сhamomile() {
        super("Сhamomile");
    }
}

class Rose extends Flower {
    public Rose() {
        super("Rose");
    }
}

class ShrubRoses {
    private Rose shrub[];

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
