package urokijava;

public class Massives {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=31;
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=30;
        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]= 30;
        month_days[11]= 31;

        System.out.println("В Dekabre " + month_days[11] + " дней");

        int month_days1[] = {31,28,31};
        System.out.println(month_days1[2]);

        int twoD[][]=new int[3][3];
        twoD[0][0]=1;
        twoD[0][1]=2;
        twoD[0][2]=3;
        twoD[1][0]=4;
        twoD[1][1]=5;
        twoD[1][2]=6;
        twoD[2][0]=7;
        twoD[2][1]=8;
        twoD[2][2]=9;
        System.out.println("многомерный массив: " + twoD[2][1]);

        int[][] grades = {
                {98,90,95}, // 1
                {85,76,80}, // 2
                {50,40,20} // 3
        };

        System.out.println("grades: " + grades[2][2]);

    }
}
