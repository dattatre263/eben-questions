/**
 * Created by dparupud on 7/19/15.
 */
package org.datta;
public class Question3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        necessary();
        sufficient();

    }

    /**
     * A Bed is necessary for a HotelRoom and a HotelRoom
     * cannot exists without a Bed.
     */
    private static void necessary() {
        final HotelRoom possibleRoom = new HotelRoom(new Bed());
        assert possibleRoom.getBed() != null;
        //Throws an assertion error
        try {
            HotelRoom impossibleRoom = new HotelRoom(null);
        } catch (AssertionError e) {
            System.err.println("A HotelRoom cannot exist without a bed");
            throw e;
        }
    }


    /**
     * The minimum requirement for a Hotel to exist is at least a Bed.
     * A television is only optional and so not part of the constructor.
     *
     * Therefore a Bed is sufficient for a Hotelroom to exist.
     */
    private static void sufficient() {
        final HotelRoom possibleRoom = new HotelRoom(new Bed());
        possibleRoom.setTelivision(null);
    }



    private static class HotelRoom {
        private final Bed bed;
        private Television telivision ;
        public HotelRoom(final Bed bed){
            //Bed cannot be null
            assert bed !=null;
            this.bed = bed;
        }

        public Bed getBed(){
            return bed;
        }

        public Television getTelivision() {
            return telivision;
        }

        public void setTelivision(Television telivision) {
            this.telivision = telivision;
        }
    }

    private static class Bed {
    }

    private static class Television {
    }
}
