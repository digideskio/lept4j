package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : pix.h:14</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Pix extends Structure {
	/**
	 * width in pixels<br>
	 * C type : l_uint32
	 */
	public int w;
	/**
	 * height in pixels<br>
	 * C type : l_uint32
	 */
	public int h;
	/**
	 * depth in bits (bpp)<br>
	 * C type : l_uint32
	 */
	public int d;
	/**
	 * number of samples per pixel<br>
	 * C type : l_uint32
	 */
	public int spp;
	/**
	 * 32-bit words/line<br>
	 * C type : l_uint32
	 */
	public int wpl;
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	public int refcount;
	/**
	 * image res (ppi) in x direction<br>
	 * C type : l_int32
	 */
	public int xres;
	/**
	 * image res (ppi) in y direction<br>
	 * C type : l_int32
	 */
	public int yres;
	/**
	 * input file format, IFF_*<br>
	 * C type : l_int32
	 */
	public int informat;
	/**
	 * special instructions for I/O, etc<br>
	 * C type : l_int32
	 */
	public int special;
	/**
	 * text string associated with pix<br>
	 * C type : char*
	 */
	public Pointer text;
	/**
	 * colormap (may be null)<br>
	 * C type : PixColormap*
	 */
	public net.sourceforge.lept4j.PixColormap.ByReference colormap;
	/**
	 * the image data<br>
	 * C type : l_uint32*
	 */
	public IntByReference data;
	public Pix() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("w", "h", "d", "spp", "wpl", "refcount", "xres", "yres", "informat", "special", "text", "colormap", "data");
	}
	public Pix(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends Pix implements Structure.ByReference {
		
	};
	public static class ByValue extends Pix implements Structure.ByValue {
		
	};
}
