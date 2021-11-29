package a_com.java.singletonPattern;

//Enum only instatate only 1 time in life Not able to break using reflection
//only egar loading in this
public enum E_SingletonEnum {
	
	GETINSTANCE ;

	public String  Welcome() {
		return "Singleton!";
	}
}
