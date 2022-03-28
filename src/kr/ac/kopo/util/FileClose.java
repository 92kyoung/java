package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(InputStream is) {

		if(is != null) {
			try {
				is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(OutputStream os) {
		
		if(os != null) {
			try {
				os.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream fis, InputStream is) {
		close(fis);
		close(is);
	}
	
	public static void close(OutputStream fos, OutputStream os) {
		close(fos);
		close(os);
	}
	
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}





