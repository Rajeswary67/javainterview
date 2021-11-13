package javainterview;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser="safari";
		switch(browser)
		{
		case "safari":
		System.out.println("prints safari");
		String version="90";
		switch(version)
		{
		case "90":
		System.out.println("prints version 90");
	    break;
		case "80":
			System.out.println("prints version 80");
			break;
		
		default:
			break;
		}
		break;
		case "firefox":
			System.out.println("launch ff");
			break;

	//	case "safari":
			//System.out.println("launch safari");
			//break;

		default:
			System.out.println("please pass the right browser...." + browser);
			break;
		}

		String env="QA";
		switch(env.toUpperCase())
		{
		case "QA":
	    System.out.println("its QA environment");
	    break;
		case "DEV":
	    System.out.println("its DEV environment");
		break;
		case "STAGE":
	    System.out.println("its STAGE environment");
		break;
		case "PROD":
		System.out.println("its QA environment");
		break;
		default:
			System.out.println("NO environment");
			break;
		}

        int lakshiv=1000;
        int kethan=1001;
        switch(lakshiv)
        {
        case 1000:
        	System.out.println("prints lakshiv");
        	break;
        case 1001:
        	System.out.println("prints kethan");
        	break;
        	default:
        		System.out.println("prints nothing");
        		break;
        }
	}
        }
        
