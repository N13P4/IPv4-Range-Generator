import java.io.IOException;
import java.io.*;
import java.util.Date;

public class main {

	public static int i1 = 0;
	public static int i2 = 0;
	public static int i3 = 0;
	public static int i4 = 0;
	public static double b = 0.000015;
	public static String ii;
	public static long start = new Date().getTime();
	public static long runningTime = new Date().getTime() - start;

	public static void main(String[] args) throws IOException {

		genIP();
		
	}

	public static void genIP() throws IOException {
		FileWriter fw = new FileWriter("IPv4_list_all.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (int l = 0; l <= 255; l++) {
			i3 = 0;
			i4 = 0;
			i2 = 0;
			System.out.println(
					ii + "    Running for: " + ((runningTime = new Date().getTime() - start) / 1000) / 60 + " Minutes");
			for (int o = 0; o <= 255; o++) {
				i3 = 0;
				i4 = 0;
				for (int m = 0; m <= 255; m++) {
					i4 = 0;
					for (int k = 0; k <= 255; k++) {

						ii = i1 + "." + i2 + "." + i3 + "." + i4;
						i4++;
						bw.write(ii + "\n");
						// System.out.println(ii);
					}
					i3++;
				}
				i2++;
			}
			i1++;
		}
		bw.close();

	}

}
