public class matriz {

        public static void main(String[] args){

            String [][] MAT=new String[3][3];

            MAT[0][0]="0";
            MAT[0][1]="0";
            MAT[0][2]="0";

            MAT[1][0]="0";
            MAT[1][1]="0";
            MAT[1][2]="0";

            MAT[2][0]="0";
            MAT[2][1]="0";
            MAT[2][2]="0";

            for(int i=0;i<MAT.length;i++){
                for(int j=0;j<MAT.length;j++){
                    System.out. println("Posicion i="+i+" j="+j+" = "+MAT[i][j]);
                }
            }
        }
    }

