import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MedianFilter {
	private BufferedImage filteredImage;
	private BufferedImage[] images;
	
	private int arrLen;
	
	//Base constructor
	public MedianFilter() {
		
	}
	
	//Constructor with array of names of the noisy images
	//Overloaded Constructor
	public MedianFilter(String[] imageInputFilenames) {
		arrLen = imageInputFilenames.length;
		images = new BufferedImage[arrLen];
		
		
	}
	
	//Opens and reads in an image file
	public BufferedImage readImage(File imageFile) {
		return ImageIO.read(imageFile);
	}
	
	//Gets the median value for all pixels and returns the filtered noiseless image
	
	//TO DO: Make code your own!!!!!!!!
	public BufferedImage removeNoise() {
		filteredImage = new BufferedImage(images[0].getWidth(), images[0].getHeight(), BufferedImage.TYPE_INT_RGB);
		for(int y = 0; y < images[0].getHeight(); y++) {
			for(int x = 0; x < images[0].getWidth(); x++) {
				//fillRGBValues(x, y, rgbList);
				addToRGBList(x, y, rgbList);
				int medianPixel = getMedianValue(rgbList);
				filteredImage.setRGB(x, y, medianPixel);
			}
		}
		
		return filteredImage;
	}
	
	//Returns the median value of the pixel(x,y) for all images
	public int getMedianValue(ArrayList pixels) {
		
	}
	
	//SELF MADE Method. IDK what arr[] is supposed to be
	public void addToRGBList(int x, int y, int arr[]) {
		
	}
	
	//Writes filteredImage to the outputFilename jpg file. Returns 0 if successful, or -1 if an exception was thrown.
	
	//TO DO: Make code your own!!!!!!!!
	public int writeImage(String outputFilename) {
		try{
			File outputFile = new File("output.jpg");
			ImageIO.write(filteredImage, outputFilename, outputFile);
			return 1;
		} catch(IOException e) {
			return -1;
		}
	}
	
	//Returns height (y-dimension) of filteredImage
	public int getHeight() {
		return filteredImage.getHeight();
	}
	
	//Returns width (x-dimension) of filteredImage
	public int getWidth() {
		return filteredImage.getWidth();
	}
}
