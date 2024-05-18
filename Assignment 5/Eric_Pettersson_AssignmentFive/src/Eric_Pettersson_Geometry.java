public class Eric_Pettersson_Geometry {
	public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
  	public static double CalcluateCircleArea(double radius) {
  		if (radius >= 0) {
  	  		return Math.PI * radius *radius;
  		}
  		else {
  			System.out.println(
  				ANSI_RED +
  				"ERROR CalcluateCircleArea: Negative values cannot be used, illegal input" +
  				ANSI_RESET);
  			return radius;
  		}
 	}
 
   	public static double CalculateRectangleArea(double length, double width) {
   		if (length > 0 && width > 0) {
  			return length * width;
   		}
   		else if (!(length > 0))  {
  				System.out.println(
  					ANSI_RED + 
  					"ERROR CalculateRectangleArea: Negative values cannot be " + 
  					"used, illegal input Length" +
  					ANSI_RESET);
  				return length;
  			}
   		else {
  				System.out.println(
  					ANSI_RED + 
 					"ERROR CalculateRectangleArea: Negative values cannot be " + 
  					"used, illegal input Width" +
  					ANSI_RESET);
  				return width;
  			}
  		}
  
   	public static double CalculateTriangleArea(double base, double height) {
   		if (base >= 0 && height >= 0)	{
   	 		return base * height * .5;
   		}
   		else if (!(base >= 0))  {
  			System.out.println(
  				ANSI_RED +
  				"ERROR CalculateTriangelArea: Negative values cannot be " + 
  				"used, illegal input Base" +
  				ANSI_RESET);
  			return base;
  		}
   		else	{
  			System.out.println(
  				ANSI_RED +
  				"ERROR CalculateTriangelArea: Negative values cannot be " + 
  				"used, illegal input Height" +
  				ANSI_RESET);
  			return height;
  			
  		}
  	}
}

