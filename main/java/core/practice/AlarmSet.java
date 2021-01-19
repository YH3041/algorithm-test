package core.practice;

public class AlarmSet {

    public static void main(String[] args) {
        setAlarm(12, 30);
    }

    public static void setAlarm(int h, int m) {
        if (h >= 0 || h <= 23 && m >= 0 || m <= 59) {
                int transitionSecond = ((3600 * h) + (60 * m)) - 2700;
                m = transitionSecond / 60;
                h = m / 60;
                m = m % 60;
        } else {
            System.out.println("정해진 범위 안으로 숫자를 입력해주세요");
        }
        System.out.println(h + ":" + m);
    }
}
