package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs     : \"Terima kasih pak\"");
                System.out.println("Dosen     : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs     : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen     : \"!@#$% KADA SADAR DIRI NH SDH KADA BELAJAR HANDAK DAPAT A\"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen     : \"Tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs     : \"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs     : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen     : \"Bujur jua kah?\"");
                System.out.println("Dosen     : \"*Memeriksa berkas\"");
                System.out.println("Dosen     : \"*Menceleng\"");
                System.out.println("Mhs     : \"Kabur..\"");
                break;
        }
    }
}