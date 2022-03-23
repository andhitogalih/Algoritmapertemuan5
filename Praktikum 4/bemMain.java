import java.util.Scanner;
class bemMain {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("      Pemilihan Ketua BEM                 ");
            System.out.println("==========================================");
            
            bem bem = new bem();
            bem[] bem2 = new bem[bem.jmlKandidat];
            for(int i=0; i<bem.jmlKandidat; i++){
                bem2[i] = new bem();
                System.out.print("Nama Kandidat ke-"+(i+1)+" : ");
                bem2[i].nkandidat = sc.nextLine();
            }
            
            System.out.println("==========================================");
            for(int i=0; i<bem.jmlKandidat; i++){
                System.out.print("Masukkan Jumlah Suara Kandidat ke-"+(i+1)+" : ");
                bem2[i].vote = sc.nextInt();
                bem.jmlVote += bem2[i].vote;
            }
            
            System.out.println("==========================================");
            int hasil = bem.hitungHasil(bem.jmlVote, bem2[0].vote, bem2[1].vote, bem2[2].vote, bem2[3].vote); 
            if(hasil==0){
                System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
            }else{
                System.out.println("Ketua BEM yang terpilih adalah "+bem2[hasil-1].nkandidat);
            }
        }
    }
