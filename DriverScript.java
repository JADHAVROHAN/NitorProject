package executionEngine;
import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {

    public static void main(String[] args) throws Exception {
       	String sPath = "D://DataEngine.xlsx";
    	
    	ExcelUtils.setExcelFile(sPath, "Test Steps");

    	 for (int iRow=1;iRow<=9;iRow++){
		    
    		String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

    		
    		if(sActionKeyword.equals("openBrowser")){
                       
    			ActionKeywords.openBrowser();}
    		else if(sActionKeyword.equals("navigate")){
    			ActionKeywords.navigate();}
    		else if(sActionKeyword.equals("click_MyAccount")){
    			ActionKeywords.click_MyAccount();}
    		else if(sActionKeyword.equals("input_Username")){
    			ActionKeywords.input_Username();}
    		else if(sActionKeyword.equals("input_Password")){
    			ActionKeywords.input_Password();}
    		else if(sActionKeyword.equals("click_Login")){
    			ActionKeywords.click_Login();}
    		else if(sActionKeyword.equals("waitFor")){
    			ActionKeywords.waitFor();}
    		else if(sActionKeyword.equals("click_Logout")){
    			ActionKeywords.click_Logout();}
    		else if(sActionKeyword.equals("closeBrowser")){
    			ActionKeywords.closeBrowser();}

    		}
    	}
 }