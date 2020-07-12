package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop;

public class RoomMain {

    public static void main(String[] args) {
        Room kitchen = new Room(2, 3);
        Room mainRoom = new Room(2, 3, 4.3);

        Room[] rooms = {kitchen, mainRoom};

        for (Room room : rooms) {
            System.out.println("Wymiary pokoju to " + room.getHeight() +
                    "x" + room.getLength() + "x" + room.getWidth());
            room.showSurface();
            room.showVolume();
        }
    }
}
