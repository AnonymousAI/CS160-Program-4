import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.ArrayList;

public class MedianFilter {
	private BufferedImage filteredImage;
	private BufferedImage[] images;
	
	//Base constructor
	public MedianFilter() {
		
	}
	
	//Constructor with array of names of the noisy images
	//Overloaded Constructor
	public MedianFilter(String[] imageInputFilenames) {
		
	}
	
	//Opens and reads in an image file
	public BufferedImage readImage(File imageFile) {
		
	}
	
	//Gets the median value for all pixels and returns the filtered noiseless image
	public BufferedImage removeNoise() {
		
	}
	
	//Returns the median value of the pixel(x,y) for all images
	public int getMedianValue(ArrayList pixels) {
		
	}
	
	//Writes filteredImage to the outputFilename jpg file. Returns 0 if successful, or -1 if an exception was thrown.
	public int writeImage(String outputFilename) {
		
	}
	
	//Returns height (y-dimension) of filteredImage
	public int getHeight() {
		
	}
	
	//Returns width (x-dimension) of filteredImage
	public int getWidth() {
		
	}
}
