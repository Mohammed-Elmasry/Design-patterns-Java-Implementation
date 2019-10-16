public class ChristmaxLightTest {
	public static void main(String[] args){
		ChristmasLight[] lights = {new ChristmasLight(),
									new ChristmasLight(),
									new ChristmasLight()};
		
		lights[0].color = "green";
		lights[1].color = "red";
		lights[2].color = "blue";
		
		//could be accessed directly from class name
		
		ChristmasLight.isLit = true;
		
		//or could be through an instance
		for(int i = 0; i < lights.length; i++){
			System.out.println("The " + lights[i].color + " light is ");
			if(!lights[i].isLit)System.out.println("NOT ");
			System.out.println("lit.");
		}
		
		//if static var changes, it affects all instances
		lights[1].isLit = false;
		//display the effect of last line
		for(int i = 0; i < lights.length; i++){
			System.out.println("The " + lights[i].color + " light is ");
			if(!lights[i].isLit)System.out.println("NOT ");
			System.out.println("lit.");
		}
	}
}