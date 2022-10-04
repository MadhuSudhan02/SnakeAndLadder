public class RollingDice {
    public static void main(String[] args) {
        RollingDice a = new RollingDice();
        a.rollDie();

    }
    public void rollDie(){
        int die = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Die value is " + die);
    }
    }

