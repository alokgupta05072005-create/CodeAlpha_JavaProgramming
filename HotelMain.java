import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));

        while (true) {
            System.out.println("\n--- HOTEL RESERVATION SYSTEM ---");
            System.out.println("1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                for (Room room : rooms) {
                    System.out.println("Room No: " + room.roomNumber +
                            ", Type: " + room.roomType +
                            ", Booked: " + room.isBooked);
                }
            }

            else if (choice == 2) {
                System.out.print("Enter Room Number to Book: ");
                int roomNo = sc.nextInt();

                boolean found = false;

                for (Room room : rooms) {
                    if (room.roomNumber == roomNo) {
                        found = true;

                        if (!room.isBooked) {
                            room.isBooked = true;
                            System.out.println("Room booked successfully!");
                        } else {
                            System.out.println("Room already booked!");
                        }
                    }
                }

                if (!found) {
                    System.out.println("Room not found!");
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}