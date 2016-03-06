public class fact_1to20 {

  public static void main(String[] args) {

    long factorials = 1;

    System.out.printf("%4s%30s\n", "Number", "Factorials");

   for (int counter = 1; counter <= 20;counter++, factorials *= counter) {
    System.out.printf("%4d%,30d\n", counter, factorials);
}

}
}
