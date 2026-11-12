import java.io.File;
import java.util.Scanner;

public class DirectorySize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();
        
        File dir = new File(path);
        
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Error: Directory does not exist.");
        } else {
            long totalBytes = getSize(dir);
            
            System.out.println("\nTotal Size:");
            System.out.println(totalBytes + " bytes");
            System.out.println((totalBytes / 1024.0) + " KB");
            System.out.println((totalBytes / (1024.0 * 1024.0)) + " MB");
        }
        scanner.close();
    }

    public static long getSize(File dir) {
        long size = 0;
        File[] files = dir.listFiles();
        
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    size += f.length();
                } else if (f.isDirectory()) {
                    long subDirSize = getSize(f);
                    size += subDirSize;
                    System.out.println("Subdirectory: " + f.getName() + " | Size: " + subDirSize + " bytes");
                }
            }
        }
        return size;
    }
}
