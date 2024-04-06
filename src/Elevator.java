public class Elevator {

    int currentFloor = 1;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void move(int floor) {
        if (floor > currentFloor) {
            for (int i = currentFloor; i < floor; i++) {
                moveUp();
                System.out.println("Этаж: " + getCurrentFloor());
            }
        } else if (floor < currentFloor) {
            for (int i = currentFloor; i > floor; i--) {
                moveDown();
                System.out.println("Этаж: " + getCurrentFloor());
            }
        }
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
        }
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor++;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
