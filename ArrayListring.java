import java.util.ArrayList;

public class ArrayListring {

	public static void main(String[] args) {
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		Mahasiswa.add("HERIANTO");
		Mahasiswa.add("CIMMANK");
		Mahasiswa.add("JAY");
		Mahasiswa.add("CIPPE");
		
		ArrayList<String> Mahasiswa1 = Mahasiswa;
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		Mahasiswa.remove(1);
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		}

	}

