package ui;

public class TestCases {
	String [][] small;
	String [][] medium;
	String [][] big;
	
	public TestCases() {
		createSmall();
		createMedium();
		createBig();
	}
	private void createBig() {
		String[][] big = 
			{
					{"S", "O", "T", "A", "N", "0", " ", 
						"O", "R", "C", "A", " ",
						"A", "S", "A"
					},
					{"I", " ", 
					 "U", "S", "A", "R", "A", "N", " ",
					 "A", "M", "A","N","A","L"
					 },
					{"L", "T", " ", " ", " ",
				     "O", "R", "D", "E", "N", "A", "R", " ", " ", "A"}
		};
		this.big = big;
		
	}
	private void createMedium() {
		String[][] medium = 
			{
					{"c", "a", "r", "r", "o", " "},
					{" ", "r", " ", "a", " ", " "},
					{"a", "t", "r", "o", "j", "o"},
					{"s", "i", "l", "o", " ", " "},
					{" ", "c", " ", " ", " ", " "},
					{"b", "o", "r", "d", "e", "s"}
		};
		this.medium = medium;
	}
	private void createSmall() {
		String[][] small = 
			{
					{"a", "n", "a", " "},
					{" ", "o", "l", "a"},
					{"a", "t", "a", "r"},
					{" ", "a", " ", "o"}
		};
		this.small = small;
		
	}
	public String[][] getSmall() {
		return small;
	}
	public void setSmall(String[][] small) {
		this.small = small;
	}
	public String[][] getMedium() {
		return medium;
	}
	public void setMedium(String[][] medium) {
		this.medium = medium;
	}
	public String[][] getBig() {
		return big;
	}
	public void setBig(String[][] big) {
		this.big = big;
	}
	
	

}
