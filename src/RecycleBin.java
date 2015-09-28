/**
 * Created by user on 9/18/15.
 * RecycleBin  class
 */
public class RecycleBin {
    private boolean isEmpty;
    private String coordinate;

    public RecycleBin(String coordinate) {

        this.isEmpty = true;
        this.coordinate = coordinate;
    }

    public String getCoordinate() {

        return coordinate;
    }

    public synchronized boolean isEmpty() {

        return isEmpty;
    }

    /**
     * Set isEmpty flag for current recycleBin.
     *
     * @param  empty boolean flag
     * @see         RecycleBin
     */
    public synchronized void setEmpty(boolean empty) {

        this.isEmpty = empty;
    }

}
