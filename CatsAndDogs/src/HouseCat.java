/*
 * Written By Bradley Grose
 */


public class HouseCat extends Cat{

	private String type;
			
			//Constructors
			public HouseCat()
			{
				this.type = "none yet";
			}
			public HouseCat(String aName, double aWeight, mood aMood, String aType)
			{
				super(aName, aWeight, aMood);
				setType(aType);
			}
			
			//Setters
			
			public void setType(String aType)
			{
				aType = aType.toUpperCase();
				switch (aType) {
				case "SHORT HAIR":
					this.type = "SHORT HAIR";
					break;
				case "BOMBAY":
					this.type = "BOMBAY";
					break;
				case "RAGDOLL":
					this.type = "RAGDOLL";
					break;
				case "SPHINX":
					this.type = "TYPE SPHINX";
					break;
				case "SCOTTISH FOLD":
					this.type = "SCOTTISH FOLD";
					break;
				default:
					System.out.println("This is not a valid type.");
					break;
				}
			}
			
			//Getters
			public String getType()
			{
				return this.type;
			}
			
			//other methods
			
			public String toString()
			{
					
				return super.toString()+" Type: "+getType();
			}
			
			public boolean equals(HouseCat aCat)
			{
				return aCat != null &&
						super.equals(aCat) &&
						this.type == aCat.getType();
			}
	}

