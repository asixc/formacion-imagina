package isp.good;

public class EarningsReport implements FileCSVExport{
    @Override
    public void exportCSV() {
        System.out.println("Earnings in CSV!");
    }
}
