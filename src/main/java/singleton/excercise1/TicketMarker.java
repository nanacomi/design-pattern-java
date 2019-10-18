package singleton.excercise1;

public class TicketMarker {

    private static TicketMarker ticketMarker = new TicketMarker();

    private TicketMarker() {
        System.out.println("インスタンスを生成しました");
    }

    public static TicketMarker getInstance() {
        return ticketMarker;
    }

    private int ticket = 1000;

    // synchronized = 排他制御
    // 排他制御＝複数のプロセス（またはスレッド）が同時に入ることを防ぐこと
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
