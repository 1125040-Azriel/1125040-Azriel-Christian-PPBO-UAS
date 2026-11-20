package azriel.christian.ppbo.uas.view;

import java.util.ArrayList;

import azriel.christian.ppbo.uas.model.G0bjectForm;

public class formview {
    private List<T> G0bject;
    protected Scanner scanner;

    public FormView (Scanner scanner) {
        this.records = new ArrayList<>();
        this.scanner = scanner;
    }

    protected abstract double HitungLuas();
    protected abstract double hitungKeliling();
    protected abstract double hitungLuasPermukaan();
    protected abstract double hitungVolume();
}

public abstract class lvl2 extends G0bjectForm {

}


public static void printG0bjectDetail {
    
}