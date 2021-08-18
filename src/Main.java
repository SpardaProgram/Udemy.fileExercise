import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> p = new ArrayList<>();
		p.add(new Product("TV LED", 1290.99, 1));
		p.add(new Product("Video Game Chair", 350.50, 3));
		p.add(new Product("Iphone X", 900.00, 2));
		p.add(new Product("Samsung Galaxy 9", 850.00, 2));

		List<String> s = new ArrayList<>();
		for (Product i : p) {
			s.add(i.toString());
		}
		String fpath = "C:\\windows\\temp";
		new File(fpath + "\\out").mkdir();
		String path = "C:\\windows\\temp\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String i : s) {
				bw.write(i);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}