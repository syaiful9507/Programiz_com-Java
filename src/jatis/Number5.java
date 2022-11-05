package jatis;

public class Number5 {


    public static void main(String[] args) {
        Sepeda Sepeda = new Sepeda();
        Sepeda.akselerasi("Swoosh");
        Sepeda.rantai("s");

    }
}
class Kendaraan {
    String suara;
    void akselerasi(String suara){
        System.out.println(suara);
    }
}

class Sepeda extends Kendaraan {
    String rantai = "Normal";

    @Override
    void akselerasi(String suara) {
        super.akselerasi(suara);
    }
    void rantai(String rantai) {
        rantai = this.rantai;
        System.out.println(rantai);
    }
}
class Mobil extends Kendaraan {
    String bensin = "Penuh";

    @Override
    void akselerasi(String suara) {
        super.akselerasi(suara);
        //System.out.println(bensin);
    }
}
