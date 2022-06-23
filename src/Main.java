public class Main {
    public static void main(String[] args) {
       //taksimetre programı:

        double gidilenKM,tutar, minOdenecek,baslangıcUcretı, odnecekNetTutar;

        Scanner girdi = new Scanner(System.in);

        System.out.print("gidilen km = " );
        gidilenKM = girdi.nextDouble();

        tutar = gidilenKM *  2.20;
        minOdenecek =20;
        baslangıcUcretı = 10;
        odnecekNetTutar = tutar+baslangıcUcretı;

        boolean sonuc= (tutar>20);
        double son = sonuc ? odnecekNetTutar:minOdenecek;
        System.out.println("km basina odenecek tutar = 2.20");
        System.out.println("gidilen kilometre= "+gidilenKM);
        System.out.println("baslangic ucreti= "+baslangıcUcretı);
        System.out.println("odenecek tutar=  "+ son);
    }
}
