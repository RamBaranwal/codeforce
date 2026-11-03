import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Apartments
 */
public class Apartments {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split("\\s+");
        int mAppli = Integer.parseInt(first[0]);
        int nApp = Integer.parseInt(first[1]);
        int kError = Integer.parseInt(first[2]);

        String[] second = br.readLine().split("\\s+");
        int[] appli = new int[mAppli];
        for(int i = 0; i < mAppli; i++){
            appli[i] = Integer.parseInt(second[i]);
        }

        String[] third = br.readLine().split("\\s+");
        int[] app = new int[nApp];
        for(int i = 0; i < nApp; i++){
            app[i] = Integer.parseInt(third[i]);
        }

        Apartments obj = new Apartments();
        System.out.println(obj.appartmentAssinged(app, appli, kError));
    }

    private int appartmentAssinged(int[] appart, int[] applicant, int maxError){
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(appart);
        Arrays.sort(applicant);
        while (i < appart.length && j < applicant.length) {
            if(appart[i] < applicant[j] - maxError){
                i++;
            }
            else if(appart[i] > applicant[j] + maxError){
                j++;
            }
            else{
                i++;
                j++;;
                count++;
            }
        }
        return count;
    }
}