package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class FormSummary  extends AbstractComponent{
	static WebDriver driver;
	public FormSummary(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Form Summary')]")
	@CacheLookup
	WebElement FormSummary;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/select[1]")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/select[1]")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/i[1]")
	@CacheLookup
	WebElement DocumentView;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]/i[1]")
	@CacheLookup
	WebElement DocumentDownload;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/i[1]")
	@CacheLookup
	WebElement DocumentDelete;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSubId;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[9]/button[1]/img[1]")
	@CacheLookup
	WebElement ViewDocuments;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[8]/button[1]/img[1]")
	@CacheLookup
	WebElement UploadDocument;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[7]/button[1]/i[1]")
	@CacheLookup
	WebElement button3;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[6]/button[1]/img[1]")
	@CacheLookup
	WebElement ClosedQuery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[5]/button[1]/img[1]")
	@CacheLookup
	WebElement OpenQuery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/button[1]/i[1]")
	@CacheLookup
	WebElement DownloadPdf;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[5]/div[1]/div/div/div[2]/div/span[3]/span")
	@CacheLookup
	WebElement FormQuery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]/span[1]/i[1]")
	@CacheLookup
	WebElement FormSave;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/i[1]")
	@CacheLookup
	WebElement Verify;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[10]/button[1]/i[1]")
	@CacheLookup
	WebElement Archive;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/span[3]/i[1]")
	@CacheLookup
	WebElement Sign;
	
	//sign err
	
	@FindBy(xpath = "//span[contains(text(),'Please enter a valid email id')]")
	@CacheLookup
	WebElement err1;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter your password')]")
	@CacheLookup
	WebElement err2;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/span[2]/span[1]/i[1]")
	@CacheLookup
	WebElement PageQuery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/span[1]/span[1]/i[1]")
	@CacheLookup
	WebElement Save;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[4]/input")
	@CacheLookup
	WebElement QuerySubject;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[5]/textarea")
	@CacheLookup
	WebElement QueryMessage;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[6]/select")
	@CacheLookup
	WebElement Priority;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[7]/div[1]/input[1]")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[7]/div/div[2]/ul/li[1]")
	@CacheLookup
	WebElement RoleName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[7]/div/span[2]")
	@CacheLookup
	WebElement RoleNameClose;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement Recipients;
	
	@FindBy(xpath = "//*[@id=\"printcontent\"]/div/div[2]/div[3]/div[2]/div/div/div[3]/ul/li[1]")
	@CacheLookup
	WebElement RecipientName;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/span[2]")
	@CacheLookup
	WebElement RecipientClose;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit1;
	
	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement Clear1;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/div/div/label/input")
	@CacheLookup
	WebElement SendAnEmailAlert;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement Clear;
	
	@FindBy(xpath = "//button[contains(text(),'Upload')]")
	@CacheLookup
	WebElement upload;
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]/i[1]")
	@CacheLookup
	WebElement OpenQueryView;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement OpenQueryViewForm;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement OpenQueryExportPdf;
	
	@FindBy(xpath = "//*[@id=\"printcontent\"]/div/div[2]/div[3]/div[2]/div/div/div[1]/div")
	@CacheLookup
	WebElement OpenQueryRecipients;
	
	@FindBy(xpath = "//*[@id=\"printcontent\"]/div/div[2]/div[3]/div[2]/div/div/div[3]/ul/li[1]")
	@CacheLookup
	WebElement OpenQueryRecipientName;
	
	@FindBy(xpath = "//*[@id=\"printcontent\"]/div/div[2]/div[3]/div[2]/div/div/span")
	@CacheLookup
	WebElement OpenQueryRecipientClose;
	
	@FindBy(xpath = "//*[@id=\"printcontent\"]/div/div[2]/div[3]/div[3]/div[1]/textarea")
	@CacheLookup
	WebElement OpenQueryReply;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/button[1]/img[1]")
	@CacheLookup
	WebElement Reply;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/button[1]/img[1]")
	@CacheLookup
	WebElement Close;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div[3]/button[1]/img[1]")
	@CacheLookup
	WebElement ReplyAndClose;
	
	//error_form query
	
	@FindBy(xpath = "//span[contains(text(),'Please enter query subject')]")
	@CacheLookup
	WebElement Qerr1;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter query message')]")
	@CacheLookup
	WebElement Qerr2;
	
	@FindBy(xpath = "//span[contains(text(),'Please select role')]")
	@CacheLookup
	WebElement Qerr3;
	
	@FindBy(xpath = "//span[contains(text(),'Please select recipient')]")
	@CacheLookup
	WebElement Qerr4;
	
	//page query_negative
	
	@FindBy(xpath = "//span[contains(text(),'Please enter query subject')]")
	@CacheLookup
	WebElement Qerr5;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter query message')]")
	@CacheLookup
	WebElement Qerr6;
	
	@FindBy(xpath = "//span[contains(text(),'Please select role')]")
	@CacheLookup
	WebElement Qerr7;
	
	@FindBy(xpath = "//span[contains(text(),'Please select recipient')]")
	@CacheLookup
	WebElement Qerr8;
	
	@FindBy(xpath = "//span[contains(text(),'Please select a file')]")
	@CacheLookup
	WebElement Uploaderr1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement signEmail;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement SignPassword;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement SignConfirm;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[5]/input")
	@CacheLookup
	WebElement PageQuerySubject;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[6]/textarea")
	@CacheLookup
	WebElement PageQueryMessage;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[7]/select")
	@CacheLookup
	WebElement PagePriority;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[8]/div/input")
	@CacheLookup
	WebElement PageRole;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[8]/div/div[2]/ul/li[1]")
	@CacheLookup
	WebElement PageRoleName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[8]/div/span[2]")
	@CacheLookup
	WebElement PageRoleNameClose;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/div/input")
	@CacheLookup
	WebElement PageRecipients;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/div/div[2]/ul/li[1]")
	@CacheLookup
	WebElement PageRecipientName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/div/span[2]")
	@CacheLookup
	WebElement PageRecipientClose;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement PageSubmit1;
	
	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement PageClear1;
	
	@FindBy(xpath = "//span[contains(text(),'Please select a file')]")
	@CacheLookup
	WebElement documenterr1;
	
	public String pageerr1()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String pageerr2()
	{
		elementWait(err2);
		return err2.getText();
	}
	
	public String documenterr1()
	{
		elementWait(documenterr1);
		return documenterr1.getText();
	}
	
	public String QErr1()
	{
		elementWait(Qerr1);
		return Qerr1.getText();
	}
	
	public String QErr2()
	{
		elementWait(Qerr2);
		return Qerr2.getText();
	}
	
	public String QErr3()
	{
		elementWait(Qerr3);
		return Qerr3.getText();
	}
	
	public String QErr4()
	{
		elementWait(Qerr4);
		return Qerr4.getText();
	}
	
	public String QErr5()
	{
		elementWait(Qerr5);
		return Qerr5.getText();
	}
	
	public String QErr6()
	{
		elementWait(Qerr6);
		return Qerr6.getText();
	}
	
	public String QErr7()
	{
		elementWait(Qerr7);
		return Qerr7.getText();
	}
	
	public String QErr8()
	{
		elementWait(Qerr8);
		return Qerr8.getText();
	}
	
	public void clickFormSummary() throws InterruptedException
	{
		FormSummary.click();
		Thread.sleep(3000);
	}
	
	public void searchSiteCode(String sitecode)
	{
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(sitecode);
	}
	
	public void searchSubId(String subId)
	{
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(subId);
	}
	
	public void searchVisitName(String visitname) throws InterruptedException
	{
		Thread.sleep(2000);
		VisitName.sendKeys(visitname);
	}
	
	public void searchStat(String stat)
	{
		Select sel=new Select(Status);
		sel.selectByVisibleText(stat);
	}
	
	public void ClickSearch()
	{
		Search.click();
	}
	
	public Boolean siteCodeSearchValidation(String sitecode) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableSiteCode.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSiteCode.size();i++)
			{
				String stat=tableSiteCode.get(i).getText();
				if (!(stat.contains(sitecode))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean subjectIdSearchValidation(String subid) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableSubId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSubId.size();i++)
			{
				String stat=tableSubId.get(i).getText();
				if (!(stat.contains(subid))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitNameSearchValidation(String visitName) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableVisitName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitName.size();i++)
			{
				String stat=tableVisitName.get(i).getText();
				if (!(stat.contains(visitName))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean statusSearchValidation(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableStatus.size();i++)
			{
				String stat=tableStatus.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void view(String vname) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			String visitlist=tableVisitName.get(i).getText();
			if(visitlist.contains(vname))
			{
				tableView.get(i).click();
				Thread.sleep(8000);
				break;
			}
		}
	}
	
	public void viewDocuments() throws InterruptedException
	{
		ViewDocuments.click();
		Thread.sleep(5000);
		DocumentView.click();
		Thread.sleep(3000);		
	}
	
	public void downloadDocuments() throws InterruptedException
	{
		ViewDocuments.click();
		Thread.sleep(5000);
		DocumentDownload.click();
		Thread.sleep(3000);		
	}
	
	public void deleteDocuments() throws InterruptedException
	{
		ViewDocuments.click();
		Thread.sleep(5000);
		DocumentDelete.click();
		Thread.sleep(3000);		
	}
	
	public void uploadDocuments() throws InterruptedException
	{
		UploadDocument.click();
		Thread.sleep(5000);
		upload.click();
		Thread.sleep(3000);		
	}
	
	public void downloadpdf() throws InterruptedException
	{
		DownloadPdf.click();
		Thread.sleep(3000);	
	}
	
	public void formQuery(String pr) throws InterruptedException
	{
		FormQuery.click();
		Thread.sleep(5000);	
		QuerySubject.sendKeys("Query subject");
		Thread.sleep(3000);	
		QueryMessage.sendKeys("Query message");
		Thread.sleep(3000);	
		Select sitecode=new Select(Priority);
		sitecode.selectByVisibleText(pr);
		Thread.sleep(3000);	
		Role.click();
		Thread.sleep(3000);	
		RoleName.click();
		Thread.sleep(3000);	
		RoleNameClose.click();
		Thread.sleep(3000);
		Recipients.click();
		Thread.sleep(3000);
		RecipientName.click();
		Thread.sleep(3000);
		RecipientClose.click();
		Thread.sleep(3000);
		Submit1.click();	
	}
	
	public void pageQuery(String pr) throws InterruptedException
	{
		PageQuery.click();
		Thread.sleep(3000);	
		PageQuerySubject.sendKeys("Query subject");
		Thread.sleep(3000);	
		PageQueryMessage.sendKeys("Query message");
		Thread.sleep(3000);	
		Select sitecode=new Select(PagePriority);
		sitecode.selectByVisibleText(pr);
		Thread.sleep(3000);	
		PageRole.click();
		Thread.sleep(3000);	
		PageRoleName.click();
		Thread.sleep(3000);	
		PageRoleNameClose.click();
		Thread.sleep(3000);
		PageRecipients.click();
		Thread.sleep(3000);
		PageRecipientName.click();
		Thread.sleep(3000);
		PageRecipientClose.click();
		Thread.sleep(3000);
		Submit1.click();
	}
	
	public void OpenQueryViewform() throws InterruptedException
	{
		OpenQuery.click();
		Thread.sleep(3000);	
		OpenQueryView.click();
		Thread.sleep(3000);	
		OpenQueryViewForm.click();
		Thread.sleep(3000);			
	}
	
	public void OpenQueryExportPdf() throws InterruptedException
	{
		OpenQuery.click();
		Thread.sleep(3000);	
		OpenQueryView.click();
		Thread.sleep(3000);	
		OpenQueryExportPdf.click();
		Thread.sleep(3000);			
	}
	
	public void archive() throws InterruptedException
	{
		Archive.click();
		Thread.sleep(3000);			
	}
	
	public void OpenQueryReply() throws InterruptedException
	{
		OpenQuery.click();
		Thread.sleep(3000);	
		OpenQueryView.click();
		Thread.sleep(3000);	
		OpenQueryRecipients.click();
		Thread.sleep(3000);	
		OpenQueryRecipientName.click();
		Thread.sleep(3000);	
		//OpenQueryRecipientClose.click();
		//Thread.sleep(3000);	
		OpenQueryReply.sendKeys("NA");	
		Reply.click();
	}
	
	public void OpenQueryClose() throws InterruptedException
	{
		OpenQuery.click();
		Thread.sleep(3000);	
		OpenQueryView.click();
		Thread.sleep(3000);	
		OpenQueryRecipients.click();
		Thread.sleep(3000);	
		OpenQueryRecipientName.click();
		Thread.sleep(3000);	
		//OpenQueryRecipientClose.click();
		//Thread.sleep(3000);	
		OpenQueryReply.sendKeys("NA");	
		Close.click();
	}
	
	public void OpenQueryReplyAndClose() throws InterruptedException
	{
		OpenQuery.click();
		Thread.sleep(3000);	
		OpenQueryView.click();
		Thread.sleep(3000);	
		OpenQueryRecipients.click();
		Thread.sleep(3000);	
		OpenQueryRecipientName.click();
		Thread.sleep(3000);	
		//OpenQueryRecipientClose.click();
		//Thread.sleep(3000);	
		OpenQueryReply.sendKeys("NA");	
		ReplyAndClose.click();
	}
	
	public void closedquery() throws InterruptedException
	{
		ClosedQuery.click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]/i[1]")).click();
		Thread.sleep(3000);
	}
	
	public void verify() throws InterruptedException
	{
		Verify.click();
		Thread.sleep(3000);
	}
	
	public void sign() throws InterruptedException
	{
		Sign.click();
		Thread.sleep(3000);
		signEmail.sendKeys("neethumolp@datamatica.uk");
		Thread.sleep(3000);
		SignPassword.sendKeys("Richu@1234");
		Thread.sleep(3000);
		SignConfirm.click();
		Thread.sleep(3000);
	}
	
	public void PageSave() throws InterruptedException
	{
		Save.click();
		Thread.sleep(3000);
	}
	
	public void formQuery_Negative() throws InterruptedException
	{
		FormQuery.click();
		Thread.sleep(3000);
		Submit1.click();
		Thread.sleep(3000);
	}
	
	public void pageQuery_Negative() throws InterruptedException
	{
		PageQuery.click();
		Thread.sleep(3000);
		Submit1.click();
		Thread.sleep(3000);
	}
	
	public void sign_Negative2() throws InterruptedException
	{
		Sign.click();
		Thread.sleep(3000);
		signEmail.sendKeys("neethup@datamatica.uk");
		SignConfirm.click();
		Thread.sleep(3000);
	}
	
	public void sign_Negative1() throws InterruptedException
	{
		Sign.click();
		Thread.sleep(3000);
		SignConfirm.click();
		Thread.sleep(3000);
	}
	
	public void OpenQueryReply_Negative() throws InterruptedException
	{
		OpenQuery.click();
		Thread.sleep(3000);
		OpenQueryView.click();
		Thread.sleep(3000);
		OpenQueryReply.sendKeys("NA");
		Reply.click();
		Thread.sleep(3000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
			alert1.accept();
			Thread.sleep(5000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Document deleted successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Query generated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to send this message?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to close the query?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert5() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to send this message and close this query?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert6() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to sign this form?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("This signature is equivalent to wet ink signature"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	
	public static boolean Alert7() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("From verified successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert8() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this form?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Form archived successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert9() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Status of some of the fields are not validated or incorrect. Do you want to verify this form?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("From verified successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert10() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a recipient"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	

}
