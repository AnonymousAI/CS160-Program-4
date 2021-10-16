
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fileNames = {
				"Images/veg1.jpg",
				"Images/veg2.jpg",
				"Images/veg3.jpg",
				"Images/veg4.jpg",
				"Images/veg5.jpg",
				"Images/veg6.jpg",
				"Images/veg7.jpg",
				"Images/veg8.jpg",
		};
		
		MedianFilter medianFiles = new MedianFilter(fileNames);
		
		medianFiles.removeNoise();
		System.out.println(medianFiles.writeImage("jpg"));
	}

}
