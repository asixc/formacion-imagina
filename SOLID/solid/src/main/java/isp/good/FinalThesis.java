package isp.good;

public class FinalThesis implements FileDOCXExport, FilePDFExport{
    @Override
    public void exportDocx() {
        System.out.println("Im Doc!");
    }

    @Override
    public void exportPDF() {
        System.out.println("Im PDF!");
    }
}
