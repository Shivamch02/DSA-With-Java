public class OOPS {
    public static void main(String[] args) {

        // Pen p1 = new Pen();
        // p1.setColor("blue");
        // p1.setTip(5);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        Queens q = new Queens();
        q.moves();
    }
}

// class Pen {
// private String color;
// private int tip;

// String getColor() {
// return this.color;

// }

// int getTip() {
// return this.tip;
// }

// void setColor(String newColor) {
// this.color = newColor;
// }

// void setTip(int newTip) {
// this.tip = newTip;
// }
// }

interface chessPlayer {
    void moves();
}

class Queens implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up,down, left, right");
    }
}