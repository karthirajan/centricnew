package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class PopupPage extends Commonactions{
	
	public PopupPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[1]")
	private WebElement save_and_go_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[2]")
	private WebElement save_and_new_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[3]")
	private WebElement save_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[4]")
	private WebElement cancel_Btn;
	
	@FindBy(xpath="((//span[@data-csi-context-parent=\"centric:\"])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[1]/td[2]/div/div/div[2]/div/input")
	private WebElement season_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent=\"centric:\"])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[2]/td[2]/div/div/div[2]/div/input")
	private WebElement code_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent=\"centric:\"])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[3]/td[2]/div/div/div[2]/div/input")
	private WebElement description_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent=\"centric:\"])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[2]/td[2]/div/div/div[2]/div/input")
	private WebElement brand_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent=\"centric:\"])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[3]/td[2]/div/div/div[2]/div/input")
	private WebElement brand_code_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent=\"centric:\"])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[4]/td[2]/div/div/div[2]/div/input")
	private WebElement brand_description_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[1]/td[2]/div/div/div[3]/input")
	private WebElement style_type_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[2]/td[2]/div/div/div[3]/input")
	private WebElement template_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[3]/td[2]/div/div/div[3]/input")
	private WebElement shape_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[4]/td[2]/div/div/div[3]/input")
	private WebElement theme_code_Value;
	
	@FindBy(xpath="(((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[5]/td[2]/div/div//input)[2]")
	private WebElement sstyle_Value;

	public WebElement getSave_and_go_Btn() {
		return save_and_go_Btn;
	}

	public WebElement getSave_and_new_Btn() {
		return save_and_new_Btn;
	}

	public WebElement getSave_Btn() {
		return save_Btn;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	public WebElement getSeason_Value() {
		return season_Value;
	}

	public WebElement getCode_Value() {
		return code_Value;
	}

	public WebElement getDescription_Value() {
		return description_Value;
	}

	public WebElement getBrand_Value() {
		return brand_Value;
	}

	public WebElement getBrand_code_Value() {
		return brand_code_Value;
	}

	public WebElement getBrand_description_Value() {
		return brand_description_Value;
	}

	public WebElement getStyle_type_Value() {
		return style_type_Value;
	}

	public WebElement getTemplate_Value() {
		return template_Value;
	}

	public WebElement getShape_Value() {
		return shape_Value;
	}

	public WebElement getTheme_code_Value() {
		return theme_code_Value;
	}

	public WebElement getSstyle_Value() {
		return sstyle_Value;
	}
	


}
