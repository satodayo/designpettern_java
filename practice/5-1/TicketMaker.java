public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker(); 
    private int ticket = 1000;

    private TicketMaker(){}

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

}
