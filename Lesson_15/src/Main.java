import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

public class Main {

	public static void main(String[] args) {
		// c://Windows/dir
		File file = 
				new File("/home/telran/Eclipse/workspaces/QA-8H/Lesson_15/",
						"myFile.txt");
		System.out.println(file.length());
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		
		/* записать в файл числа от 0 до 4 ?*/
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			for (int i = 0; i < 5; i++) {
				fw.append(i + "\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.length());
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*for(int i=0; i<5; i++) {
				System.out.println(br.readLine());				
			}
			System.out.println(br.readLine());	*/
			String nextLine = "";
			while((nextLine=br.readLine())!=null) {
				System.out.println(nextLine);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fileSrc = new File("img.jpg");
		
		System.out.println(fileSrc.exists());
		
		File fileDest = new File("newImg.jpg");
		
		// Stream
		
		// fileSrc -> (InputStream) -> Main.java -> (OutputStream) -> fileDest
		try {
			InputStream is = new FileInputStream(fileSrc);
			OutputStream os = new FileOutputStream(fileDest);
			byte[] buffer = new byte[1000];
			int length = 0;
			while((length = is.read(buffer))>0) {
				System.out.println(length);
				os.write(buffer, 0, length);
			}
			// 99 890  -> 99*1000 + 890
			System.out.println(length);
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fileNewDest = new File("fileUtils.jpg");
		
		fileNewDest.delete();
		
		try {
			Files.copy(fileSrc.toPath(), fileNewDest.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Free space - "+fileNewDest.getFreeSpace()
			+" Total space - "+fileNewDest.getTotalSpace()
			+" Usable space - "+fileNewDest.getUsableSpace());
	}

}
