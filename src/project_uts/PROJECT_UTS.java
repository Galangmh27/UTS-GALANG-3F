//NAMA  : GALANG MULQIA HAKIKI
//NIM   : 21040114
//KELAS : 3F TEKNIK KOMPUTER
package project_uts;
import project_uts.DESAIN.Biodata;

public class PROJECT_UTS {

    public static void main(String[] args) {
        Biodata data = new Biodata();
        data.setNama("Galang Mulqia Hakiki");
        data.setKls("3F");
        data.setJurusan("D3 Teknik Komputer");
        System.out.println("Nama    : " + data.getNama() );
        System.out.println("Jurusan : " + data.getJurusan() );
    }
    
}
